;
; SBC6502 (8K ROM) Definitions
;
                        
SBC6502v1_8K           .equ    1


__arch_declare_type .macro  list, type
;                    ${list}
                        
;                   .ifndef _arch_declared
                       .if ${type} == SBC6502v1_8K -> .include "../archs/SBC6502v1_8K.lib.asm"
;                   .endif
;                   .list
                   .endmacro
