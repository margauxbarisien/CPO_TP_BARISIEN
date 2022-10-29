package tp2_manip_barisien;

import java.util.Arrays;




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
        Tartiflette assiette1 = new Tartiflette(500) ;//premier objet
        Tartiflette assiette2 = new Tartiflette(600) ;//2ème objet
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories);//affichage calories des assiettes
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);//même calories que assiette 3
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        assiette2 = assiette1 ;//échange des valeurs des assiettes 1 et 2
        assiette1 = assiette3 ;
        System.out.println("nb de calories de Assiette 1 new : " + assiette1.nbCalories);//l'assiette 1 prend la valeur de la 2 et inversement ; il fallait donc enregistrer la valeur de l'assiette 2 dans une nouvelle variable pour ne pas la perdre
        System.out.println("nb de calories de Assiette 2 new : " + assiette2.nbCalories);
        
       // Moussaka assiette666 = assiette1 ;// impossible car Tartiflette ne peut pas devenir Moussaka
        
        //Moussaka assiette667 = new Tartiflette() ;//pas d'argument d'entrée alors qu'il en faut un dans la fonction Tartiflette
        
        //impossible s'il n'y a pas de rapport
        
        Moussaka [] moussakas = new Moussaka [10];//création du tableau
        
        int tailletab;//création variable de type int
        tailletab=moussakas.length;//pour donner la taille du tableau
        for (int a=0;a < tailletab;a++){//initialisation de a à 0 ( a étant la la variable qui va parcourir les cases du tableau)
            // tant que le a est inférieur à 10; a prend plus 1 pour passer à la case d'après
            moussakas[a] = new Moussaka(1);//la case a du tableau moussaka prend la valeur de la référence du nouvel objet
            
       // System.out.println(moussakas[1]);// vérification de la "valeur" de référence pour une des cases du tableau
        }
        System.out.println(Arrays.toString(moussakas));//affichage tableau
        
    }
}
