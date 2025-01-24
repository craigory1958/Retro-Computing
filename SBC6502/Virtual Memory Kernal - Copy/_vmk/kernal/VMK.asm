;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                              ;
;                      Virtual Memory Kernal (VMK) v0.0.1                      ;
;                                                                              ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;                   .nolist
                       .include    "VMK.def.asm"
                       .include    "../CPUs/_CPU.def.asm"
                       .include    "../archs/_ARCH.def.asm"
                       .include    "../devices/MMUs/_MMU.def.asm"
;                   .list

                       .__cpu_declare_type MOS6502, list=.nolist
                       .__arch_declare_type .nolist, SBC6502v1_8K
                       .__mmu_declare_type .nolist, MMUv1
        
        
 ;                  .segment    "code"
                       .org    _SBC6502_rom
 ;                  .segment    "data"
                       .org    _SBC6502_ram
 ;                  .segment    "io"
                       .org    _SBC6502_io

;
; Memory Management Unit (MMU) Configutation 
;
            
                        ; 2 PID Bits, 20 Virtual Address Bits, 10 Segment Offset Bits

bitsPID                .equ    2                   ; Kernal = 0, User = 01 thru 11
bitsVirtualAddr        .equ    20                  ; SBC6502 with 20 bit virtual address bus
bitsPhysicalAddr       .equ    16                  ; MCS650X with 16 bit address bus
bitsSegmentOffset      .equ    10                  ; SBC6502 with 10 bit segment size

                       .__mmu_instantiate   .nolist, bitsPID, bitsVirtualAddr, bitsPhysicalAddr, bitsSegmentOffset

;
; SBC6500 Initialization (Power-Up and Reset (RST))
;
;                   .segment    "code"
                    
VMK_RESET
                        LDX     #0xFF        ; Initialize stack pointer
                        TXS
                        
                        JSR     _mmu_initialize
                        
; Allowcate SBC6502 segment vectors for kernal ...

;      Tag        Physical Address         Effective Address
;    xx00.0000 - 0000.00xx.xxxx.xxxx -> 0000.0000.00xx.xxxx.xxxx - RAM (ZP & Stack & RAM)
;    xx00.0001 - 0000.01xx.xxxx.xxxx -> 1110.1111.10xx.xxxx.xxxx - IO
;    xx00.0010 - 0000.10xx.xxxx.xxxx -> 1111.1111.00xx.xxxx.xxxx - ROM
;    xx00.0011 - 0000.11xx.xxxx.xxxx -> 1111.1111.01xx.xxxx.xxxx - ROM
;    xx00.0100 - 0001.00xx.xxxx.xxxx -> 1111.1111.10xx.xxxx.xxxx - ROM
;    xx00.0101 - 0001.01xx.xxxx.xxxx -> 1111.1111.11xx.xxxx.xxxx - ROM
                        
                       .__mmu_map_segment   .nolist, _vmk_kernal_pid, _SBC6502_ram, _SBC6502_effect_ram

                       .__mmu_map_segment   .nolist, _vmk_kernal_pid, _SBC6502_io, _SBC6502_effect_IO

                       .__mmu_map_segment   .nolist, _vmk_kernal_pid, _SBC6502_rom, _SBC6502_effect_rom    

;
; VMK Kernal 
;
;                   .segment    "code"
                    
VMK_KERNAL
                        JMP     VMK_KERNAL

;
; MCS650X Interupt Vectors
;
;                   .segment    "code"
                       .org    0xFFFA
        
    MCS650X_INTERRUPT_VECTORS
    
    MCS650X_NMI        .word   0x0000
    MCS650X_RST        .word   VMK_RESET
    MCS650X_IRQ        .word   0x0000

    MCS650X_INTERRUPT_VECTORS_

                   .end
