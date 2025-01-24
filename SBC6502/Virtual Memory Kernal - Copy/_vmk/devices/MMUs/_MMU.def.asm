;
;  Memory Managment Unit (MMU) Definitions
;

MMUv1                  .equ    1
                        
                        
__mmu_declare_type .macro  list, type
                    ${list}
                        
                   .ifndef _mmu_declared
_mmu_declared          .equ    true
                       .if ${type} == MMUv1 -> .include "../devices/MMUs/MMUv1.lib.asm"
                   .endif
                   .list
                   .endmacro
