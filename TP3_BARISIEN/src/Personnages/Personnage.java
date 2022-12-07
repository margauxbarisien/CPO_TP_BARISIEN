/*BARISIEN
/*
*/
package Personnages;
import Armes.Arme;
import java.util.Vector;
/**
 *
 * @author marga
 */
public class Personnage {
    String nom; 
    int NDV;
    Vector maxarmes = new Vector();
    Arme Armedansmain; 
    
    
    @Override
    public String toString () {
    return "Nom du personnage : "+ nom + "\nNiveau de vie  : "+NDV;
    if (Armedansmain!=null){
        return "Arme dans main est "+Armedansmain.getNom();
    }else{
        return"Pas d'arme en main";
    }
    }
    
    

    public Personnage (String n, int ndv, Arme a){
        nom = n;
        NDV = ndv;
        a=null;
        Armedansmain=a;
    }
    public void ajout_arme(Arme arme){
    if (maxarmes.size()<5){
        maxarmes.add(arme);
    
    } else{
       System.out.println("Ce perso a déjà 5 armes"); 
    }
    

    
}

    public Arme getArmedansmain() {
        return Armedansmain;
        
    }
    public String getNom(){
        return nom;
    }
    public void choisirarme (Arme arme){
        if (maxarmes.contains(arme)){
            Armedansmain=arme;
            System.out.println("L'arme dans la main du personnage est "+ Armedansmain.getNom());
        }
    }
    
}

