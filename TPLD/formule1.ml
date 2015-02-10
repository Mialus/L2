type cpf =
Vrai
| Faux
| Neg of cpf
| Et of cpf * cpf
| Ou of cpf * cpf
;;

let e = Et(Vrai, Ou (Faux,Vrai));;

let rec afficheFormuleV1 = function
Vrai -> print_string "Vrai"
| Faux -> print_string "Faux"
| Et(a,b) -> print_string "("
       ; afficheFormuleV1 a
       ; print_string " ^ "
       ; afficheFormuleV1 b
       ; print_string ")"

|Ou(a,b) -> print_string "("
       ; afficheFormuleV1 a
       ; print_string " v "
       ; afficheFormuleV1 b
       ; print_string ")"

|Neg(a) -> print_string " non "
       ; afficheFormuleV1 a
;;

let rec afficheFormule = function
|Et(a,b) ->afficheFormuleV1 a
       ; print_string " ^ "
       ; afficheFormuleV1 b
|Ou(a,b) -> afficheFormuleV1 a
       ; print_string " v "
       ; afficheFormuleV1 b
|Neg(a) -> print_string " non "
       ; afficheFormule a
| Vrai -> print_string "Vrai"
| Faux -> print_string "Faux"
;;

let e1 = Ou(Et(Vrai,Faux),Et(Vrai,Et(Faux,Et(Et(Vrai,Vrai),Faux))))
let e2 = Et(Ou(Et(Et(Vrai,Faux),Ou(Faux,Vrai)),Ou(Ou(Faux,Vrai),Et(Vrai,Vrai))),Vrai)
let e3 = Ou(Neg(Et(Vrai,Faux)),Et(Vrai,Et(Faux,Et(Et(Vrai,Vrai),Faux))))

let rec evalueFormule = function
  | Vrai -> true
  | Faux -> false
  | Neg(a) -> not(evalueFormule a)
  | Et(a,b) -> (evalueFormule a )&&(evalueFormule b)
  | Ou(a,b) -> (evalueFormule a)||(evalueFormule b)
;;
