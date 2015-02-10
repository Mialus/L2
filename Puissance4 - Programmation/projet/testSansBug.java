public class testSansBug {


// Creation du disque utilisé dans l'affichage de la grille, en prenant compte de la couleur du disque à afficher.
static void disque(int x, int y, int couleur) {
          int i, j;
            int xr, yr;
		switch (couleur) {
			case (-1) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (BLANC)
						EcranGraphique.setColor(255,255,255);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
			case (0) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (ROUGE)
						EcranGraphique.setColor(255,0,0);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
			case (1) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (VERT)
						EcranGraphique.setColor(0,255,0);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
			case (2) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (JAUNE)
						EcranGraphique.setColor(255,255,0);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
			case (3) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (CYAN)
						EcranGraphique.setColor(0,200,255);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
			case (4) : {
				for(i=0;i<=35;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (MAGENTA)
						EcranGraphique.setColor(255,0,200);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
                        case (-2) : {
				for(i=0;i<=15;i++) {
					for(j=0;j<=720;j++) {
						xr = (int)(i*Math.cos(((double)(j/2.0)*Math.PI)/180.0));
						yr = (int)(i*Math.sin(((double)(j/2.0)*Math.PI)/180.0));
						// Affichage de chaque pixel (NOIR)
						EcranGraphique.setColor(0,0,0);
						EcranGraphique.drawPixel(xr+x, yr+y);
					}
				}
			}
			break;
		}
	}

// Affichage du plateau de jeu : Pour chaque valeur  de la matrice, on affiche le disque avec la couleur correspondante.
static void affichagePlateau (int [][] tab) {
	int couleur, x, y, i, j;
		//ouverture de la fenètre, initialisée en bleu avant de colorier les disques :
		EcranGraphique.setClearColor(0,0,255);
		EcranGraphique.init(0,0,740,640,700,600,"PUISSANCE 4");
		// affichage de tous les disques du tableau, selon la couleur et la position (x et y) :
		for(i=0;i<=5;i++) {
			for(j=0;j<=6;j++) {
				couleur=tab[i][j];
				x=40+(100*j);
				y=40+(100*i);
				disque(x,y,couleur);
			}
		}
		EcranGraphique.flush();
	}

// Recherche de la position et Changement de couleur dans la matrice, selon la colonne choisie par le joueur.
static void posPion(int c1,int col,int [][] tab){
	int i,o;
	i=5;
	while( (tab[i][col]!=-1)&&(i>=0)){
            i=i-1;
	}
        
       if( tab[i][col]==-1){
		tab[i][col]=c1;
       }
}

// test si la colonne est pleine.
static boolean testcolFull(int col,int [][] tab){
    int compteur,i;
    boolean res;
    compteur=0;
    res=false;
    for ( i = 0 ; i < 6 ; i = i+1 ) {
      if (tab[i][col]!=-1) {
        compteur++;
      }
    }
    if(compteur==6){
      res=true;
    }
  return res;
}

// test si 4 pions sont alignés en ligne
static boolean testligne(int c1,int [][] tab){
	int i,j,comp,stop;
	boolean res;
	res=false;
	stop=-1;
	for ( i = 0 ; i < 6 ; i = i+1 ) {
		j=0;
		while(j<7){
		comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				j++;
				if (j==7) {
					j=j-1;
					stop=1;
				}
			}    
			if(comp==4){
                          res=true;
                          //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*j)),(40+(100*i)), -2);
                            disque((40+(100*(j-1))),(40+(100*(i))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*(j-1))),(40+(100*(i))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i))), -2);
                            disque((40+(100*(j-4))),(40+(100*(i))), -2);
                          }
                          EcranGraphique.flush();
			}
                        if((tab[i][j]!=c1)&&(stop==-1)){
				j++;
			}
			if(stop==1){
				j=j+1;
			}
		}
	}
return res;
}

