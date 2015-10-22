/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

public class CalculationsControl {
    
   
    public double calcGallons(double numFamilyMbrs) {
         
        if(numFamilyMbrs < 1 || numFamilyMbrs > 50){
            return -1;
        }
        double FLUSHES_PER_PERSON = 5;
        double GALLONS_PER_FLUSH = 3.5;
        double result;
        result = (double) (numFamilyMbrs * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH);
        return result;
   }

    public double calcBMI(double height, double weight){
        
       if(height < 48 || height > 96){
            return -1;
        }
       {
        
       if(weight < 50 || weight > 500){
            return -1;
        }
                
        double result;
        result = (double) (weight / Math.pow(height,2) * 703);
        return result;
    }
    }
    public double calcXmas(double todaysDay, double todaysMonth, double todaysYear){
        
        if(todaysDay < 1 || todaysDay > 31){
            return -1;
        }
        if(todaysMonth < 1 || todaysMonth > 12){
            return -1;
        }
        if(todaysYear < 1 || todaysYear > 2015){
            return -1;
        }
        double XMAS_2015_julian = 2457381.5;
        double  todaysJulian;
        
        //Find today's Julian date
        double a = todaysYear/100;
        double b = a/4;
        double c = 2 - a + b;
        double e = 365.25 * (todaysYear + 4716);
        double f = 30.6001 * (todaysMonth + 1);
        todaysJulian = c + todaysDay + e + f - 1524.5;
        
        //Find days between today and Christmas
        double daysToXmas = XMAS_2015_julian - todaysJulian;
        return daysToXmas;
    }
}