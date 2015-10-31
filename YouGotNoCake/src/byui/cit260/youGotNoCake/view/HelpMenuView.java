/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;

import java.util.Scanner;

/**
 *
 * @author Betsey
 */
class HelpMenuView {

    private final String HELP = "\n"
                +"\n----------------------------------"
                +"\n| Help Menu                      |"
                +"\n----------------------------------"
                +"\nG - What is the goal of the game?"
                +"\nM - How to move."
                +"\nS - Store list items."
                +"\nE - Exit"
                +"\n----------------------------------";
    
    public void displayHelpMenu() {
    
        char selection = ' ';
        do {
            System.out.println(HELP);  //display the main menu
            
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
            System.out.println("Enter menu selection.");
            
            //get the choice from the keyboard and trim off the blanks

            selection = keyboard.nextLine();
            selection = selection.trim();
            
            // if the selection is a valid menu choice
            if (selection.length() > 1) {
                System.out.println("Invalid selection - must be one valid choice.");
            }else{
            if("G".equals(selection) ||
                "M".equals(selection) ||
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
            case 'G': //get and start existing game
                this.displayGoal();
                break;
            case 'M': //display the help menu
                this.displayMove();
                break;
            case 'S': //save the current game
                this.displayStore();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
    }
    private void displayGoal() {
        System.out.println("*** displayGoal function called ***");
    }
    private void displayMove() {
        System.out.println("*** displayMove function called ***");
    }
    private void displayStore() {
        System.out.println("*** displayStore function called ***"); 
    }
}