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
    public void test1CalcGallons() {
        
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
    public void test2CalcGallons() {
        
        /****************************
         * * Test case #2 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        double numFamilyMbrs = 5;
                
        // expected output return value
        double expGallons = 87.5;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void test3CalcGallons() {
        
        /****************************
         * * Test case #3 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        double numFamilyMbrs = 3;
                
        // expected output return value
        double expGallons = 52.5;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void test4CalcGallons() {
        
        /****************************
         * * Test case #4 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        double numFamilyMbrs = aa;
                
        // expected output return value
        double expGallons = error;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void test5CalcGallons() {
        
        /****************************
         * * Test case #5 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        double numFamilyMbrs = &@;
                
        // expected output return value
        double expGallons = error;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void test6CalcGallons() {
        
        /****************************
         * * Test case #6 CalcGallons
         * **************************/
        System.out.println("calcGallons");
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        double numFamilyMbrs = null;
                
        // expected output return value
        double expGallons = error;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
    @Test
    public void test1CalcBMI() {
        
        /*************************
         * * Test case #1 calcBMI
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #1");
        
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
        assertEquals(expBMI, bmi, 1.0);
        
       }  
    @Test
    public void test2CalcBMI() {
        
        /*************************
         * * Test case #2 calcBMI
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        double height = 60;
        double weight = 200;
                
        // expected output return value
        double expBMI = 39.05;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double bmi = instance.calcBMI(height,weight);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expBMI, bmi, 1.0);
        
       }    
    @Test
    public void test4CalcBMI() {
        
        /*************************
         * * Test case #4 calcBMI
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        double height = 47;
        double weight = 49;
                
        // expected output return value
        double expBMI = 15.59;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double bmi = instance.calcBMI(height,weight);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expBMI, bmi, 1.0);
        
       }  
    @Test
    public void test1CalcXmas() {
        
        /*************************
         * * Test case #1 CalcXmas
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #1");
        
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
