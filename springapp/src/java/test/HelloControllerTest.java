/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.web.servlet.ModelAndView;
import controller.HelloController;
import junit.framework.TestCase;

/**
 *
 * @author Arod6
 */
public class HelloControllerTest extends TestCase {

    public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}
