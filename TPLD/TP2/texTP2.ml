type prix = Euro of int
| Yen of int
;;

let x =Euro 3;;
let y =Yen 5;;

let prixEnYens = function
Euro x -> 157*x
|Yen x->x
;;

type couleur = Bleu | Vert | Rouge;;

let estCeDuVertprix = function
Vert -> "Oui"
| _ ->"Non"
;;