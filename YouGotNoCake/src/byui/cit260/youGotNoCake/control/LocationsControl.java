/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

public class LocationsControl {
<<<<<<< HEAD
    public void receivePlayerChoice( double locationID){
        
    }
    public void loadLocation(double locationID, char locationText, char actionFlag){
=======
    public double receivePlayerChoice(double locationID){
        if (locationID <=0){
            return -1;
        } else {
            // do nothing for now
        }
              
        double result = 0;
        return result;
    }
    public double loadLocation(double locationID){
        if (locationID <=0){
            return -1;
        } else {
            // do nothing for now
        }
        char locationText;
        char actionFlag;
>>>>>>> origin/master
        
        double result = 0;
        return result;
    }
<<<<<<< HEAD
    public int evalActionFlag(char actionFlag, double locationID){
        return 0;
=======
    public double evalActionFlag(double locationID){
        if (locationID <=0){
            return -1;
        } else {
            // do nothing for now
        }
        char actionFlag;
>>>>>>> origin/master
        
        double result = 0;
        return result;
    }
<<<<<<< HEAD
    public int storeItem(char listName, char itemName, char foundFlag){
        return 0;
=======
    public double storeItem(double foundFlag){
        if (foundFlag <=0){
            return -1;
        } else {
            // do nothing for now
        }
        char itemName;
        char listName;
>>>>>>> origin/master
        
        double result = 0;
        return result;
    }
<<<<<<< HEAD
    public int setVisitedFlag(double locationID, char visitedFlag){
        return 0;
=======
    public double setVisitedFlag(double locationID, 
                                 double visitedFlag){
        if (locationID <=0){
            return -1;
        } else {
            // do nothing for now
        }
        if (visitedFlag <=0){
            return -1;
        } else {
            // do nothing for now
        }
>>>>>>> origin/master
        
        double result = 0;
        return result;
    }
    }
