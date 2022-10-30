/*BARISIEN Margaux

*/
package tp2_relation_1_barisien;

/**
 *
 * @author marga
 */
public class Voiture {
    String Modele;//création des attributs
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;
    
    public Voiture (String mo, String ma,int cv){
        Modele = mo;//initialisation des attributs dans le constructeur Voiture
        Marque = ma;
        PuissanceCV = cv; 
        Proprietaire = null ; 
    }   

    @Override
    public String toString () {
        return " Modele : " + Modele+" ; Marque : " + Marque + " ; Puissance CV : "+ PuissanceCV;// renvoie les données sur les voitures créées
    }
}
       
    

               

    

