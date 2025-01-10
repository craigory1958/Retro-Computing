# Single Board Computer for 6502

## with Virtual Memory Kernal and Memory Management Unit

*A lifelong learning experence*

The Single Board Computer for 6502 is an amateur project to explore and understand the computer science topics around multi-tasking operating systems and virtual memory hardware.  
The 6502 processor was chosen for software and hardware simplicity.  And as a nod to the KIM-1 used in my undergraduate work.  
All design decisions lean towards simplicity and implement the minimum needed to research the stated topics.

The Virtual Memory Kernal (VMK) and Memory Management Unit (MMU) will support:

•	Multi-Tasking – More than one process in memory at a time.

•	Preemptive Tasking – Prosses are interrupted to allow other processes access to computer resources.

•	Kernel Mode – Processes may run in a protected mode allowing access to all computing resources.

•	Virtual Memory – Processes are run in a continuous virtual 64KB memory environment.


The Single Board Computer for 6502 (SBC6502) will have the following characteristics:

•	A 20-bit 1MB address space divided into 512KB RAM, 32KB ROM and 16KB memory mapped I/O.

•	The MMU will support up to 4KB virtual memory pages.

•	All primary computer logic (MMU, memory decoding, etc.) will be implemented with 7400 series ICs.

•	Arduinos will be used to implement complex I/O devices such as video and serial communication.
