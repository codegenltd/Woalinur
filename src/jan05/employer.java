/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan05;

/**
 *
 * @author md.woalinur
 */
public class employer {
    private int id;
    private String name;
    private double capital;

    public employer(int id, String name, double capital) {
        this.id = id;
        this.name = name;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "employer{" + "id=" + id + ", name=" + name + ", capital=" + capital + '}';
    }
   
    
}

