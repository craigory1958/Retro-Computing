                  // LOC   CODE         LABEL         INSTRUCTION

0x4C, 0x00, 0x00, // 0000  4C 00 00     HERE          JMP HERE

0xA9, 0xFF,       // 0000  A9 FF                      LDA #$FF
0x8D, 0x05, 0x02, // 0002  8D 05 02                   STA THERE
0xEA,             // 0005  EA           THERE         NOP
