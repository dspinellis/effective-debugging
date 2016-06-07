_DATA	SEGMENT				; Data area
$SG2748	DB	'%d', 0aH, 00H  	; printf format string
_DATA	ENDS

PUBLIC	_main				; Export main
EXTRN	_printf:PROC			; Import printf

_TEXT	SEGMENT				; Code area
_i$ = -4 				; Stack offset where i is stored
_main	PROC
	push	ebp			; Function entry boilerplate
	mov	ebp, esp
	push	ecx
	mov	DWORD PTR _i$[ebp], 0	; i = 0
	jmp	SHORT $LN3@main		; Jump to loop's end
$LN2@main:				; Loop's top label
	mov	eax, DWORD PTR _i$[ebp]	; Get i into register eax
	add	eax, 1			; Increment by one
	mov	DWORD PTR _i$[ebp], eax	; Store eax back to i
$LN3@main:				; Loop's end label
	cmp	DWORD PTR _i$[ebp], 10 	; Compare i to 10
	jge	SHORT $LN1@main		; If greater or equal 
					; terminate loop
	mov	ecx, DWORD PTR _i$[ebp]	; Get i into register ecx
	push	ecx			; Push ecx as argument to printf
	push	OFFSET $SG2748		; Push printf format string 
					; argument
	call	_printf			; Call printf
	add	esp, 8			; Free pushed printf arguments
	jmp	SHORT $LN2@main		; Jump to loop's top
$LN1@main:				; Loop's exit label
	xor	eax, eax		; Zero eax as main's return value
	mov	esp, ebp		; Function exit boilerplate
	pop	ebp
	ret	0
_main	ENDP
_TEXT	ENDS
END
