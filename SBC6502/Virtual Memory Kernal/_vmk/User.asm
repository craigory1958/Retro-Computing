
		                .segment    "Code"
		                .segment    "Data"
		                .segment    "IO"
		                .segment    "PageZero"
		                .segment    "Stack"

		
						.segment    "Code"
						.org    0xFD00


                        .segment    "Data"
						.org    0x0000 
KIM2_RAM:								    ; 1st 2048 byte segment



						.segment    "PageZero"
						.org    0x0000
MCS650X_PAGE_ZERO:						    ; 1st 256 bytes of memory
										
;MMU_VECTORS:	        .word   0x0000



						.segment    "Stack"
						.org    0x0100
MCS650X_STACK:							    ; 2nd 256 bytes of memory
		

		
						.segment    "IO"
						.org    0x0800  
KIM2_IO:								    ; 2nd 2048 byte segment 


;
; KIM-2 Monitor
;

						.segment    "Code"
KIM2_MONITOR:						


;    
; MMU Configuration 
;

                        ; 2 PID Bits, 20 Virtual Address Bits, 10 Segment Size Bits

NUM_PID_BITS            .equ    1           ; Kernal = 0, User = 1
NUM_VIRTUAL_ADDR_BITS   .equ    20
NUM_PHYSICAL_ADDR_BITS  .equ    16          ; MCS650X has 16 bit address buss
NUM_OFFSET_BITS         .equ    10
NUM_SEGMENT_BITS        .equ    NUM_PHYSICAL_ADDR_BITS - NUM_OFFSET_BITS
NUM_SEGMENT_VECTORS     .equ    1 << NUM_SEGMENT_BITS + NUM_PID_BITS


                        .segment    "IO"
KIM2_MMU:

KIM2_MMU_R0:	        .byte	0x00	    ; Control Register
KIM2_MMU_R1:	        .byte	0x00		; Configuration Register
		
						.align	0x10
KIM2_MMU_VECTORS:				
						.org	* + (NUM_SEGMENT_VECTORS << 1)
KIM2_MMU_VECTORS_END:


						.segment    "Code"
KIM2_RESET:
			
                        ; Initialize MMU ...

                        LDA  	#0x00			; Set boot mode (should already be in boot mode after hardware reset.)
                        STA  	KIM2_MMU_R0
		
@_config               .equ    (NUM_PID_BITS << 6) + (NUM_VIRTUAL_ADDR_BITS -16 << 3) + (NUM_OFFSET_BITS -8 << 0)
                        LDA		#@_config
                        STA  	KIM2_MMU_R1
		
                        ; Clear segment vectors ...

						LDA 	#0x00
						LDX		#NUM_SEGMENT_VECTORS
@_loop:
						STA		KIM2_MMU_VECTORS, X
						STA		KIM2_MMU_VECTORS, X
						DEX
						BNE		@_loop

                        ; Allocate KIM-2 segment vectors ...

                        LDA     #0x00           ; PID (Kernal = 0, User = 1)
                        PSA 
                        LDA     #<KIM2_RAM      ; Physical Address
                        PSA
                        LDA     #>KIM2_RAM
                        PSA
                        LDA     #<0x0000        ; Virtual Segment#
                        PSA
                        LDA     #>0x0000
                        PSA
                        JSR     MUU_MAP_SEGMENT

                        LDA     #0x00           ; PID (Kernal = 0, User = 1)
                        PSA 
                        LDA     #<KIM2_IO       ; Physical Address
                        PSA
                        LDA     #>KIM2_IO
                        PSA
                        LDA     #<0x0000        ; Virtual Segment#
                        PSA
                        LDA     #>0x0000
                        PSA
                        JSR     MUU_MAP_SEGMENT




                        ; 1st write to a vector, stores the low order byte
                        ; 2nd write stores the high order byte

                        LDX     0x00            ; Segment Vector 0 (SV000)
                        LDA     #<KIM2_RAM      ; Page Zero, Stack & RAM
                        STA     KIM2_MMU_VECTORS, X
                        LDA     #>KIM2_RAM | 0b10000000
                        STA     KIM2_MMU_VECTORS, X

                        INX                     ; SV001
                        LDA     #<KIM2_MMU        ; Memory mapped I/O (MMU)
                        STA     KIM2_MMU_VECTORS, X
                        LDA     #>KIM2_MMU | 0b10000000
                        STA     KIM2_MMU_VECTORS, X

                        INX                     ; SV002
                        LDA     #<KIM2_MONITOR        ; KIM-2 ROM
                        STA     KIM2_MMU_VECTORS, X
                        LDA     #>KIM2_MONITOR | 0b10000000
                        STA     KIM2_MMU_VECTORS, X


                        ;
						; MCS650X Interupt Vectors
                        ;
						.org    0xFFFA
		
MCS650X_INTERRUPT_VECTORS:
MCS650X_NMI:  	        .word	0x0000
MCS650X_RST:  	        .word  	KIM2_RESET
MCS650X_IRQ:  	        .word	0x0000
