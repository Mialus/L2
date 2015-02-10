.data

.text

addi $t1, $zero, 0xffff
sw $t1, 0($t0)
lw $v0, 0($t0)
sll $t0, $v0,4
test:
sub $t1,$t0,1
bne $zero,$t0,test