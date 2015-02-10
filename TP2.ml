type prix = Euro of int
| Yen of int
;;

let prixEnYens = function
Euro x -> 157*x
|Yen x->x
;;

type couleur = Bleu | Vert | Rouge;;

let estCeDuVertprix = function
Vert -> "Oui"
| _ ->"Non"
;;

let max (x,y) =
if x>y
then x
else y
;;

let rec max2 = function
[] -> 0
  | x::l -> 1 + max2 l
;;
