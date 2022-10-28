/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bières_barisien;

/**
 *
 * @author marga
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
    
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie + "\nouverte : " + ouverte) ;
    }
    public BouteilleBiere(String unNom, double unDegre, String 
    uneBrasserie, boolean ouverte1) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte=ouverte1;
    
    
}
    public boolean Décapsuler (){
    if (ouverte == false) {
        ouverte =true ;
        return ouverte;
    }
    else {
        System.out.println("erreur, la bière est déjà ouverte");
        ouverte = false;
        return ouverte ;
    }
    
    }
}


                
    








