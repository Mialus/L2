type nump = int

type en =
    Nombre of nump
  | Oppose of nump
  | Somme of en list
  | Soustraction of en * en

let rec affichel = function 
  [] -> print_string " "
| [a] ->  affichebis a
| a::l ->affiche a;
         print_string "+";
         affichel l

and affichebis = function 
    Nombre x -> print_int x
  | Oppose x -> print_string "-";
                print_int x;
  | Soustraction (x,y) -> print_string "(";
                affichebis x;
                print_string ",";
                affichebis y;
                print_string ")";
  | Somme l ->  print_string "(";
                affichel l;
                print_string ")";

and affiche = function 
    Nombre x -> print_int x
  | Oppose x -> print_string "-";
                print_int x;
  | Soustraction (x,y) -> affichebis x;
                print_string "-";
                affichebis y;
  | Somme l ->  affichel l

let e1=Soustraction (Somme [Oppose 3; Nombre 6; Nombre 7], Nombre 4);;

let rec supprimer2 = function
  [] -> print_string " "
| [a] ->  affichebis a
| a::l ->supprimer a;
         print_string "-";
         supprimer2 l
;;

let rec supprimer =function
Soustraction(y,Oppose (x))->affichebis y ;
                            print_string "+";
                            print_int x;  
|Nombre x -> print_int x
| Oppose x -> print_string "(-";
                print_int x;
              print_string ")"
| Soustraction (x,y) -> affichebis x;
                print_string "-";
                affichebis y;
| Somme l ->  affichel l
|Soustraction(Somme l,y)-> supprimer2 l;
                           print_string "-";
                           affichebis y;

;;

