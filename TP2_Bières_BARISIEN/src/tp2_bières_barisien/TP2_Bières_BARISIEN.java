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
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson", false) ; //appel de la fonction pour créer une bière
        //uneBiere.Nom = "Cuvee des trolls"; //cette ligne et les 3 suivantes permettaient de définir les premières bières, avec toutes les infos en colonnes
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false ;   
        System.out.println(uneBiere) ; //Affichage de la bière en ligne et avec quelques différences  : les degrés sont entre parenthèses


       // uneBiere.lireEtiquette();
    
        BouteilleBiere BiereLeffe = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe", false) ;
        BiereLeffe.lireEtiquette();
        
        BouteilleBiere BiereChouffe = new BouteilleBiere("Chouffe", 8, "Chez Andrea", true) ;
        BiereChouffe.lireEtiquette();
        
        BouteilleBiere BiereGoudale = new BouteilleBiere("Goudale", 7.2, "TirBouchon", true) ;            
        BiereGoudale.lireEtiquette();
        
        BouteilleBiere BiereHeineken = new BouteilleBiere("Heineken", 5, "neuneu", false) ;
        BiereHeineken.lireEtiquette();
        
        //BiereHeineken.Décapsuler();
        //BiereHeineken.lireEtiquette();
        
        BouteilleBiere BiereViolette = new BouteilleBiere("La Violette", 4.7, "A Annecy", false) ;
        BiereViolette.Décapsuler();//appel de la fonction décapsuler
        System.out.println(BiereViolette) ;//affichage
        BouteilleBiere BiereBlanche = new BouteilleBiere("La 1664 Blanche", 4.9, "Chez Cath", false) ;
        System.out.println(BiereBlanche) ;
   }
}
