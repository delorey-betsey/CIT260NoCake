package byui.cit260.youGotNoCake.view;
import java.util.Scanner;
/**
 *
 * @author Betsey
 */
public class MainMenuView {
    
    private final String MENU = "\n"
        +"-----------------------------------------------------------------------"
        +"\n          Main Menu"
        +"\n-----------------------------------------------------------------------"
        +"\n          N - Start new game"
        +"\n          G - Get and start existing game"
        +"\n          H - Get help on how to play the game"
        +"\n          S - Save game"
        +"\n          E - Exit"
        +"\n-----------------------------------------------------------------------";
    
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
            System.out.println(">>> Enter main menu selection below.");
            
            //get the choice from the keyboard and trim off the blanks

            selection = keyboard.nextLine();
            selection = selection.trim();
            
            // if the selection is a valid menu choice
            if (selection.length() > 1) {
                System.out.println("Invalid selection - must be one valid letter.");
            }else{
            if("N".equals(selection) ||
                "G".equals(selection) ||
                "H".equals(selection) ||
                "S".equals(selection) ||
                "E".equals(selection) ){
                break; //out of the repetition (exit)
            }else
                System.out.println("Invalid selection - must be one valid letter.");
            }
        }
    return selection;     //return the name
    }
    
    public void doAction(char selection){
        switch (selection){
            case 'N': //create and start a new game
                this.displayLocationMenu();
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
                System.out.println("Invalid selection - must be one valid letter.");
        }
    }
    
     private void displayLocationMenu() {
        //display Help menu

        LocationMenuView locationMenu = new LocationMenuView();
        locationMenu.displayLocationMenu();
    }
    
    private void startExistingGame() {
        //START EXISTING GAME ** ADD LANGUAGE TO GET SAVED GAME
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
        //display Help menu

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");    
    }    
}