// test si 4 pions sont alignés en colonne
static boolean testcolonne(int c1,int [][] tab){
	int i,j,comp,stop;
	boolean res;
	res=false;

	stop=-1;
	for ( j = 0 ; j < 7 ; j++ ) {
		i=0;
		while(i<6){
			comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				i++;
				if (i==6) {
					i=i-1;
					stop=1;
				}
			}
			if(comp==4){
                          res=true;
                        //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*j)),(40+(100*i)), -2);
                            disque((40+(100*j)),(40+(100*(i-1))), -2);
                            disque((40+(100*j)),(40+(100*(i-2))), -2);
                            disque((40+(100*j)),(40+(100*(i-3))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*j)),(40+(100*(i-1))), -2);
                            disque((40+(100*j)),(40+(100*(i-2))), -2);
                            disque((40+(100*j)),(40+(100*(i-3))), -2);
                            disque((40+(100*j)),(40+(100*(i-4))), -2);
                          }
                          EcranGraphique.flush();
			}
                        if((tab[i][j]!=c1)&&(stop==-1)){
				i++;
			}
			if(stop==1){
				i=i+1;
			}
		}
	}
return res;
}

// Test si 4pions sont alignés en diagonale, et en direction du bas.
static boolean testdiagoBas(int c1,int [][] tab){
	int i,j,comp,aux,stop;
	boolean res;
	res=false;
// Partie haut-droit du tableau.
	for ( j = 1 ; j < 7 ; j++ ) {
		aux=j;
		i=0;
                stop=-1;
		while((i<6)&&(j<7)){
			comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				j++;
				i++;
                                if((j==7)&&(i==6)) {
                                  i=i-1;
                                  j=j-1;
                                  stop=2;
                                }
				if ((j==7)&&(i!=6)&&(stop!=2)) {
					j=j-1;
					stop=1;
				}
			}
			if(comp==4){
				res=true;
                                //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*j)),(40+(100*(i-1))), -2);
                            disque((40+(100*(j-1))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i-3))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i-4))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*(j-1))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i-3))), -2);
                            disque((40+(100*(j-4))),(40+(100*(i-4))), -2);
                          }
                          if(stop==2){
                            disque((40+(100*j)),(40+(100*i)), -2);
                            disque((40+(100*(j-1))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i-3))), -2);
                          
                          }
                          EcranGraphique.flush();
			}
                      if((tab[i][j]!=c1)&&(stop==-1)){
				i++;
				j++;
			}
                        if (stop==2){
                          i=i+1;
                          j=j+1;
                        }
                        
			if (stop==1) {
				j=j+1;
			}
			
		}
		j=aux;
	}
// Partie Bas-gauche du tableau.
	for ( i = 0 ; i < 6 ; i++ ) {
		aux=i;
		j=0;
                stop=-1;
		while((i<6)&&(j<7)){
			comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				i++;
				j++;
				if (i==6) {
					i=i-1;
					stop=1;
				}
			}
                      
			if(comp==4){
				res=true;
			 //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*(j-1))),(40+(100*i)), -2);
                            disque((40+(100*(j-2))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j-4))),(40+(100*(i-3))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*(j-1))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i-3))), -2);
                            disque((40+(100*(j-4))),(40+(100*(i-4))), -2);
                          }
                         EcranGraphique.flush();
                        }
                      
                      if((tab[i][j]!=c1)&&(stop==-1)){
				i++;
				j++;
			}
			if (stop==1) {
				i=i+1;
			}
		}
		i=aux;
	}
return res;
}

