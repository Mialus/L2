.data
	Msg:	.asciiz "Hello World \n"
.text
main:

	addi $v0, $zero, 4	#Sycall 4 afficher une chaine
	la $a0, Msg		#Adresse de la chaine
	syscall			#Afficher maintenant
	#Fin
	addi $v0, $zero, 10
	syscall