/*BARISIEN Margaux

*/
package tp2_relation_1_barisien;

/**
 *
 * @author marga
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;

    public Voiture (String mo, String ma,int cv){
        Modele = mo;
        Marque = ma;
        PuissanceCV = cv; 
        
    }   
    @Override
    public String toString () {
        return " Modele : " + Modele+" ; Marque : " + Marque + " ; Puissance CV : "+ PuissanceCV;
    }
}
       
    

               

    

