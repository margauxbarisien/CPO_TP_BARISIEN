/*BARISIEN MARGAUX
*TDB
*/
package tp2_bières_barisien;

/**
 *
 * @author marga
 */
public class TP2_Bières_BARISIEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        //uneBiere.Nom = "Cuvee des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false ;       
        uneBiere.lireEtiquette();
    
        BouteilleBiere BiereLeffe = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe") ;
        BiereLeffe.lireEtiquette();
        
        BouteilleBiere BiereChouffe = new BouteilleBiere("Chouffe", 8, "Chez Andrea") ;
        BiereChouffe.lireEtiquette();
        
        BouteilleBiere BiereGoudale = new BouteilleBiere("Goudale", 7.2, "TirBouchon") ;            
        BiereGoudale.lireEtiquette();
        
        BouteilleBiere BiereHeineken = new BouteilleBiere("Heineken", 5, "neuneu") ;
        BiereHeineken.lireEtiquette();
  
}
}
