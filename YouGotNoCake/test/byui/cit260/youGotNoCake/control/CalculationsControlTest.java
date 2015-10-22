/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Betsey
 */
public class CalculationsControlTest {
        
    public CalculationsControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcGallons method, of class CalculationsControl.
     */
    @Test
    public void testCalcGallons() {
        
        /****************************
         * * Test case #1 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double numFamilyMbrs = 8;
                
        // expected output return value
        double expGallons = 140;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void testCalcBMI() {
        
        /*************************
         * * Test case #2 calcBMI
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        double height = 72;
        double weight = 175;
                
        // expected output return value
        double expBMI = 23.7;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double bmi = instance.calcBMI(height,weight);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expBMI, bmi, 0.1);
        
       }  
    @Test
    public void testCalcXmas() {
        
        /*************************
         * * Test case #3 CalcXmas
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        double todaysDay = 15;
        double todaysMonth = 11;
        double todaysYear = 2015;
                
        // expected output return value
        double expDaysToXmas = 40;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 1.0);
        
       }  
}