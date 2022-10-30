/*BARISIEN 
*Margaux
*TDB 30/10/2022
*/
package tp2_relation_1_barisien;

/**
 *
 * @author marga
 */
public class TP2_relation_1_BARISIEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n"+ uneClio + //rajout d'un \n pour plus de lisibilité
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        System.out.println("Deux proprietaires de voiture :\n" + bob + "\n" +reno);
    }
    
}
