package obj;

import java.io.Serializable;

public class Pays implements Serializable{
    private String nom;
    private String a2;
    private String a3;
    private int number;

    public Pays() {
    }

    public Pays(String nom, String a2, String a3, int number) {
        this.nom = nom;
        this.a2 = a2;
        this.a3 = a3;
        this.number = number;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return nom + " (" + a2 + ')';
    }
    
    
    
}
