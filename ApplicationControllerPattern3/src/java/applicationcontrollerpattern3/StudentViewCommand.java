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
public class StudentViewCommand implements Command {

    @Override
    public String execute(RequestContext requestContext) {

        String id = null;
        StudentVO studentVo = null;

        id = requestContext.getParameter("id");

        //call delegate and dao 
        studentVo = new StudentVO(id, "Ramesh");

        requestContext.setAttribute("student", studentVo);

        return "showStudent";
    }

}
