set xlabel "n"
set ylabel "f(n)"

set title "Comparaison de fonctions"

set terminal jpeg
set output "./resultat.jpeg"


plot 	"./donnee.dat" using 1:2 with lines title 'puissance1' smooth sbezier,\
	"./donnee.dat" using 1:3 with lines title 'puissance2' smooth sbezier,\
	"./donnee.dat" using 1:4 with lines title 'puissance3' smooth sbezier

