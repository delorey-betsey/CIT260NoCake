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
        double numFamilyMbrs = 0;
                
        // expected output return value
        double expGallons = 0;
                
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
        double numFamilyMbrs = 48;
                
        // expected output return value
        double expGallons = 840;
                
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
        double numFamilyMbrs = 97;
                
        // expected output return value
        double expGallons = 0;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double gallons = instance.calcGallons(numFamilyMbrs);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expGallons, gallons, 0.0001);
        
       }  
     /**
     * Test of calcBMI method, of class CalculationsControl.
     */
    @Test
    public void test1CalcBMI() {
        
        /*************************
         * * Test case #1 calcBMI (valid)
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
         * * Test case #2 calcBMI (valid)
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
    public void test3CalcBMI() {
        
        /*************************
         * * Test case #3 calcBMI (valid)
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        double height = 48;
        double weight = 85;
                
        // expected output return value
        double expBMI = 25.9;
                
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
         * * Test case #4 calcBMI (invalid boundary)
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
    public void test5CalcBMI() {
        
        /*************************
         * * Test case #5 calcBMI (valid boundary)
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        double height = 48;
        double weight = 50;
                
        // expected output return value
        double expBMI = 15.3;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double bmi = instance.calcBMI(height,weight);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expBMI, bmi, 1.0); 
       }  
    @Test
    public void test6CalcBMI() {
        
        /*************************
         * * Test case #6 calcBMI (invalid boundary)
         * ***********************/
        System.out.println("calcBMI");
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        double height = 97;
        double weight = 501;
                
        // expected output return value
        double expBMI = 37.4;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double bmi = instance.calcBMI(height,weight);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expBMI, bmi, 1.0);
        
       }  
     /**
     * Test of calcXmas method, of class CalculationsControl.
     */
    @Test
    public void test1CalcXmas() {
        
        /*************************
         * * Test case #1 CalcXmas (valid)
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
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
    @Test
    public void test2CalcXmas() {
        
        /*************************
         * * Test case #2 CalcXmas (valid)
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        double todaysDay = 2;
        double todaysMonth = 2;
        double todaysYear = 2015;
                
        // expected output return value
        double expDaysToXmas = 326;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
    @Test
    public void test3CalcXmas() {
        
        /*************************
         * * Test case #3 CalcXmas (valid)
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        double todaysDay = 20;
        double todaysMonth = 12;
        double todaysYear = 2015;
                
        // expected output return value
        double expDaysToXmas = 5;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
    @Test
    public void test4CalcXmas() {
        
        /*************************
         * * Test case #4 CalcXmas (invalid boundary)
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        double todaysDay = 00;
        double todaysMonth = 00;
        double todaysYear = 0000;
                
        // expected output return value
        double expDaysToXmas = 50;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
    @Test
    public void test5CalcXmas() {
        
        /*************************
         * * Test case #5 CalcXmas (valid boundary)
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        double todaysDay = 10;
        double todaysMonth = 2;
        double todaysYear = 2015;
                
        // expected output return value
        double expDaysToXmas = 318;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
    @Test
    public void test6CalcXmas() {
        
        /*************************
         * * Test case #6 CalcXmas (invalid boundary)
         * ***********************/
        System.out.println("calcXmas");
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        double todaysDay = 10;
        double todaysMonth = 10;
        double todaysYear = 3015;
                
        // expected output return value
        double expDaysToXmas = 76;
                
        //create instance of CalcGallons class
        CalculationsControl instance = new CalculationsControl();
        
        // call function to run test
        double daysToXmas = instance.calcXmas(todaysDay,todaysMonth, todaysYear);
        
        // compare expected return value with actual value returned
        // may need to search web-- JUnit JavaDoc Assert
        assertEquals(expDaysToXmas, daysToXmas, 3.0);
        
       }  
}
