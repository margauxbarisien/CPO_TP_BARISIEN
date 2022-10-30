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
        Voiture uneClio = new Voiture ("Clio", "Renault", 5) ;//création des voitures
        Voiture uneAutreClio = new Voiture ("Clio", "Renault",5) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4) ;
        Personne bob = new Personne("Bobby", "Sixkiller");//création des identités de personnes
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n"+ uneClio + //rajout d'un \n pour plus de lisibilité
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;//affichage des différentes voitures
        System.out.println("Deux proprietaires de voiture :\n" + bob + "\n" +reno);//affichage des 2 propriétaires
     
        //on désigne ensuite a qui appartient quelles voitures grâce à un tableau
        bob.liste_voitures[0] = uneClio ;//la case 0 correspind à la première voiture de bob
        bob.nbVoitures = 1 ;      //bob possède donc 1 voiture
        uneClio.Proprietaire = bob ;// le propriétaire de la clio est bob
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;//affichage de la première voiture de bob

        bob.liste_voitures[1] = une2008;//même principe
        bob.nbVoitures= 2 ;
        une2008.Proprietaire = bob;
  
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[1] ) ;
        
        reno.liste_voitures[0]= uneAutreClio;//même principe
        reno.nbVoitures = 1;
        uneAutreClio.Proprietaire = reno ;
        
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] ) ;
        
        reno.liste_voitures[1]= uneMicra;//même principe
        reno.nbVoitures = 2;
        uneMicra.Proprietaire = reno ;
               
        System.out.println("la deuxieme voiture de Reno est " + reno.liste_voitures[1] ) ;
        
        Voiture C3 = new Voiture ("C3", "Citroen", 4) ;//création d'une nouvelle voiture
        Voiture C5 = new Voiture ("C5", "Citroen", 7) ;//création d'une nouvelle voiture
        reno.ajouter_voiture(C3);//reno a déjà 2 voitures, la troisième voiture est la c3
        
        System.out.println(reno.liste_voitures[2]);//on le vérifie grpce à l'affichage de la dernière case du tableau
        
        reno.ajouter_voiture(C5);// en essayant d'ajouter une 4ème voiture, message d'erreur : propriétaire ayant déjà 3 voitures
        reno.ajouter_voiture(uneClio);// en essayant d'ajouter une voiture de bob, message d'erreur : voitre volée!!
        

    }
    
}
