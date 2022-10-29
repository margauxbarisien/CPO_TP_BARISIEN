/*BARISIEN Margaux
*TDB 28/10/2022
*/
package tp2_convertisseurobjet_barisien;

/**
 *
 * @author marga
 */

public class Convertisseur { 
       int nbConversions; 
    public Convertisseur (){//pour calculer nb conversions 
        nbConversions = 0;// initialisation à 0
    }
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
}

    
    

public double CelciusversKelvin (double celcius){ // création de toutes les fonctions allant de celcius vers kelvin ou encore de farenheit vers celcius
    double kelvin ;// création du type de la variable de sortie
    kelvin = celcius + 273.15;//le rapport entre kelvin et celcius
    return kelvin;//renvoie la valeur que l'utilisateur entrera comme des celcius mais en kelvin
}
public double KelvinversCelcius (double kelvin){ //même principe
    double celcius ;
    celcius = kelvin - 273.15;
    return kelvin;
}
public double FarenheitversCelcius (double farenheit){ //même principe
    double celcius ;
    celcius = (farenheit - 32)/1.8 ;
    return celcius;
}
public double CelciusversFarenheit (double celcius){ //même principe
    double farenheit ;
    farenheit = (celcius*1.8) +32 ;
    return farenheit;
}
public double KelvinversFarenheit (double kelvin){ // on utilise les fonctions précédentes : pour faire kelvin farenheit on fait kelvincelcius-celciusfarenheit
    double farenheit ;
    farenheit = CelciusversFarenheit(KelvinversCelcius(kelvin));   
    return farenheit;
}
public double FarenheitversKelvin (double farenheit){ 
    double kelvin ;
    kelvin = CelciusversKelvin(FarenheitversCelcius(farenheit));   
    return kelvin;
}
}
    
    
    
    

