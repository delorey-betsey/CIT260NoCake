package byui.cit260.youGotNoCake.view;
import java.util.Scanner;
/**
 *
 * @author Betsey
 */
class LocationMenuView {
//receive player choice and display location text
    
    private final String LOCATION = "\n"
        +"-----------------------------------------------------------------------"
        +"\n          Location Menu"
        +"\n-----------------------------------------------------------------------"
        +"\n          1-Barbershop        8-Albertson's     15-Florist"
        +"\n          2-Your Backyard     9-Filling Station 16-Grandma's House"
        +"\n          3-Friend's House    10-Manhole        17-Creepy Guy's House"
        +"\n          4-Your Frontyard    11-Treehouse      18-Library"
        +"\n          5-Museum            12-Outhouse       19-Skate Park"
        +"\n          6-Garage            13-Playground     20-Dark Alley"
        +"\n          7-Soviet Bakeshop   14-Skool          21-Dollar Theatre"	
        +"\n          22-Motel 6          23-Dr. Roots      24-Police Station"
        +"\n          25-BYUI Computer Lab"
        +"\n\n        E-Exit"
        +"\n-----------------------------------------------------------------------";

    public void displayLocationMenu() {
    
        char selection = ' ';
        
        int location = 0;
        
        do {
            System.out.println(LOCATION);  //display the location menu
            
            String input = this.getInput();   //get the user's selection
            selection = input.charAt(0);  //get first character of string
        
        }   //while the selection is not Exit we do the loop otherwise
            //we fall through back to Main Menu
            while (selection != 'E');  
    }
    
