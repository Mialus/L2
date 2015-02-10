public class Personne{
	String nom,prenom;
	int anneeNaiss;

	
	public void setPrenom(String n_prenom){

		prenom=n_prenom;
		
		}

	public void setNom(String n_nom){
		
		nom=n_nom;
}

	public void setAnneNaiss(int a){
		
		anneeNaiss=a;
	}
	
	public int ageEn2013(){
		int age;
		
		age=(2013-anneeNaiss);
		return age;
	}
	public String toString() {
		return  nom + ", " + prenom + " ( " + anneeNaiss + " ) " +" : " + ageEn2013() + " ans";
	}
}