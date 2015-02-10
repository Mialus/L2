.data
	memoire: .space 128
.text
	la $a0,memoire
	
	
	addi $a1,$zero,32
	addi $a2,$zero,0xFEFE
	jal initMem
	#addi $a0,$zero,0xB
	#jal forDigit
	#jal toHexString
	
	jal forDigit
	jal toHexString
	addi $v0,$zero,10
	syscall

forDigit:
	add $v0,$a0,'0'
	blt $v0,10,digitFin
	add $v0,$v0,7

digitFin:
	jr $ra
	
toHexString:
	add $t2,$zero,$ra
	jal forDigit
	add $ra,$zero,$t2
	jr $ra

initMem:
	beq $a1,$zero, initMemFin
initMemBoucle:
	sw $a2,0($a0)
	addi $a0,$a0,4
	addi $a1,$a1,-1
	bne $a1,$zero,initMemBoucle
initMemFin: