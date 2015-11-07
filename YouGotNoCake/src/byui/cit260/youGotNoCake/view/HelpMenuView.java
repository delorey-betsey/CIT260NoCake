package byui.cit260.youGotNoCake.view;
import java.util.Scanner;
/**
 *
 * @author Betsey
 */
class HelpMenuView {

    private final String HELP = "\n"
        +"\n---------------------------------------"
        +"\n    Help Menu"
        +"\n---------------------------------------"
        +"\nG - What is the goal of the game?"
        +"\nM - How to move."
        +"\nC - Items on shopping lists."
        +"\nE - Exit"
        +"\n---------------------------------------";
    
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
                System.out.println("Enter help menu selection.");

                //get the choice from the keyboard and trim off the blanks

                selection = keyboard.nextLine();
                selection = selection.trim();

                // if the selection is a valid menu choice
                if (selection.length() > 1) {
                    System.out.println("Invalid selection - must be one valid choice.");
                }else{
                if("G".equals(selection) ||
                    "M".equals(selection) ||
                    "C".equals(selection) ||
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
            case 'G': //display goal of game
                this.displayGoal();
                break;
            case 'M': //display how to move
                this.displayMove();
                break;
            case 'C': //display items on shopping lists
                this.displayCrossOff();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
    }

    private void displayGoal() {
        System.out.println("*\nThe object of the game is to find cake.  You can "
                + "\nget lucky and find cake in two of the 25 locations in the town.  "
                + "\nAutomatic win.  Otherwise, you can win if you find all four "
                + "\nitems on any of the three lists.  Twelve of the 25 locations "
                + "\nhave various items on the player’s shopping lists.  This too "
                + "\nresults in automatically winning the grand cake prize…and your "
                + "\ngame is over. Be careful out there.  You can also get unlucky"
                + "\nand automatially die! The goal of the game is happy, scarey surprises.");
        System.out.println("*\n ****************************************************** *");                       
        }

    private void displayMove() {
        System.out.println("*\nYou play this game by entering input on the screen "
                + "\nand hitting 'Enter'. Follow the prompts to enter menu choices "
                + "\nto go to a new location or cross off items on your shopping "
                + "\nlists.  The program will also ask for player info to make"
                + "\nthree calculations.");

        System.out.println("*\nAlong your way, the game will offer to calculate   "
                + "\nyour BMI, calculate your days until Christmas, and calculate "
                + "\nthe gallons of water your household flushes each day, all based "
                + "\nupon player input.");

        System.out.println("*\n ****************************************************** *"); 
    }

    private void displayCrossOff() {
            System.out.println("*\nAs you are going around town, you figure, why not shop?"
                    + "\nYou are mad about shopping.  You want to find things to make"
                    + "\na cake, things for a birthday party and a variety "
                    + "\nof sleep aids.  You haven’t been sleeping well lately, obviously, "
                    + "\nwaking up in a closet.");
            System.out.println("*\nCake ingredients:" 
                    +"\n1.	Flour" 
                    +"\n2.	Sugar" 
                    +"\n3.	Butta" 
                    +"\n4.	Bananas");

            System.out.println("*\nBirthday party supply list:" 
                    +"\n1.	Whoopie cushion" 
                    +"\n2.	5 gallons of ice cream" 
                    +"\n3.	Grim reaper" 
                    +"\n4.	Plastic forks");

            System.out.println("*\nSleep-aids:" 
                    +"\n1.	Apnea Fairy" 
                    +"\n2.	Tranquilizer dart" 
                    +"\n3.	Tax code" 
                    +"\n4.	Warm milk");}
}