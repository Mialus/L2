#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
#define BUF_SIZE 256
#define couleur(param) printf("\033[%sm",param)
int tab[19][19];
int item[9]  ;
int* arrive ;
int* drake ;



/* Cette fonction sert à initialiser les drakkars et à colorer les molettes
*/
void initDrake(int pos, int couleur){
int i,j;
if(pos%2==0){
    switch(pos){
        case 10:
        i = 1;
        j = 3;
    break;
        case 20:
        i = 1;
        j = 8;
    break;
        case 30:
        i = 1;
        j = 13;
    break;
        case 12:
        i = 6;
        j = 3;
    break;
        case 22:
        i = 6;
        j = 8;
    break;
        case 32:
        i = 6;
        j = 13;
    break;
        case 42:
        i = 11;
        j = 3;
    break;
        case 52:
        i = 11;
        j = 8;
    break;
        case 62:
        i = 11;
        j = 13;
    break;
        case 72:
        i = 16;
        j = 3;
    break;
        case 82:
        i = 16;
        j = 8;
    break;
        case 92:
        i = 16;
        j = 13;
    break;
		}
		tab[i][j]=couleur;
		tab[i][j+1]=couleur;
		tab[i][j+2]=couleur;
		tab[i+1][j]=couleur;
		tab[i+1][j+1]=couleur;
		tab[i+1][j+2]=couleur;
	}

else{
    switch(pos){
        case 13:
        i = 3;
        j = 1;
    break;
        case 11:
        i = 3;
        j = 6;
    break;
        case 21:
        i = 3;
        j = 11;
    break;
        case 31:
        i = 3;
        j = 16;
    break;
        case 43:
        i = 8;
        j = 1;
    break;
        case 41:
        i = 8;
        j = 6;
    break;
        case 51:
        i = 8;
        j = 11;
    break;
        case 61:
        i = 8;
        j = 16;
    break;
        case 73:
        i = 13;
        j = 1;
    break;
        case 71:
        i = 13;
        j = 6;
    break;
        case 81:
        i = 13;
        j = 11;
    break;
        case 91:
        i = 13;
        j = 16;
    break;
		}
		tab[i][j]=couleur;
		tab[i+1][j]=couleur;
		tab[i+2][j]=couleur;
		tab[i][j+1]=couleur;
		tab[i+1][j+1]=couleur;
		tab[i+2][j+1]=couleur;
}
}

// Cette fonction sert à initialiser les arrivées sur le bord du plateau de jeu
void initArrive(int pos, int couleur){
switch(pos){
    case 13:
    tab[4][0]=couleur;
break;
    case 43:
    tab[9][0]=couleur;
break;
    case 73:
    tab[14][0]=couleur;
break;
    case 10:
    tab[0][4]=couleur;
break;
    case 20:
    tab[0][9]=couleur;
break;
    case 30:
    tab[0][14]=couleur;
break;
    case 72:
    tab[18][4]=couleur;
break;
    case 82:
    tab[18][9]=couleur;
break;
    case 92:
    tab[18][14]=couleur;
break;
    case 31:
    tab[4][18]=couleur;
break;
    case 61:
    tab[9][18]=couleur;
break;
    case 91:
    tab[14][18]=couleur;
break;
}
}
int niv(){
	srand(time(NULL));
	return (rand()%(3-1)+1);
}

