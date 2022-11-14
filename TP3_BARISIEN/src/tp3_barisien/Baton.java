/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_barisien;

/**
 *
 * @author marga
 */
public class Baton extends Arme{
        int age;
    
    public Baton (String n2,int nda2,int a){
        super(n2,nda2);
        if (a>=100){
            a = 99;
        }
        if (a<0){
            a=0;
        }
        age = a;
}

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

