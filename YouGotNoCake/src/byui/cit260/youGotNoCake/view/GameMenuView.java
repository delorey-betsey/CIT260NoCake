/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.model.Player;
import java.util.Scanner;

//public class GameMenuView {

class GameMenuView {
        
    private final String GAME = "\n"
                +"\n----------------------------------"
                +"\n| Game Menu                      |"
                +"\n----------------------------------"
                +"\nL - Choose a location."
                +"\nS - Save game."
                +"\nE - Exit"
                +"\n----------------------------------";

    public void displayGameMenu() {
    
        char selection = ' ';
        do {
            System.out.println(GAME);  //display the game menu
            
            String input = this.getInput();   //get the user's selection
            selection = input.charAt(0);  //get first character of string
        
        this.doAction(selection);  //do action based on selection
        
        }while (selection != 'E');  //while the selection is not Exit
    }
 
    private String getInput() {
         
        boolean valid = false;    //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) {    //while a choice has not been retrieved
            
            //prompt for the player's menu selection
            System.out.println("Enter game menu selection.");
            
            //get the choice from the keyboard and trim off the blanks

            selection = keyboard.nextLine();
            selection = selection.trim();
            
            // if the selection is a valid menu choice
            if (selection.length() > 1) {
                System.out.println("Invalid selection - must be one valid choice.");
            }else{
            if("L".equals(selection) ||
                "S".equals(selection) ||
                "E".equals(selection) ){
                break; //out of the repetition (exit)
            }else
                System.out.println("Invalid selection - must be one valid choice.");
            }
        }
    return selection;     //return the name
    }

    public void doAction(char selection){
        switch (selection){
            case 'L': //display goal of game
                this.chooseLocation();
                break;
            case 'S': //display how to move
                this.saveGame();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");    
    }
    
    private String chooseLocation() {
        System.out.println("*** chooseLocation function called ***");    
        //prompt for player choice of location and pass to locationMenuView
         
        boolean valid = false;    //indicates if the name has been retrieved
        String playersChoice = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) {    //while a valid choice has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Enter game map.");
            
            //get the choice from the keyboard and trim off the blanks
            playersChoice = keyboard.nextLine();
            playersChoice = playersChoice.trim();
            
            // if the choice is invalid (less than two characters in length)
            if (playersChoice.length() < 2 || playersChoice.length() > 2){
                System.out.println("Invalid choice - indicate location with two digits");
            }else{
                break; //out of the repetition (exit)
            }
        }
    return playersChoice;     //return the choice
    }
    
}
