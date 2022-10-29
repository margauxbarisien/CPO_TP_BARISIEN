
import tp2_manip_barisien.Tartiflette;

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
        System.out.println(assiette1);
        System.out.println("nb de calories de Assierre 2 : " + assiette2);
        System.out.println("nb de calories de Assierre 3 : " + assiette3);
    
}
}
