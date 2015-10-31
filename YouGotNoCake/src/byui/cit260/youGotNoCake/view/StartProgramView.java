/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.control.ProgramControl;
import byui.cit260.youGotNoCake.model.Player;

/**
 *
 * @author Betsey
 */
public class StartProgramView {
    
    public StartProgramView() {
    
    public void startProgram(){
        //Display the banner screen
        this.displayBanner();
        //prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        //Display a personalized welcome message
        //Display the Main menu.
        
    }

    public void displayBanner() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("*\n Game description and how to play. *");
        
        System.out.println("*\n This is a test. *");
        
        System.out.println("*\n This is a test. *");
        
        System.out.println("*\n ************************* *");
        
    }

    private String getPlayersName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
