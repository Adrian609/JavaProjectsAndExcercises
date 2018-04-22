/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import controller.HelloController;
import org.springframework.web.servlet.ModelAndView; 

/**
 *
 * @author Arod6
 */
public class HelloControllerTest {
    
    public HelloControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testHandleRequestView() throws Exception{       
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);         
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}
