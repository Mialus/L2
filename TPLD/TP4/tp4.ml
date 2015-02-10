let rec etoile = function
n -> if (n>0)
     then (
       print_string "*";
       etoile(n-1)
)
;;

let rec triangle = function
n -> if (n>0)
     then (
     etoile(n);
     print_string "\n";
     triangle(n-1)
)
;;

let rec trianglebis = function
n -> if (n>0)
     then (
     trianglebis(n-1);
     print_string "\n";
     etoile(n)
)
;;

let rec produit = function
n -> if(n>9)
     then (
     (n mod 10)*produit(n/10);
     )
   else(
    n
)
;;

let rec potentiel = function
n -> if(n>9)
    then (
    potentiel(produit(n))
    
    ;
   )
else (1)
;;