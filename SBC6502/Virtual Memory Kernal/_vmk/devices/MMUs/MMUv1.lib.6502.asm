;
; Memory Managment Unit (MMU) Definitions
;

;__mmu_declared          .equ    true
                
                    .macro  __mmu_instantiate(numBitsPID, numBitsVirtualAddr, numBitsPhysicalAddr, numBitsSegmentOffset)

_mmu_NumBitsPID             .equ    numBitsPID
_mmu_NumBitsVirtualAddr     .equ    numBitsVirtualAddr
_mmu_NumBitsPhysicalAddr    .equ    numBitsPhysicalAddr
_mmu_NumBitsSegmentOffset   .equ    numBitsSegmentOffset

_mmu_NumBitsSegmentTag      .equ    numBitsPhysicalAddr - numBitsSegmentOffset
_mmu_NumSegmentTags         .equ    1 << _mmu_NumBitsSegmentTag + numBitsPID
_mmu_ConfigValue            .equ    (numBitsPID << 6) | ((numBitsVirtualAddr - numBitsPhysicalAddr) << 3) | ((numBitsSegmentOffset -8) << 0)


                    .segment    "IO"

    _mmu
    _mmu_R0                 .byte   0x00        ; Control Register
    _mmu_R1                 .byte   0x00        ; Configuration Register        
                            .align  0x04
    _mmu_vectors            
                            .org    * + (_mmu_NumBitsSegmentTag << 1)   ; Allocate 2 bytes for each vector.
    _mmu_vectors_
    _mmu_
 
 
                    .segment    "Data"
   
    _mmu_parms
    _mmu_parms_pid          .byte   0x00
    _mmu_parms_addr         .word   0x0000
    _mmu_parms_effect_addr  .word   0x0000
    _mmu_parms_
                    

                    .segment    "code"
                        
                        ; Initialize MMU...
    _mmu_initialize
                        LDA     #0x00           ; Set boot mode (should already be in boot mode after hardware reset.)
                        STA     _mmu_R0
        
                        LDA     #_mmu_ConfigValue
                        STA     _mmu_R1
        
                        ; Clear segment vectors...

                        LDA     #0x00
                        LDX     #>_mmu_NumSegmentTags
    loop
                        STA     _mmu_vectors, X
                        DEX
                        STA     _mmu_vectors, X
                        DEX
                        BNE     loop
                        RTS        

    _mmu_map_segment
                        RTS

                    .endmacro


                        
                    .macro  __mmu_map_segment(pid, physicalAddress, effectiveAddress)

                        LDA     #pid
                        STA     _mmu_parms_pid
                        
                        LDA     #<physicalAddress
                        STA     _mmu_parms_addr
                        LDA     #>physicalAddress
                        STA     _mmu_parms_addr +1
                        
                        LDA     #<effectiveAddress
                        STA     _mmu_parms_effect_addr
                        LDA     #>effectiveAddress
                        STA     _mmu_parms_effect_addr +1
                         
                        JSR     _mmu_map_segment

                    .endmacro
