/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;
import byui.cit260.youGotNoCake.control.ProgramControl;
import byui.cit260.youGotNoCake.model.Player;
import java.util.Scanner;

public class StartProgramView {
    
    public StartProgramView() {
    }
    public void startProgram(){
       
        //Display the banner screen
        this.displayBanner();
        
        //prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main menu.    
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }
    public void displayBanner() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("*\n Game description and how to play. *");
        
        System.out.println("*\n This is a test. *");
        
        System.out.println("*\n This is a test. *");
        
        System.out.println("*\n ************************* *");        
    }

    private String getPlayersName() {
         
        boolean valid = false;    //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) {    //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks

            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two characters in length)
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must not be blank");
            }else{
                break; //out of the repetition (exit)
            }
        }
    return playersName;     //return the name
    }
    public void displayWelcomeMessage(Player player) { 
        
        System.out.println("\n\n========================================");
        
        System.out.println("\tWelcome to the game, " + player.getName() + ".");
        
        System.out.println("\tWe hope you have a lot of fun!");
        
        System.out.println("========================================");        
    }
}
