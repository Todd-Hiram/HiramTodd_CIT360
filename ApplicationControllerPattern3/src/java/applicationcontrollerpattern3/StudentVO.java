/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern3;

/**
 *
 * @author hiramtodd
 */
public class StudentVO {
    
    private String id;
    private String name;
    
    // Constructor
    public StudentVO(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Setters and Getters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName() {
        this.name = name;
    }
    
}
