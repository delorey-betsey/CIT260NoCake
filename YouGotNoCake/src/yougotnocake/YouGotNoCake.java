package yougotnocake;

import byui.cit260.youGotNoCake.control.GameControl;
import byui.cit260.youGotNoCake.model.Player;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class YouGotNoCake {
    
    private static Player player;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;


    public static void main(String[] args){
    
        try {
            // open character stream files for end user input and output
            YouGotNoCake.inFile = new BufferedReader(new InputStreamReader(System.in));
            YouGotNoCake.outFile = new PrintWriter(System.out, true);
            //create Start ProgramView and start the program
            GameControl gameControl = new GameControl();
            gameControl.displayGameMenu();
            //open log file
            File filePath = new File("C:\\tempBill\\log.txt");
            YouGotNoCake.logFile = new PrintWriter (new FileOutputStream(filePath));
            
        } catch (Exception e){
            System.out.println("Exception = " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            try {
                YouGotNoCake.inFile.close();
                YouGotNoCake.outFile.close();
                YouGotNoCake.logFile.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }           
        }
    }
   
    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        YouGotNoCake.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        YouGotNoCake.logFile = logFile;
    }
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        YouGotNoCake.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        YouGotNoCake.outFile = outFile;
    }
 }   
    
    

