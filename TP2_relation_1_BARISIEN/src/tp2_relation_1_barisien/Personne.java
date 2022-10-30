/*BARISIEN Margaux
 */
package tp2_relation_1_barisien;

/**
 *
 * @author marga
 */
public class Personne {
    String nom;//création des attributs avec leur type
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures;

    public Personne (String n, String p){
        nom = n ;//initialisation des attributs dans le constructeur Personne
        prenom= p ;
        nbVoitures = 0 ;
        liste_voitures = new Voiture [3] ;   
    }   
    @Override
    public String toString () {
        return " Nom : "+nom+ "; Prenom : "+prenom;// renvoie les données sur les identités de personnes créées
        
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {//création d'une fonction qui permet 
        if (voiture_a_ajouter.Proprietaire != null){// si la voiture appartient déjà a qqun
            System.out.println(voiture_a_ajouter + " : voiture volee!!");
            return false;
        }
        if (this.nbVoitures == 3){//si le propriétaire possède déjà trois voitures
            System.out.println("Le proprietaire possede deja 3 voitures");
        return false;
        }
        else{//sinon on remplit la case du tableau avec la nouvelle voiture
            this.liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures=nbVoitures+1;//on ajoute 1 car le propriétaire a une nouvelle voiture en plus
            voiture_a_ajouter.Proprietaire = this ;//permet de référencer l'objet qui exécute la méthode 
            return true;//retourne vraie
        }
    }
}
    

    
