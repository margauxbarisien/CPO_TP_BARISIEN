/*BARISIEN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_barisien;

/**
 *
 * @author marga
 */
public class Guerrier extends Personnage {
    boolean cheval;
    
    public Guerrier(String n, int ndv, boolean ch) {
        super(n, ndv);
        cheval = ch;
        
    }

    public void setcheval(boolean cheval) {
        this.cheval = cheval;
    }
}