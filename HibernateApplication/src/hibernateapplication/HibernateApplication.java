/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateapplication;

import java.util.List;
import java.util.Date;
import java.util.Iterator; 
 

import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

/**
 *
 * @author hiramtodd
 * 
 * This class runs the application with the main() method and saves the employee 
 * information. 
 */
public class HibernateApplication {
    private static SessionFactory factory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch(Throwable ex) {
            System.err.println("Failed to create SessionFactory object. " + ex);
        }
        
        HibernateApplication HA = new HibernateApplication();
        
        // Here we are adding a few employee records to a database
        Integer empID1 = HA.addEmployee("Sadam", "Kasad", 5000);
        Integer empID2 = HA.addEmployee("Abraham", "Snicketts", 2500);
        Integer empID3 = HA.addEmployee("Jasper", "Findling", 5000);
        Integer empID4 = HA.addEmployee("Gitsy", "Google", 3000);
        Integer empID5 = HA.addEmployee("Garrek", "McGadd", 5000);
        Integer empID6 = HA.addEmployee("Moyer", "Moore", 5000);
        
        // List the employees here
        HA.listEmployees();
        
        // This updates the employee records
        HA.updateEmployee(empID1, 5000);
        
        // Here, we remove employees from the database
        HA.removeEmployee(empID2);        
        
        // Here, we list the updates list of employees
        HA.listEmployees();
    }
    
    // This block creates an employee in the database
    public Integer addEmployee(String firstName, String lastName, int salary) {
        Session session = factory.openSession();
        Transaction trans = null;
        Integer employeeID = null;
        
        try {
            trans = session.beginTransaction();
            EmployeeIDClass employee = new EmployeeIDClass(firstName, lastName, salary);
            employeeID = (Integer) session.save(employee);
            trans.commit();
        } catch(HibernateException e) {
            if(trans != null) trans.rollback();
            e.printStackerTracer();
        } finally {
            session.close();
        }
        return employeeID;
    }
        
    public void listEmployees() {
        Session session = factory.openSession();
        Transaction trans = null;
        Integer employeeID = null;
        
        // This block reads all employee records.
        try {
            trans = session.beginTransaction();
            List employees = session.createQuery("FROM Employee").list();
            for (Iterator iterator = session.createQuery(); iterator.hasNext();){
                EmployeeIDClass employee = (EmployeeIDClass) iterator.next();
                System.out.print("First Name: " + employee.getfName());
                System.out.print("Last Name: " + employee.getlName());
                System.out.println("Salary: " + employee.getSalary());
            }
            trans.commit();
        } catch(HibernateException e) {
            if(trans != null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    // This block updates salary for the employee
    public void updateEmployee(Integer EmployeeID, int salary) {
        Session session = factory.openSession();
        Transaction trans = null;
        
        try {
            trans = session.beginTransaction();
            EmployeeIDClass employee = (EmployeeIDClass)session.get(EmployeeIDClass.class, EmployeeID);
            employee.setSalary(salary);
                session.update(employee);
            trans.commit();
        } catch(HibernateException e) {
            if (trans != null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    // This block removes an employee from record
    public void removeEmployee(Integer EmployeeID) {
        Session session = factory.openSession();
        Transaction trans = null;
        
        try {
            trans = session.beginTransaction();
            EmployeeIDClass employee = (EmployeeIDClass)session.get(EmployeeIDClass.class, EmployeeID);
            session.remove(employee);
            trans.commit();
        } catch(HibernateException e) {
            if (trans != null) trans.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}


// https://www.tutorialspoint.com/hibernate/hibernate_examples.htm