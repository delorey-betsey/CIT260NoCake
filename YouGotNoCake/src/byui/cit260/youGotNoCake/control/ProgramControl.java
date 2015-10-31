/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;

<<<<<<< HEAD
/**
 *
 * @author Alyse
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
=======
public class ProgramControl {    

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        YouGotNoCake.setPlayer(player);  //save the player
        
        return player;
    }
}
    
    
>>>>>>> origin/master
