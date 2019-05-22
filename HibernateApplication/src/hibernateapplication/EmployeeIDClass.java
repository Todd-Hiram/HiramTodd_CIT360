/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateapplication;

/**
 * @author hiramtodd
 * 
 * This is a POJO (Plain Old Java Object) class, which is the first step in 
 * creating an application. This class uses the 'get' and 'set' methods to make
 * this class JavaBeans compliant in order to work this class as an index for id.
 * This object will correspond with this application's database table created in 
 * SQL.
 */
public class EmployeeIDClass {
    private int id;
    private String fName;
    private String lName;
    private int salary;
    
    public EmployeeIDClass(String firstName, String lastName, int salary) {
        this.fName = firstName;
        this.lName = lastName;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getfName() {
        return fName;
    }
    
    public void setfName(String first_name) {
        this.fName = first_name;
    }
    
    public String getlName() {
        return lName;
    }
    
    public void setlName(String last_name) {
        this.lName = lName;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
