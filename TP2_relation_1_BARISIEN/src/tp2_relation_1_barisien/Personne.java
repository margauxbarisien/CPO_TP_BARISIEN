/*BARISIEN Margaux
 */
package tp2_relation_1_barisien;

/**
 *
 * @author marga
 */
public class Personne {
    String nom;
    String prenom;
    
    public Personne (String n, String p){
        nom = n ;
        prenom= p ;
        
    }   
    @Override
    public String toString () {
        return " Nom : "+nom+ "; Prenom : "+prenom;
    }
}
    
