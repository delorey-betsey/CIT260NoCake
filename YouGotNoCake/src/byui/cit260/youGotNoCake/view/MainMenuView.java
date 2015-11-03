/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;
//import byui.cit260.youGotNoCake.view.StartProgramView;
import byui.cit260.youGotNoCake.control.GameControl;
//import byui.cit260.youGotNoCake.control.HelpControl;
//import byui.cit260.youGotNoCake.control.YouGotNoCake;
import java.util.Scanner;

/**
 *
 * @author Betsey
 */
public class MainMenuView {
    
    private final String MENU = "\n"
                +"\n----------------------------------"
                +"\n| Main Menu                      |"
                +"\n----------------------------------"
                +"\nN - Start new game"
                +"\nG - Get and start existing game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nE - Exit"
                +"\n----------------------------------";
    
    public void displayMenu() {
    
        char selection = ' ';
        do {
            System.out.println(MENU);  //display the main menu
            
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
            if("N".equals(selection) ||
                "G".equals(selection) ||
                "H".equals(selection) ||
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
            case 'N': //create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start existing game
                this.startExistingGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
    }
    private void startNewGame() {
        //create new game
        GameControl.createNewGame(StartProgramView.getPlayer());
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void startExistingGame() {

        System.out.println("*** startExistingGame function called ***");
    }
    private void displayHelpMenu() {
        //display Help menu
        //HelpControl.displayHelpMenu(YouGotNoCake.getPlayer());
        //display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");    
    }    
}
