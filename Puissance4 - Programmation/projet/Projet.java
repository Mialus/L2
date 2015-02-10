public class Projet {
public static final int N=7;
public static void main(String[]args){

   int l,c,lo,co,i,p,k,q;
   char choix,choix2,choix3,choix4;
   double dist1,dist2,dist3,valeur1,valeur2;
	
      choix2=(char)101;
      Ecran.afficher("Entrer le nombre de la colonne de départ : ");
      c=Clavier.saisirInt();
      Ecran.afficher("Entrer le nombre de la ligne de départ : ");
      l=Clavier.saisirInt();
      choix3='e';
	i=0;

   while((c<0)||(c>N)||(l<0)||(l>N)){

      Ecran.afficher("Erreur, veuillez renouveler votre saisie","\n");
      Ecran.afficher("Entrer le nom de la colonne de départ : ");
      c=Clavier.saisirInt();
      Ecran.afficher("\n","Entrer le nom de la ligne de départ : ");
      l=Clavier.saisirInt();
    }
      
  lo=(int)(Math.random()*(N+1));
  co=(int)(Math.random()*(N+1));
  dist1=(Math.sqrt(Math.pow(co-c,2)+Math.pow(lo-l,2)));
    
   while((c==co)&&(l==lo)){
   
       lo=(int)(Math.random()*(N+1));
       co=(int)(Math.random()*(N+1));
   }
 Ecran.afficher("\n","si vous voulez vous diriger à l'est, taper e, à l'ouest, taper w,","\n","au nord, taper n, au sud, taper s.");
 Ecran.afficher("\n","Pour avancer taper a.");
  dist1=(Math.sqrt(Math.pow(co-c,2)+Math.pow(lo-l,2)));
   
 do{
    Ecran.afficher("\n","\n","Quelle est votre choix ? : ");
    choix=Clavier.saisirChar();
   i=i+1;
	 
    switch(choix){
    
           case 'a' :{
           switch(choix3){
               case 'e' :{
                
              if((c<=N)&&(c>=0)){
                 c=c+1;
               }
             else {
             Ecran.afficher("cela est impossible");
             }
             
           }
         break;
         case 'n' :{
             if((l<=N)&&(l>=0)){
              l=l-1;
             }
	     else {
             Ecran.afficher("cela est impossible");
             }
          }
           break;
           case 's' :{
             if((l<=N)&&(l>=0)){
              l=l+1;
             }
	     else {
             Ecran.afficher("cela est impossible");
             }
           }
           break;
           case 'w' :{
             if((c<=N)&&(c>=0)){
              c=c-1;
           }
	     else {
             Ecran.afficher("cela est impossible");
             }
           break;
          }
        }
	break;
      }
           case 'e' :{5
	    choix3=choix;
	    Ecran.afficher("appuyer sur a pour avancer : ");
	    choix2=Clavier.saisirChar();
                
             if(choix2=='a'){
              if((c<=N)&&(c>=0)){
                 c=c+1;
               }
             else {
             Ecran.afficher("cela est impossible");
             }
             }
           }
	   break;
           case 'n' :{
	   choix3=choix;
	   Ecran.afficher("appuyer sur a pour avancer : ");
           choix2=Clavier.saisirChar();
             
             if(choix2=='a'){
              if((l<=N)&&(l>=0)){
                 l=l-1;
             }
	      else {
             Ecran.afficher("cela est impossible");
             }
           }
          }
           break;
           case 's' :{
	    choix3=choix;
            Ecran.afficher("appuyer sur a pour avancer : ");
           choix2=Clavier.saisirChar();
             
             if(choix2=='a'){
              if((l<=N)&&(l>=0)){
                l=l+1;
             }
	      else {
             Ecran.afficher("cela est impossible");
             }
           }
           }
           break;
           case 'w' :{
	   choix3=choix;
           Ecran.afficher("appuyer sur a pour avancer : ");
           choix2=Clavier.saisirChar();
             
             if(choix2=='a'){
              if((c<=N)&&(c>=0)){
                c=c-1;
             }
	      else {
             Ecran.afficher("cela est impossible");
             }
           }
           }
           break;
          }
	  
       if((co!=c)||(lo!=l)){
	   valeur1=Math.pow((co-c),2);
	   valeur2=Math.pow((lo-l),2);
	   dist2=(Math.sqrt((valeur1+valeur2)));
	   dist3=dist1-dist2;
	   dist1=dist2;
	     if(dist3<0){
		     Ecran.afficher("\n","Objectif plus loin ");
	     }
	     if(dist3==0){
		     Ecran.afficher("\n","Vous n'avez pas bouger ");
	     }
	     if(dist3>0){
		     Ecran.afficher("\n","Objectif plus prés ");
    }
      Ecran.afficher("\n");
      Ecran.afficher("\n","Voulez-vous continuez ? (y/n) : ");
      choix4=Clavier.saisirChar();
      Ecran.afficher("\n","Vous êtes positionné(e) sur la ligne ",l," et la colonne ",c,"\n","Vous êtes orienté vers ");
    
     switch(choix3){
	     
	         case'e':{
			 Ecran.afficher("l'est","\n");
		break;
		 }
		 case'n':{
			 Ecran.afficher("le nord","\n");
		break;
		 }
		 case's':{
			 Ecran.afficher("le sud","\n");
		break;
		 }
		 case'w':{
			 Ecran.afficher("l'ouest","\n");
		break;
		 }
  }
      if(choix4!='y'){
	      Ecran.afficher("L'objectif était sur la ligne ",lo," colonne ",co,"\n");
	      Ecran.afficher("\n");
      }
  }
  
  else {
	  choix4='g';
  }
  }
  while(choix4=='y');
       if(choix4=='g'){
	     Ecran.afficher("Bravo ! Vous avez trouver l'objectif ! vous avez fait ",i," déplacements !","\n");
     }
     else{
	     Ecran.afficher("Vous n'avez pas trouver l'objectif.","\n");
     }
  }
  }
  