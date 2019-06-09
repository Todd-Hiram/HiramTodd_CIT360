/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitexample;

/**
 *
 * @author hiramtodd
 */
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

public class JunitExample {
    @Test

    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
