/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;
import byui.cit260.youGotNoCake.control.GameControl;
import byui.cit260.youGotNoCake.control.Game;
import byui.cit260.youGotNoCake.model.Player;
import byui.cit260.youGotNoCake.control.ProgramControl;
import byui.cit260.youGotNoCake.model.Player;
import java.util.Scanner;


public class StartProgramView {
    
    private static Game currentGame = null;
    private static Player player = null;
    
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
        System.out.println("*\n GAME DESCRIPTION AND HOW TO PLAY-- ");
        
        System.out.println("*\nImagine you wake up in a closet. When you open"       
                + "\nthe closet door, you find that there was a birthday party,"
                + "\nbut now everyone is gone.  All that remains are limp balloons"
                + "\nhanging from the rafters, crushed confetti on"
                + "\nthe floor and paper party plates with telltale cake crumbs."
                + "\nNaturally, you check to see if there is any cake left,"   
                + "\nbut to your displeasure, there is none. "); 
        
        System.out.println("*\nNow all you can think about is cake.  You are on"
                + "\na mission to find cake.  You are in a house but you know there "
                + "\nis no cake here.  You discover the house is in some questionable "
                + "\nneighborhood. You think about how handy a plastic fork and a "
                + "\ntoy bat would be right about now.  And you begin to roam through "
                + "\nthe town, trying to survive your quest to find some cake. ");
              
        System.out.println("*\nThere will be various twists and turns in the "
                + "\nneighborhood that looks like any other, but definitely is not. "
                + "\nYou may encounter pretty weird characters. The Big Question is—"
                + "\nWill you find cake before you meet an untimely end?   You may "
                + "\nor may not find cake, but you WILL have fun. *");
        
        System.out.println("*\n ****************************************************** *");        
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
   

////    public static void main(String[] args){
//        
//        //create Start ProgramView and start the program
//        StartProgramView startProgramView 
//                                 = new StartProgramView();
//        startProgramView.startProgram();
//        }

        public static Game getCurrentGame(){
            return currentGame;
        }
        public static void setCurrentGame(Game currentGame) {
            StartProgramView.currentGame = currentGame;
        }
        public static Player getPlayer(){
            return player;
        }
        public static void setPlayer(Player player){
            StartProgramView.player = player;
        }
}
