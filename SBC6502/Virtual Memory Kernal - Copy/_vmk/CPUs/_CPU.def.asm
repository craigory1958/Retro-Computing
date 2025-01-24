;
; CPU Type Definitions
;

MOS6502                .equ    "MOS6502"
W65C02                 .equ    "W65C02"


__cpu_declare_type .macro  type, list=.nolist
                    ${list}
                        
                   .ifndef _cpu_declared -> .include "../CPUs/" + ${type} + ".lib.asm"

                   .list
                   .endmacro
