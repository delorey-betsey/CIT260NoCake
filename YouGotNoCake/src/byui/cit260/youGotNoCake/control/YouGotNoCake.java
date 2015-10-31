/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;
import byui.cit260.youGotNoCake.model.Player;
import byui.cit260.youGotNoCake.view.StartProgramView;


/**
 *
 * @author Betsey
 */
public class YouGotNoCake {  
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args){
        
        //create Start ProgramView and start the program
        StartProgramView startProgramView 
                                 = new StartProgramView();
        startProgramView.startProgram();
        }

        public static Game getCurrentGame(){
            return currentGame;
        }
        public static void setCurrentGame(Game currentGame) {
            YouGotNoCake.currentGame = currentGame;
        }
        public static Player getPlayer(){
            return player;
        }
        public static void setPlayer(Player player){
            YouGotNoCake.player = player;
        }
    }