// Test si 4pions sont alignés en diagonale, et en direction du haut.
static boolean testdiagoHaut(int c1,int [][] tab){
	int i,j,comp,aux,stop;
	boolean res;
	res=false;
// Partie bas-droite du tableau.
	for ( j = 1 ; j < 7 ; j++ ) {
		aux=j;
		i=5;
                stop=-1;
		while((i>-1)&&(j<7)){
			comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				i--;
				j++;
                                if ((j==7)&&(i==-1)){
                                  i=i+1;
                                  j=j-1;
                                  stop=2;
                                }
				if ((j==7)&&(stop!=2)) {
					j=j-1;
					stop=1;
				}
			}
			
			if(comp==4){
				res=true;
                                //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*j)),(40+(100*(i+1))), -2);
                            disque((40+(100*(j-1))),(40+(100*(i+2))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i+3))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i+4))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*(j-1))),(40+(100*(i+1))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i+2))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i+3))), -2);
                            disque((40+(100*(j-4))),(40+(100*(i+4))), -2);
                          }
                          if(stop==2){
                            disque((40+(100*j)),(40+(100*i)), -2);
                            disque((40+(100*(j-1))),(40+(100*(i+1))), -2);
                            disque((40+(100*(j-2))),(40+(100*(i+2))), -2);
                            disque((40+(100*(j-3))),(40+(100*(i+3))), -2);
                          
                          }
                          EcranGraphique.flush();
			}
                        if((tab[i][j]!=c1)&&(stop==-1)){
				i--;
				j++;
			}
                        if (stop==2){
                          i=i-1;
                          j=j+1;
                        }
			if (stop==1) {
				j=j+1;
			}
		}
		j=aux;
	}
// Partie haut-gauche du tableau.
	for ( j = 5 ; j >-1 ; j=j-1 ) {
		aux=j;
		i=0;
                stop=-1;
		while((i<6)&&(j>-1)){
			comp=0;
			while((tab[i][j]==c1)&&(stop==-1)){
				comp++;
				i++;
				j--;
                                if((j==-1)&&(i==6)){
                                  j=j+1;
                                  i=i-1;
                                  stop=2;
                                }
				if ((j==-1)&&(i!=6)&&(stop!=2)) {
					j=j+1;
					stop=1;
				}
			}
			if(comp==4){
                          res=true;
                          //affichage si le joueur gagne.
                          if (stop==1){
                            disque((40+(100*j)),(40+(100*(i-1))), -2);
                            disque((40+(100*(j+1))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j+2))),(40+(100*(i-3))), -2);
                            disque((40+(100*(j+3))),(40+(100*(i-4))), -2);
                          }
                          if (stop==-1){
                            disque((40+(100*(j+1))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j+2))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j+3))),(40+(100*(i-3))), -2);
                            disque((40+(100*(j+4))),(40+(100*(i-4))), -2);
                          }
                          if(stop==2){
                            disque((40+(100*j)),(40+(100*i)), -2);
                            disque((40+(100*(j+1))),(40+(100*(i-1))), -2);
                            disque((40+(100*(j+2))),(40+(100*(i-2))), -2);
                            disque((40+(100*(j+3))),(40+(100*(i-3))), -2);
                          
                          }
                          EcranGraphique.flush();
			}
                        if((tab[i][j]!=c1)&&(stop==-1)){
				i++;
				j--;
			}
                        if (stop==2) {
                          j=j-1;
                          i=i+1;
                        }
			if (stop==1) {
				j=j-1;
			}
		}
		j=aux;
	}
return res;
}

// Test de l'alignement de 4 pions de la même couleur (si le jeu se termine ou non), grâce aux 4 tests precédents.
static boolean testgain(int c1,int [][] tab){
	int i, j;
	boolean test;
	test=false;
	if(testligne(c1,tab)||testcolonne(c1,tab)||testdiagoBas(c1,tab)||testdiagoHaut(c1,tab)){
		test=true;
	}
	return test;
}
	
	

