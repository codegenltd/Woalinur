/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oxfordltd.model;

/**
 *
 * @author HP
 */
public class StudentsModel {
    private int id;
    private String name;
    private String department;
    private double result;

    public StudentsModel(int id, String name, String department, double result) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.result = result;
    }

    public StudentsModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    
    
    
}
