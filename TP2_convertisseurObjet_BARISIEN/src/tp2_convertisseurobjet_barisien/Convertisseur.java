/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_barisien;

/**
 *
 * @author marga
 */

public class Convertisseur { 
    int nbConversions;
    

public double CelciusversKelvin (double celcius){ 
    double kelvin ;
    kelvin = celcius + 273.15;
    return kelvin;
}
public double KelvinversCelcius (double kelvin){ 
    double celcius ;
    celcius = kelvin - 273.15;
    return kelvin;
}
public double FarenheitversCelcius (double farenheit){ 
    double celcius ;
    celcius = (farenheit - 32)/1.8 ;
    return celcius;
}
public double CelciusversFarenheit (double celcius){ 
    double farenheit ;
    farenheit = (celcius*1.8) +32 ;
    return farenheit;
}
public double KelvinversFarenheit (double kelvin){ 
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
    
    
    
    

