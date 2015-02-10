
# Makefile 1
all : exec

./puissance : ./puissance.c
	gcc -o ./puissance ./puissance.c -lm

exec : ./puissance	
	./puissance
	gnuplot scriptGnuplot.gnu
	gimp ./resultat.jpeg &

# Nettoyage des fichiers intermediaires
clean : 
	rm ./tp4; rm ./resultat.jpeg ; 