// cette fonction sert à initialier le damier
void initDam(int pos, int elem){
	int i,j,x,y;
	if(pos%2==0){
		switch(pos){
			case 2:
					i = 3;
					j = 8;

					switch(elem){
						case 0:
							initDrake(11, 3);
							initDrake(22, 3);
						break;
						case 1:
							initDrake(11, 3);
							initDrake(20, 3);
						break;
						case 2:
							initDrake(20, 3);
							initDrake(21, 3);
						break;
						case 3:
							initDrake(22, 3);
							initDrake(21, 3);
						break;
						case 4:
							initDrake(20, 3);
							initDrake(22, 3);
						break;
						case 5:
							initDrake(11, 3);
							initDrake(21, 3);
						break;
					}
				break;
			case 4:
					i = 8;
					j = 3;

					switch(elem){
						case 0:
							initDrake(42, 3);
							initDrake(43, 3);
						break;
						case 1:
							initDrake(43, 3);
							initDrake(12, 3);
						break;
						case 2:
							initDrake(12, 3);
							initDrake(41, 3);
						break;
						case 3:
							initDrake(42, 3);
							initDrake(41, 3);
						break;
						case 4:
							initDrake(12, 3);
							initDrake(42, 3);
						break;
						case 5:
							initDrake(43, 3);
							initDrake(41, 3);
						break;
					}
				break;
			case 6:
					i = 8;
					j = 13;

					switch(elem){
						case 0:
							initDrake(61, 3);
							initDrake(62, 3);
						break;
						case 1:
							initDrake(51, 3);
							initDrake(32, 3);
						break;
						case 2:
							initDrake(32, 3);
							initDrake(61, 3);
						break;
						case 3:
							initDrake(61, 3);
							initDrake(62, 3);
						break;
						case 4:
							initDrake(32, 3);
							initDrake(62, 3);
						break;
						case 5:
							initDrake(51, 3);
							initDrake(61, 3);
						break;
					}
				break;
			case 8:
					i = 13;
					j = 8;

					switch(elem){
						case 0:
							initDrake(71, 3);
							initDrake(82, 3);
						break;
						case 1:
							initDrake(71, 3);
							initDrake(52, 3);
						break;
						case 2:
							initDrake(52, 3);
							initDrake(81, 3);
						break;
						case 3:
							initDrake(82, 3);
							initDrake(81, 3);
						break;
						case 4:
							initDrake(52, 3);
							initDrake(82, 3);
						break;
						case 5:
							initDrake(71, 3);
							initDrake(81, 3);
						break;
					}
				break;
		}
		for(x=0;x<3;x++){
			for(y=0;y<3;y++){
				tab[i+x][j+y]= 3;
			}
		}
	}
	else{
		switch(pos){
			case 1:
					i = 3;
					j = 3;

					switch(elem){
						case 0:
							initDrake(13, 2);
							initDrake(12, 2);
						break;
						case 1:
							initDrake(13, 2);
							initDrake(10, 2);
						break;
						case 2:
							initDrake(10, 2);
							initDrake(11, 2);
						break;
						case 3:
							initDrake(12, 2);
							initDrake(11, 2);
						break;
						case 4:
							initDrake(10, 2);
							initDrake(12, 2);
						break;
						case 5:
							initDrake(13, 2);
							initDrake(11, 2);
						break;
					}
				break;
			case 3:
					i = 3;
					j = 13;

					switch(elem){
						case 0:
							initDrake(21, 2);
							initDrake(32, 2);
						break;
						case 1:
							initDrake(21, 2);
							initDrake(30, 2);
						break;
						case 2:
							initDrake(30, 2);
							initDrake(31, 2);
						break;
						case 3:
							initDrake(32, 2);
							initDrake(31, 2);
						break;
						case 4:
							initDrake(30, 2);
							initDrake(32, 2);
						break;
						case 5:
							initDrake(21, 2);
							initDrake(31, 2);
						break;
					}
				break;
			case 5:
					i = 8;
					j = 8;

					switch(elem){
						case 0:
							initDrake(41, 2);
							initDrake(52, 2);
						break;
						case 1:
							initDrake(41, 2);
							initDrake(22, 2);
						break;
						case 2:
							initDrake(22, 2);
							initDrake(51, 2);
						break;
						case 3:
							initDrake(52, 2);
							initDrake(51, 2);
						break;
						case 4:
							initDrake(22, 2);
							initDrake(52, 2);
						break;
						case 5:
							initDrake(41, 2);
							initDrake(51, 2);
						break;
					}
				break;
			case 7:
					i = 13;
					j = 3;

					switch(elem){
						case 0:
							initDrake(73, 2);
							initDrake(72, 2);
						break;
						case 1:
							initDrake(73, 2);
							initDrake(42, 2);
						break;
						case 2:
							initDrake(42, 2);
							initDrake(71, 2);
						break;
						case 3:
							initDrake(72, 2);
							initDrake(71, 2);
						break;
						case 4:
							initDrake(42, 2);
							initDrake(72, 2);
						break;
						case 5:
							initDrake(73, 2);
							initDrake(71, 2);
						break;
					}
				break;
			case 9:
					i = 13;
					j = 13;

					switch(elem){
						case 0:
							initDrake(81, 2);
							initDrake(92, 2);
						break;
						case 1:
							initDrake(81, 2);
							initDrake(62, 2);
						break;
						case 2:
							initDrake(62, 2);
							initDrake(91, 2);
						break;
						case 3:
							initDrake(92, 2);
							initDrake(91, 2);
						break;
						case 4:
							initDrake(62, 2);
							initDrake(92, 2);
						break;
						case 5:
							initDrake(81, 2);
							initDrake(91, 2);
						break;
					}
				break;
		}
		for(x=0;x<3;x++){
			for(y=0;y<3;y++){
				tab[i+x][j+y]= 2;
			}
		}
	}
}
void init(){
	int i,k;
	k=0;
	for(i=0;i<9;i++){
			k++;
			initDam(k,item[i]);
	}
	k=0;
	while(drake[k]!=0){
		initDrake(drake[k],k+4);
		initArrive(arrive[k],k+4);
		k++;
	}

}
// Cette fonction sert à lire le fichier choisit par choix.
void lecture(char* nom){
    FILE* file = NULL;
	char buf[BUF_SIZE];
	int i,j;
	int cpt;
	int* valmolet= {0};
	valmolet = malloc(sizeof(int));
	int val;
	size_t sz;

	file = fopen(nom, "r");

cpt=0;
sz = 0;
if (file != NULL){
while (!feof(file)){
    sz = fread(buf, sizeof(char), BUF_SIZE, file);
    int i;
    for(i = 0; i < sz; ++i){
    if(isdigit(buf[i])){
        if(i == sz-1){}
    else{
        if (isdigit(buf[i+1])){
        val = ((int)(buf[i] - '0') * 10) + (int)(buf[i+1] - '0');
        ++i;
}
        else{
        val = (int)(buf[i] - '0');
}
        valmolet[cpt] = val;
        ++cpt;
}
}
}
}

    int k = 0;
    int i;
    for(i = 0;i < 9; ++i){
        item[k]= valmolet[i];
        ++k;
}
    k = 0;
    for(i = 9;i < 13; ++i){
    if(valmolet[i]!=0){
        drake[k] = valmolet[i];
}
    ++k;
}

    k = 0;
    for(i = 13;i < 17; ++i){
    if(valmolet[i]!=0){
        arrive[k] = valmolet[i];
}
    ++k;
}
    fclose(file);
}
    else{

    printf("Fichier introuvable ou illisible \n");
    exit(0);
    }

init();
}
//Cette fonction permet de choisir quelle fichier ouvrir
void choix(char * lvl){
	char add[100] = "./Level/";
	strcat(add, lvl);
	int alea = niv();
	char tampon[16];
	sprintf(tampon, "%d", alea);
	strcat(add, tampon);
	strcat(add, ".txt");
	printf("%s \n",add);
	lecture(add);

}
/* cette fonction permet de définir les valeurs par défaut du tableau
*/
void tabDef(){
    int i,j;
for(i=0;i<19;i++){
    for(j=0;j<19;j++){
    if((i==0) ||(i==18)||(j==0)||(j==18)){
    tab[i][j]= 1;
}
    else{
    tab[i][j]=0;
    }
    }
}
for(i=3;i<14;i=i+5){
    for(j=1;j<17;j=j+5){
    tab[i][j]=1;
    tab[i+1][j]=1;
    tab[i+2][j]=1;
    tab[i][j+1]=1;
    tab[i+1][j+1]=1;
    tab[i+2][j+1]=1;
    }
}
for(i=1;i<17;i=i+5){
    for(j=3;j<14;j=j+5){
    tab[i][j]=1;
    tab[i][j+1]=1;
    tab[i][j+2]=1;
    tab[i+1][j]=1;
    tab[i+1][j+1]=1;
    tab[i+1][j+2]=1;
}
}
}
//cette fonction affiche le menu et oriente le programme selon les choix fait par l'utilisateur
void afficheMenu(){
	char* add;
	int ch;
	printf("Pour charger une partie facile pre-enregistree, tapez 1 \n");
    printf("Pour charger une partie moyenne pre-enregistree, tapez 2 \n");
    printf("Pour charger une partie difficile pre-enregistree, tapez 3 \n");
    printf("Pour charger une partie a partir d un fichier, tapez 4 \n");
    printf("Pour Quitter, tapez 0 \n");
	scanf("%d",&ch);
	while((ch!=1)&&(ch!=2)&&(ch!=3)&&(ch!=4)&&(ch!=0)){
    printf("Erreur de saisie, veuillez recommencer \n");
    printf("Pour charger une partie facile pre-enregistree, tapez 1 \n");
    printf("Pour charger une partie moyenne pre-enregistree, tapez 2 \n");
    printf("Pour charger une partie difficile pre-enregistree, tapez 3 \n");
    printf("Pour charger une partie a partir d un fichier, tapez 4 \n");
    printf("Pour Quitter, tapez 0 \n");
	scanf("%d",&ch);
	}
	switch(ch){
		case 1:
				choix("facile");
			break;
		case 2:
				choix("moyen");
			break;
		case 3:
				choix("difficile");
			break;
		case 4:

			printf("Veuillez taper l'adresse et le nom complet du fichier : \n");
			scanf("%s",*add);
			lecture(add);
			break;
		case 0:
			exit(0);
			break;

	}
    scanf("%*[^\n]s");
	getchar();
}


// Cette fonction affiche le jeu
void afficheDam(){
	int i,j;
	for(i=0;i<19;i++){
		for(j=0;j<19;j++){
			switch(tab[i][j]){
				case 0:
					couleur("48");
					printf("  ");
					couleur("0");
				break;
				case 1:
					couleur("40");
					printf("  ");
					couleur("0");
				break;
				case 2:
					couleur("44");
					printf("  ");
					couleur("0");
				break;
				case 3:
					couleur("46");
					printf("  ");
					couleur("0");
				break;
				case 4:
					couleur("43");
					printf("  ");
					couleur("0");
				break;
				case 5:
					couleur("42");
					printf("  ");
					couleur("0");
				break;
				case 6:
					couleur("41");
					printf("  ");
					couleur("0");
				break;
				case 7:
					couleur("45");
					printf("  ");
					couleur("0");
				break;

			}
		}
		printf("\n");
	}
}

int main(){
	arrive = malloc(sizeof(int));
	drake = malloc(sizeof(int));
	tabDef();
	afficheMenu();
	afficheDam();
}