    private static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException | NullPointerException e) { 
            return false; 
        }
        // only got here if we didn't return false
        return true;
    }
    
    private String getInput() {

            boolean valid = false;    //indicates if the choice has been retrieved
            String selection = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter location selection below:");

            //get the choice from the keyboard and trim off the blanks

            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            if (selection.charAt(0) != 'E'){
                if (isInteger(selection)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    int location = Integer.parseInt(selection);
                    if (location > 0 && location < 28){
                        this.doAction(location);
                    }  
                } else {
                    System.out.println("\n*** Invalid selection *** Try again.");
                }
            }
            return selection;     //return the valid choice
        }

    public void doAction(int location){
        switch (location){
            case 1: //display barbershop text
                this.display01();
                break;
            case 2: //display Your Backyard
                this.display02();
                break;
            case 3: //display Friend's House
                this.display03();
                break;
            case 4://display Your Frontyard
                this.display04();
                break;
            case 5: //display Meuseum
                this.display05();
                break;
            case 6: //display Garage
                this.display06();
                break;
            case 7: //display Soviet Bakeshop
                this.display07();
                break;
            case 8: //display Albertson’s
                this.display08();
                break;
            case 9: //display Filling Station
                this.display09();
                break;
            case 10: //display Manhole
                this.display10();
                break;
            case 11: //display Treehouse
                this.display11();
                break;
            case 12: //display Outhouse
                this.display12();
                break;
            case 13: //display Playground
                this.display13();
                break;
            case 14: //display School
                this.display14();
                break;
            case 15: //display Florist
                this.display15();
                break;
            case 16: //display Grandma's House
                this.display16();
                break;
            case 17: //display Creepy Guy’s House
                this.display17();
                break;
            case 18: //display Library
                this.display18();
                break;
            case 19: //display Skate park
                this.display19();
                break;
            case 20: //display Dark Alley
                this.display20();
                break;
            case 21: //display Dollar Theatre
                this.display21();
                break;
            case 22: //display Motel 6
                this.display22();
                break;
            case 23: //display Dr. Roots
                this.display23();
                break;
            case 24: //display Police Station
                this.display24();
                break;
            case 25: //display BYUI Computer Lab
                this.display25();
                break;
//            case 'E': //exit the program
//                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
    }

        public void display01() {
        //Barbershop
            System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to the Barbershop---------------------------------------------");

        System.out.println("*\nNo cake here… )-:"       
        + "\nBut there IS blood all over the razor…or is it frosting?"
        + "\n"
        + "\nNothing happening here.  Continue your quest...");
        System.out.println(
       "\n======================================================================");             
        }
        
        public void display02() {
            
        //Your Backyard
        System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to Your Own Backyard------------------------------------------");

        System.out.println("*\n No cake here... )-:"     
        + "\nYikes, Neighborhood Bully!  Run!! Never mind a toy bat, "
        + "\nwhere’s my tranquilizer dart when I need it?!?!??"
        + "\n"
        + "\nHold on, there IS something for your list!");  

            CrossOffItemMenuView crossOffItemMenuView = new CrossOffItemMenuView();
            crossOffItemMenuView.displayMenu(); 
        }
        
        public void display03() {
            
        //Friend's House
        System.out.println(
        "======================================================================");    
        System.out.println(
     "*\nWelcome to Your Best Friend's House-----------------------------------");

        System.out.println("*\nNo cake here )-:" 
        + "\nBut you may learn something." 
        +"\nWe know you're excited for Christmas!"
        + "\nHey buddy, tell me again, how many days until Christmas?"); 
                
            CalcXmasMenuView xmasMenuView = new CalcXmasMenuView();
            xmasMenuView.displayMenu();
        }
        
        public void display04() {
                //Your own frontyard
                System.out.println("*\n Welcome to Your own frontyard");

                System.out.println("*\n No cake here )-: But you find some bananas."
                        + "\n You better grab some of those bananas from your shade tree." 
                        + "\n You might wind up having to make your own cake."
                        + "\n "
                        + "\n "
                        + "\n Cross item off my list."
                        + "\n N - next location.");
                System.out.println("*\n **********************************************");
        }
        
        public void display05() {
        //Barbershop
            System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to the Museum-------------------------------------------------");

        System.out.println("*\nNo cake here… )-:"       
        + "\nAt least none that's edible.  You try Marie Antoinette's Cake but"
        + "\nit's so stale, you crack a tooth. Better see Dr. Roots. "
        + "\n"
        + "\nNothing good happening here.  Continue your quest...");
        System.out.println(
       "\n======================================================================");             
        }    
        
        public void display06() {
                //Garage
                System.out.println("*\n Welcome to Garage");

                System.out.println("*\n No cake here."
                        + "\n But who should be over there"  
                        + "\n behind the pile of newspapers"
                        + "\n next to the gasoline soaked rags,"
                        + "\n but the sleep apnea fairy??"
                        + "\n Cross item off my list."
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display07() {
                //Soviet Bakeshop
                System.out.println("*\n Welcome to Soviet Bakeshop");

                System.out.println("*\n Cake eats you!"
                        + "\n я мертв. Конец. До свидания."
                        + "\n (I’m dead. The End. Bye.)"
                        + "\n "
                        + "\n You Lose!"
                        + "\n S - start new game"
                        + "\n E - exit game");
                System.out.println("*\n **********************************************");
        }
        
        public void display08() {
                //Albertson’s
                System.out.println("*\n Welcome to Albertson’s");

                System.out.println("*\n No cake here."
                        + "\n Smile, you’re on security cameras."
                        + "\n So remember, that 5 gallon tub of spumoni isn’t free."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display09() {
                //Filling Station
                System.out.println("*\n Welcome to Filling Station");

                System.out.println("*\n No cake here."
                        + "\n I thought that’s what they used to call gas stations."
                        + "\n But these guys are pushing sugar out of their pumps."
                        + "\n Get me outta here."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display10() {
            
        //Manhole
        System.out.println(
        "======================================================================");    
        System.out.println(
     "*\nWelcome to the Manhole------------------------------------------------");

        System.out.println("*\n No cake here…"
        + "\nDid you know?..."
        + "\nAmericans use more water each day by flushing the toilet than they do"
        + "\nby showering or any other activity."
        + "\nSave water!  Check your toilet for leaks.  Adjust the water level.");
        
        System.out.println("*\n **********************************************");
         
            CalcGallonsMenuView calcGallonsMenuView = new CalcGallonsMenuView();
            calcGallonsMenuView.displayMenu();
        }
        
        public void display11() {
        //Barbershop
            System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to the Treehouse----------------------------------------------");

        System.out.println("*\nNo cake here… )-:"       
        + "\nBut it's a good place to catch up on your meditation, Ommmmm..."
        + "\nWhen the going gets tough, the tough get going!"
        + "\nOmmm...When the going gets tough, the tough get going!"
        + "\nOmmm...When the going gets tough, the tough get going!"
        + "\n"
        + "\nNothing happening here.  Continue your quest...");
        System.out.println(
       "\n======================================================================");             
        }
 
        public void display12() {
                //Outhouse
                System.out.println("*\n Welcome to Outhouse");

                System.out.println("*\n No cake here."
                        + "\n But thankfully someone forgot their whoopie cushion."
                        + "\n That will come in handy for the birthday party later."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display13() {
                //Playground
                System.out.println("*\n Welcome to Playground");

                System.out.println("*\n No Cake here."
                        + "\n Oh my heavens, that kid is being hauled off to jail as he should be."
                        + "\n Can you believe he had a plastic fork in his lunch box??"
                        + "\n Catastrophe averted!"
                        + "\n "
                        + "\n Cross item off list."
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display14() {
                //School
                System.out.println("*\n Welcome to Skool");

                System.out.println("*\n No cake here."
                        + "\nWhile you are here we would love to calculate your BMI."
                        + "\nKnowledge is power!");
                System.out.println("*\n **********************************************");
                
                CalcBMIMenuView bmiMenuView = new CalcBMIMenuView();
                bmiMenuView.displayMenu();
                //display result.
                //display location menu
        }
        
        public void display15() {
                //Florist
                System.out.println("*\n Welcome to Florist");

                System.out.println("*\n No cake here."
                        + "\n I said flour you idiot, not flower."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n "
                        + "\n N- next location");
                System.out.println("*\n **********************************************");
        }
       
        public void display16() {
        //Grandma’s House
        System.out.println(
        "======================================================================");    
        System.out.println(
     "*\nWelcome to Your Grandma's House---------------------------------------"); 

        System.out.println("*\nCupcakes!!"
                + "\nThese’ll do. YOU WIN!!"
                + "\n "
                + "\nYOU WIN!! The End. Good bye."
                + "\n"
                + "\nE - Exit.");
        System.out.println("*\n **********************************************");
        }
 
        
        public void display17() {
                //Creepy Guy’s House
                System.out.println("*\n Welcome to Creepy Guy’s House");

                System.out.println("*\n No Cake."
                        + "\n Your end. The End. Good bye."
                        + "\n "
                        + "\n You Lose!"
                        + "\n "
                        + "\n "
                        + "\n E - end game");
                System.out.println("*\n **********************************************");
        }
        
        public void display18() {
        //Barbershop
        System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to the Library------------------------------------------------");

        System.out.println("*\nNo cake here… )-:"       
        + "\nBut there are tons of cookbooks!  YIPPEE! Shhhhhhhhhh!! ZZZZzzzzzzzz."
        + "\n"
        + "\nNothing happening here.  Continue your quest...");
        System.out.println(
       "\n======================================================================");             
        }

         public void display19() {
        //Barbershop
        System.out.println(
        "======================================================================");
        System.out.println(
     "*\nWelcome to the Skate Park---------------------------------------------");

        System.out.println("*\nNo cake here… )-:"       
        + "\nYou need a little inspiration.  Here ya go:  "
        + "Never, never, never, never give up."
        + "\n"
        + "\nNothing good to eat here.  Continue your quest...");
        System.out.println(
       "\n======================================================================");             
        }  

        public void display20() {
                //Dark Alley
                System.out.println("*\n Welcome to Dark Alley");

                System.out.println("*\n No cake here."
                        + "\n Dumpster with empty cakebox."
                        + "\n You’re on the trail."
                        + "\n And, oh look, a copy of the tax code."
                        + "\n Cross item off list."
                        + "\n "
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display21() {
                //Dollar Theatre
                System.out.println("*\n Welcome to Dollar Theatre");

                System.out.println("*\n No cake here."
                        + "\n But that guy in the back row sure has moves smooth as butta."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n "
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display22() {
        //Motel 6
        System.out.println(
        "======================================================================");    
        System.out.println(
     "*\nWelcome to Motel 6-----------------------------------------------------"); 
      
        System.out.println("*\nCake!!"
        + "\nParty time!  Excellent!! YOU WIN!!"
        + "\n"
        + "\nYOU WIN!! The End. Good bye."
        + "\n"
        + "\nE - Exit.");
        System.out.println("*\n **********************************************");
        }
        
        public void display23() {
                //Dr. Roots
                System.out.println("*\n Welcome to Dr. Roots");

                System.out.println("*\n You get more laughing gas."
                        + "\n You wake up in a tree. The End. Good bye."
                        + "\n "
                        + "\n You lose!"
                        + "\n "
                        + "\n "
                        + "\n E - end game");
                System.out.println("*\n **********************************************");
        }
        
        public void display24() {
                //Police Station
                System.out.println("*\n Welcome to Police Station");

                System.out.println("*\n This isn't cake."
                        + "\n It's donuts. I can wash ‘em down with warm milk."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n "
                        + "\n N - next location");
                System.out.println("*\n **********************************************");
        }
        
        public void display25() {
                //BYUI Computer Lab
                System.out.println("*\n Welcome to BYUI Computer Lab");

                System.out.println("*\n No cake here."
                        + "\n Why are there so many old people in all my classes?"
                        + "\n That explains the grim reaper in the corner."
                        + "\n "
                        + "\n Cross item off list."
                        + "\n "
                        + "\n N - next location.");
                System.out.println("*\n **********************************************");
        }


    }
