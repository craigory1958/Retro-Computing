
SET uPfam=6502
IF NOT "%1"=="" SET uPfam=%1

SET uP=MOS6502
IF NOT "%2"=="" SET uP=%2

SET uPver=v3
IF NOT "%3"=="" SET uPver=%3

SET dirVer=v3
IF NOT "%4"=="" SET dirVer=%4

SET exprVer=v1
IF NOT "%5"=="" SET exprVer=%5

SET sourceDir="H:\_cwg-base__Home\Computer Archtecture\Retro Computing\xa\grammers"
SET targetDir="H:\_cwg-base__Home\Computer Archtecture\Retro Computing\xa\__eclipse\xa\target\generated-sources\antlr4"


COPY %sourceDir%\_directives\Directives_%dirVer%.g4 Directives.g4
COPY %sourceDir%\_expressions\Expressions_%exprVer%.g4 Expressions.g4
COPY %sourceDir%\processors\_%uPfam%\%uP%_%uPver%.g4 %uP%_.g4


java org.antlr.v4.Tool  -o %targetDir%\xcom\retro\xa\antlr  -package xcom.retro.xa.antlr  Directives.g4
java org.antlr.v4.Tool  -o %targetDir%\xcom\retro\xa\antlr  -package xcom.retro.xa.antlr  Expressions.g4
java org.antlr.v4.Tool  -o %targetDir%\xcom\retro\xa\antlr\processors\%uP%  -package xcom.retro.xa.antlr.processors.%uP% %uP%_.g4


DEL /Q %targetDir%\*.*
DEL *.g4
