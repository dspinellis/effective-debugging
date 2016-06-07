	.section	.rodata		@ Data area
	.align	2			@ Align on even memory address
.LC0:	.ascii	"%d\012\000"		@ Printf format string
	.text				@ Code area
	.global	main			@ Export main
main:					@ Entry point of main
	stmfd	sp!, {fp, lr}		@ Function entry boilerplate
	add	fp, sp, #4
	sub	sp, sp, #8
	mov	r3, #0			@ Set register r3 to zero
	str	r3, [fp, #-8]		@ Store register r3 into i
	b	.L2			@ Branch to loop's end
.L3:					@ Loop's top label
	ldr	r3, .L4			@ Get printf format address
	mov	r0, r3			@ Set format as first argument
	ldr	r1, [fp, #-8]		@ Set i as second argument
	bl	printf			@ Call printf
	ldr	r3, [fp, #-8]		@ Get i into register r3
	add	r3, r3, #1		@ Increment r3 by one
	str	r3, [fp, #-8]		@ Store register r3 into i
.L2:					@ Loop's end label
	ldr	r3, [fp, #-8]		@ Get i into register r3
	cmp	r3, #9			@ Compare r3 with 9
	ble	.L3			@ If less or equal then 
					@ branch to loops top
	mov	r3, #0			@ Set r3 to zero
	mov	r0, r3			@ Zero r0 as main's return value
	sub	sp, fp, #4		@ Function exit boilerplate
	ldmfd	sp!, {fp, pc}
.L4:	.word	.LC0			@ Address of printf format arg
