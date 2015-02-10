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

(*
  Fonction listeDeValuations
  Cette fonction prend en entrée une liste de propositions atomiques et une
  valuation courante. Elle permet de construire la liste contenant l'ensemble
  des valuations possibles pour la liste de propositions atomiques donnée en
  paramètre.
*)
let rec listeDeValuations lpa vc =
  let wr a i e = (function x -> if x = i then e else a(x))
  in match lpa with
      [] -> vc::[]
    | pa::rpa -> List.append (listeDeValuations rpa (wr vc pa false))
	(listeDeValuations rpa (wr vc pa true))
;;
(*
  Fonction listeValuations
  Cette fonction prend en entrée une liste de propositions atomiques et retourne
  l'ensemble de toutes les valuations possibles pour cette liste de propositions
  atomiques. Ensemble construit à l'aide de la fonction listeDeValautions.
*)
let rec listeValuations lpa =
  let valuationVrai =
    (function 
	 x when List.mem x lpa -> false
       | _ -> failwith "Erreur ...")
  in listeDeValuations lpa valuationVrai
;;


let rec listeDePropositionsAtomiques pf po =
match pf with 
|Vrai -> po
|Faux -> po
|Neg x -> listeDePropositionsAtomiques x po
|Atome x -> if (List.mem x po = false)
            then [x]@po
            else po
|Et(x,y) -> listeDePropositionsAtomiques x (listeDePropositionsAtomiques y po) 
|Ou(x,y) -> listeDePropositionsAtomiques x (listeDePropositionsAtomiques y po) 
;;

let rec affichePremiereLignedebut = function 
[]-> print_string "/" 
|x::l -> print_string x; print_string"    /"
; affichePremiereLignedebut l 
;;

let rec valeurAtome l valuation =
match l with
|[]->()
|[a]-> print_string(string_of_bool(valuation(a)))
;print_string("    //");
|a::q->print_string(string_of_bool(valuation(a)))
;print_string("    /")
;valeurAtome q valuation
;;

let afficheLigne pf l valuation = 
valeurAtome l valuation
;print_string(string_of_bool(interpretation(pf,valuation)))
;;

let rec afficheAutresLignes pf l listeval =
match listeval with
[]->()
|[a]->afficheLigne pf l a 
|a::q->(afficheLigne pf l a);print_string"\n"
; (afficheAutresLignes pf l q)
;;

let rec elimVraiFaux t =
match t with
Neg(Vrai) ->Faux
|Neg(Faux)->Vrai
|Et(x,y)-> (match (elimVraiFaux(x),elimVraiFaux(y))with
|(Faux,_)->Faux
|(_,Faux)->Faux
|(Vrai,x)->x
|(x,Vrai)->x
|(x,y)->Et(x,y)
)
|Ou(x,y)-> (match(elimVraiFaux(x),elimVraiFaux(y)) with
|(Vrai,_)->Vrai
|(_,Vrai)->Vrai
|(Faux,x)->x
|(x,Faux)->x
|(x,y)->Ou(x,y))
|_->t;;


let rec idempotence t= match t with
Vrai->Vrai
|Faux->Faux
|Neg(Vrai) ->Faux
|Neg(Faux)->Vrai
|Ou(x,y)->  if idempotence(x)=idempotence(y) then x else Ou(x,y)
|Et(x,y)->  if idempotence(x)=idempotence(y) then x else Et(x,y)
|_->t
;;
