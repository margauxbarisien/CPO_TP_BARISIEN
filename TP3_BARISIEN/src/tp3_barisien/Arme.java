/*BARISIEN Margaux TDB 

*/
package tp3_barisien;

/**
 *
 * @author marga
 */
public class Arme {
    String nom;
    int NDA;
    
    @Override
    public String toString () {
    return "Nom de l'arme : "+ nom + "\nNiveau d'attaque : "+NDA;
    
    
}
    public Arme (String n, int nda){
        nom = n;
        if (nda>100){
            nda = 100;
        }
        NDA = nda;
        
        
    }
}