// Programme principal : Execution du puissance 4. 
public static void main(String[]args){
	int choix, c1, c2, cj1, cj2, nbTour,i,j,boucle;
	String j1, j2;
	int [][] tab = new int[6][7];
	boucle=0;
        c2=-1;

	Ecran.afficherln("1 : Configurer et jouer");
	Ecran.afficherln("2 : quitter");
	choix = Clavier.saisirInt();
	for ( i = 0 ; i < 6 ; i = i+1 ) {
		for ( j = 0 ; j < 7 ; j = j+1 ) {
			tab[i][j] = -1; 
		} 
	}

	if (choix==1) {
		Ecran.afficherln("nom du joueur 1 :");
		j1=Clavier.saisirString();
		do{
			Ecran.afficher(j1," quelle couleur ? (0: rouge) (1: vert) (2:jaune) (3: cyan) (4:magenta)\n");
			c1=Clavier.saisirInt();
		}while((c1<0)||(c1>4));
		Ecran.afficherln("nom du joueur 2 :");
		j2=Clavier.saisirString();
                      switch (c1){
                          case 0 : {
                            Ecran.afficher(j2," quelle couleur ? (1: vert) (2:jaune) (3: cyan) (4:magenta)\n");
                            c2=Clavier.saisirInt();
                            while((c2<0)||(c2>4)||(c2==c1)){
                              Ecran.afficher(" erreur, ressaisissez votre valeur\n ");
                              c2=Clavier.saisirInt();
                            }
                          }
                        break;
                        case 1 : {
                            Ecran.afficher(j2," quelle couleur ? (0: rouge) (2:jaune) (3: cyan) (4:magenta)\n");
                            c2=Clavier.saisirInt();
                            while((c2<0)||(c2>4)||(c2==c1)){
                              Ecran.afficher(" erreur, ressaisissez votre valeur ");
                              c2=Clavier.saisirInt();
                            }
                          }
                        break;
                          case 2 : {
                            Ecran.afficher(j2," quelle couleur ? (0: rouge) (1: vert)  (3: cyan) (4:magenta)\n");
                            c2=Clavier.saisirInt();
                            while((c2<0)||(c2>4)||(c2==c1)){
                              Ecran.afficher(" erreur, ressaisissez votre valeur ");
                              c2=Clavier.saisirInt();
                            }
                          }
                        break;
                        case 3 : {
                            Ecran.afficher(j2," quelle couleur ? (0: rouge) (1: vert) (2:jaune) (4:magenta)\n");
                            c2=Clavier.saisirInt();
                            while((c2<0)||(c2>4)||(c2==c1)){
                              Ecran.afficher(" erreur, ressaisissez votre valeur ");
                              c2=Clavier.saisirInt();
                            }
                          }
                        break;
                        case 4 : {
                            Ecran.afficher(j2," quelle couleur ? (0: rouge) (1: vert) (2:jaune) (3: cyan)\n");
                            c2=Clavier.saisirInt();
                            while((c2<0)||(c2>4)||(c2==c1)){
                              Ecran.afficher(" erreur, ressaisissez votre valeur ");
                              c2=Clavier.saisirInt();
                            }
                          }
                        break;
                      }
		affichagePlateau(tab);

		nbTour=0;
		while ( (testgain(c1,tab)==false)&&(testgain(c2,tab)==false)&&(nbTour<42) ) {
			
                          Ecran.afficherln(j1," : Quelle colonne voulez vous jouer ?!");
                          cj1=Clavier.saisirInt() -1 ;
                        while((cj1<0)||(cj1>6)||(testcolFull(cj1,tab)==true)){
                              Ecran.afficher(" Erreur veuillez renouveler votre saisie.");
                              Ecran.afficherln(j1," : Quelle colonne voulez vous jouer ?!");
                              cj1=Clavier.saisirInt() -1 ;
                        }
		
                        posPion(c1,cj1,tab);
			affichagePlateau(tab);
			if ((testgain(c1,tab)==false)){
				
                                  Ecran.afficherln(j2," : Quelle colonne voulez vous jouer ?!");
                                  cj2=Clavier.saisirInt() -1 ;
				 while((cj2<0)||(cj2>6)||(testcolFull(cj2,tab)==true)){
                              Ecran.afficher(" Erreur veuillez renouveler votre saisie.");
                              Ecran.afficherln(j2," : Quelle colonne voulez vous jouer ?!");
                              cj1=Clavier.saisirInt() -1 ;
                                 }
                                posPion(c2,cj2,tab);
				affichagePlateau(tab);
				nbTour=nbTour + 2 ;
			}
		}
		if ( testgain(c1,tab)){
			Ecran.afficher(j1," a GAGNE !!! Gloire à toi !!!");
		}
		if ( testgain(c2,tab) ) {
			Ecran.afficher(j2," a GAGNE !!! Gloire à toi !!!");
		}
		if ( nbTour==42) {
			Ecran.afficher("EGALITE !");
		}
	}
}


}