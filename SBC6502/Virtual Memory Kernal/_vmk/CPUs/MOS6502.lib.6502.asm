;
; MOS6502 Definitions
;

                    .segment    "ZP"
                       .org     0x0000                  ; 1st 256 bytes of memory
_6502_page_zero                           
                       .org     * +0xFF
_6502_page_zero_

                    .segment    "Stack"
                       .org     0x0100                  ; 2nd 256 bytes of memory
_6502_stack                            
                       .org     * +0xFF
_6502_stack_
