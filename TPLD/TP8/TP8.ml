type ap = string

type pf =
    Vrai
  | Faux
  | Atome of ap
  | Neg of pf
  | Et of pf * pf
  | Ou of pf * pf
  | Barre of pf * pf
;;
let f = Et(Atome("P"), Barre(Faux, Et(Vrai,Atome("Q"))))

let rec affichePFbis = function 
    Vrai -> print_string "Vrai"
  | Faux -> print_string "Faux"
  | Atome x -> print_string x
  | Neg x -> print_string "Non(";
             affichePF x;
             print_string ")";
  | Et (x,y) -> print_string "(";
                affichePFbis x;
                print_string " ^ ";
                affichePFbis y;
                print_string ")";
  | Ou (x,y) -> print_string "(";
                affichePFbis x;
                print_string " v ";
                affichePFbis y;
                print_string ")"
 |  Barre (x,y) -> print_string "(";
                affichePFbis (Neg x);
                print_string " v ";
                affichePFbis (Neg y);

and affichePF = function 
    Vrai -> print_string "Vrai"
  | Faux -> print_string "Faux"
  | Atome x -> print_string x
  | Neg x -> print_string "Non(";
             affichePF x;
             print_string ")"
  | Et (x,y) -> affichePFbis x;
                print_string " ^ ";
                affichePFbis y;
  | Ou (x,y) -> affichePFbis x;
                print_string " v ";
                affichePFbis y
  | Barre (x,y) ->  affichePFbis (Neg x);
                print_string " v ";
                affichePF (Neg y)
;;

let f1 = Ou(Et(Vrai,Faux),Et(Vrai,Et(Faux,Et(Et(Vrai,Vrai),Faux))))

let f2 = Et(Et(Et(Et(Atome("P"),Faux),Ou(Faux,Vrai)),Ou(Ou(Atome("P"),Vrai), Et(Vrai,Atome("Q")))),Vrai)

let rec simplification = function
  Vrai -> print_string "Vrai"
  | Faux -> print_string "Faux"
  | Atome x -> print_string x
  | Neg x -> affichePf x;
             print_string " | ";
             affichePF x;
  | Et (x,y) -> affichePFbis x;
                print_string " ^ ";
                affichePFbis y;
  | Ou (x,y) -> affichePFbis x;
                print_string " v ";
                affichePFbis y
  | Barre (x,y) ->  affichePFbis (Neg x);
                print_string " v ";
                affichePF (Neg y)
;;

let rec compteur = function
 Vrai -> 0
|Faux -> 0
|Atome x -> 0
|Neg x -> compteur(x)+1
|Et(