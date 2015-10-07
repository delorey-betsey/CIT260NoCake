/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

import byui.cit260.youGotNoCake.model.Player;

/**
 *
 * @author Alyse
 */
public class YouGotNoCake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setFirstName("Mark");
        playerOne.setLastName("Smith");
        playerOne.setGameID(100);
        playerOne.setGameStatus("gameOff");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
