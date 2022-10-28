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
        Scanner sc = new Scanner (System.in);
        double b = sc.nextDouble();
        System.out.println(b);
        double k = b + 273.15 ;
        System.out.println(k); 
    
        
        double test = sc.nextDouble();
        Convertisseur c = new Convertisseur ();
        double resultat = c.CelciusversFarenheit(test);
        System.out.println(resultat);
    
        System.out.println("Saisissez une valeur");
        double valeur = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        double conversion = sc.nextDouble();
        double resultatfinal;
        int nbConversions = 0;
        if (conversion == 1){
            resultatfinal = c.CelciusversKelvin(valeur);
            System.out.println(valeur + "degres Celcius est egal à " + resultatfinal + "degres Kelvin");
            nbConversions=nbConversions + 1;
        }
        if (conversion == 2){
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
        System.out.println("Le nombre de conversions est égal à "+ nbConversions); 
    }
    
}

        
                

