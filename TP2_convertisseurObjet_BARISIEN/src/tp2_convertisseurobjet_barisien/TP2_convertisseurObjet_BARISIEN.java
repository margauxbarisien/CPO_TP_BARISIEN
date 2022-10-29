/* BARISIEN Margaux
*28/10/2022
*TDB
*/

package tp2_convertisseurobjet_barisien;

import java.util.Scanner;

/**
 *
 * @author marga
 */

public class TP2_convertisseurObjet_BARISIEN {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);//nécessaire pour demander une saisi à l'utilisateur
        double b = sc.nextDouble();// saisi de l'utilisateur
        System.out.println(b);
        double k = b + 273.15 ;// calcul
        System.out.println(k); //affichage k
    
        
        double test = sc.nextDouble();//test 
        Convertisseur c = new Convertisseur ();// c devient convertisseur fonction donc permet d'être utilisé ci-dessous
        double resultat = c.CelciusversFarenheit(test);
        System.out.println(resultat);
    
        System.out.println("Saisissez une valeur");//affichage début menu
        double valeur = sc.nextDouble();//saisi de l'utilisateur
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");//affichage suite menu
        double conversion = sc.nextDouble();//saisi utilisateur
        double resultatfinal;//création de la variable resultat final de type double
        int nbConversions = 0;//initialisation de la variable nb conversions
        if (conversion == 1){//test pour savoir quel genre de changement de température l'utilisateur souhaite
            resultatfinal = c.CelciusversKelvin(valeur);
            System.out.println(valeur + "degres Celcius est egal à " + resultatfinal + "degres Kelvin");
            nbConversions=nbConversions + 1;// on rajoute +1 pour dire qu'une conversion a été effectuée
        }
        if (conversion == 2){//même principe 
            resultatfinal = c.KelvinversCelcius(valeur);
            System.out.println(valeur + "degres Kelvin est egal à " + resultatfinal + "degres Celcius");
            nbConversions=nbConversions + 1;
            }
        if (conversion == 3){
            resultatfinal = c.FarenheitversCelcius(valeur);
            System.out.println(valeur + "degres Farenheit est egal à " + resultatfinal + "degres Celcius");
            nbConversions=nbConversions + 1;
        }
        if (conversion == 4){
            resultatfinal = c.CelciusversFarenheit(valeur);
            System.out.println(valeur + "degres Celcius est egal à " + resultatfinal + "degres Farenheit");
            nbConversions=nbConversions + 1;
        }
        if (conversion == 5){
            resultatfinal = c.KelvinversFarenheit(valeur);
            System.out.println(valeur + "degres Kelvin est egal à " + resultatfinal + "degres Farenheit");
            nbConversions=nbConversions + 1;
            }
        if (conversion == 6){
            resultatfinal = c.FarenheitversKelvin(valeur);
            System.out.println(valeur + "degres Farenheit est egal à " + resultatfinal + "degres Kelvin");
            nbConversions=nbConversions + 1;
        }
        System.out.println("Le nombre de conversions est égal à "+ nbConversions); //affichage nb conversions
    }
    
}

        
                

