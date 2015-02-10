type ap = string
;;

type pf = Vrai
        | Faux
        | Atome of ap
        | Neg of pf
        | Et of pf * pf
        | Ou of pf * pf
;;

let f =Et(Atome "P", Ou(Faux,Et(Vrai,Atome "Q")));;

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

|Atome(a) ->
            print_string a;

;;

let rec affichePF = function
|Et(a,b) ->afficheFormuleV1 a
       ; print_string " ^ "
       ; afficheFormuleV1 b
|Ou(a,b) -> afficheFormuleV1 a
       ; print_string " v "
       ; afficheFormuleV1 b
|Neg(a) -> print_string " non "
       ; afficheFormuleV1 a
| Vrai -> print_string "Vrai"
| Faux -> print_string "Faux"
|Atome(a) -> print_string a
;;

let (valuation1 : ap -> bool) = function
 "P" -> true
|"Q" -> false
|_ -> failwith " Try Again !"
;;

let (valuation2 : ap -> bool) = function
"P" -> true
|"Q" -> true
|_ -> failwith "Try Again !"
;;

let rec (interpretation : pf * (ap -> bool)->bool) = function
  | (Vrai,valuation1) -> true
  | (Faux,valuation1) -> false	
  | (Atome("Q"),valuation1) -> valuation1("Q")
  | (Atome("P"),valuation1) -> valuation1("P")
  | (Atome (_),valuation1) -> failwith " Mauvaise saisie "
  | (Neg(a),valuation1) -> not(interpretation(a,valuation1))
  | (Et(a,b),valuation1) -> (interpretation (a,valuation1))&&(interpretation (b,valuation1))
  | (Ou(a,b),valuation1) -> (interpretation (a,valuation1))||(interpretation (b,valuation1))
;;
