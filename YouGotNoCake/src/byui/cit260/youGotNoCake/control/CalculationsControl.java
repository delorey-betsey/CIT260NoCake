/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

public class CalculationsControl {
    
    public void calcXmas(todaysDay, todaysMonth, todaysYear, result, calculationType){
        
        if(todaysDay < 1 || todaysDay > 31){
            return -1;
        }
        if(todaysMonth < 1 || todaysMonth > 12){
            return -1;
        }
        if(todaysYear < 1 || todaysYear > 2015){
            return -1;
        }
        int FLUSHES_PER_PERSON = 5;
        int GALLONS_PER_FLUSH = 3.5;
        int result = numFamilyMbers * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH
        return result;
    }
    public int calcBMI(input1, input2, result, calculationType){
        
       if(numFamilyMbrs < 1 || numFamilyMembers > 50){
            return -1;
        }
        int FLUSHES_PER_PERSON = 5;
        int GALLONS_PER_FLUSH = 3.5;
        int result = numFamilyMbers * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH
        return result; 
    }
    public int calcGallons(numFamilyMbers, result, calculationType) {
        if(numFamilyMbrs < 1 || numFamilyMembers > 50){
            return -1;
        }
        int FLUSHES_PER_PERSON = 5;
        int GALLONS_PER_FLUSH = 3.5;
        int result = numFamilyMbers * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH
        return result;
    }
}
