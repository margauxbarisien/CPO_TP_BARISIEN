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
    String Nom; //création des caractéristiques de la bière avec les types
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() { //fonction qui lit l'étiquette de la bière
    
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie + "\nouverte : " + ouverte) ; //les \n permettent d'aller à la ligne
    }
    public BouteilleBiere(String unNom, double unDegre, String 
    uneBrasserie, boolean ouverte1) { //fonction pour créer une bière
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte=ouverte1;
    }
    @Override
    public String toString() {//permet d'afficher également l'étiquette de la bière mais plus synthétiquement
    String chaine_a_retourner;
    chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
    
    

    public boolean Décapsuler (){//fonction décapsuler
    if (ouverte == false) {//si pas ouverte
        ouverte = true ;//On ouvre te on affiche que la bière a été ouverte
        return ouverte;
    }
    else {//sinon
        System.out.println("erreur, la bière est déjà ouverte");//message erreur
        ouverte = false;//bière déjà ouverte donc on a pas eu besoin de l'ouvrir
        return ouverte ;
}
    }
}



                
    








