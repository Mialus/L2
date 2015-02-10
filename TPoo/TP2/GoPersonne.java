public class GoPersonne{
public static void main(String[]args){
	Personne p1=new Personne();
	Personne p2=new Personne();

	String n,p;
	int a;
	
	Ecran.afficher("Veuillez entrer votre Nom : ");
	n=Clavier.saisirString();
	p1.setNom(n);
	Ecran.afficher("Veuillez entrer votre Prenom : ");
	p=Clavier.saisirString();
	p1.setPrenom(p);
	Ecran.afficher("Veuillez entrer votre Année de Naissance : ");
	a=Clavier.saisirInt();
	p1.setAnneNaiss(a);
	
	Ecran.afficher(p1.nom,"\n",p1.prenom,"\n",p1.anneeNaiss);
	
	Ecran.afficher("\n Veuillez entrer votre Nom : ");
	n=Clavier.saisirString();
	p2.setNom(n);
	Ecran.afficher("Veuillez entrer votre Prenom : ");
	p=Clavier.saisirString();
	p2.setPrenom(p);
	p2.setAnneNaiss(a);
	
	Ecran.afficher(p2.nom,"\n",p2.prenom,"\n",p2.anneeNaiss,"\n");
	Ecran.afficher(p1);
	Ecran.afficher("\n",p2);
	
}
}
	