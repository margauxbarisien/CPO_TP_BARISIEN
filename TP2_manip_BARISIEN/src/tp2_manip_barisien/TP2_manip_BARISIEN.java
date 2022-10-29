package tp2_manip_barisien;


/* BARISIEN Margaux
* TDB
*29/10/2022
\

/**
 *
 * @author marga
 */
public class TP2_manip_BARISIEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);//même calories que assiette 3
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        assiette2 = assiette1 ;
        assiette1 = assiette3 ;
        System.out.println("nb de calories de Assiette 1 new : " + assiette1.nbCalories);//l'assiette 1 prend la valeur de la 2 et inversement ; il fallait donc enregistrer la valeur de l'assiette 2 dans une nouvelle variable pour ne pas la perdre
        System.out.println("nb de calories de Assiette 2 new : " + assiette2.nbCalories);
        
       // Moussaka assiette666 = assiette1 ;// impossible car Tartiflette ne peut pas devenir Moussaka
        
        //Moussaka assiette667 = new Tartiflette() ;//pas d'argument d'entrée alors qu'il en faut un dans la fonction Tartiflette
        
        //impossible s'il n'y a pas de rapport
        
        

    }
}
