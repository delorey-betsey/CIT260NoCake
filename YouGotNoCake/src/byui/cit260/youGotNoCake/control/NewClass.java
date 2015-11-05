                +"\n-----------------------------------------------------------"
                +"\n01-Barbershop      10-Manhole         19-Skate Park  "
                +"\n02-Your Backyard   11-Treehouse       20-Dark Alley"
                +"\n03-Friend's House  12-Outhouse        21-Dollar Theatre"
                +"\n04-Your Frontyard  13-Playground      22-Motel 6"
                +"\n05-Museum          14-Skool           23-Dr. Roots"
                +"\n06-Garage          15-Florist         24-Police Station"
                +"\n07-Soviet Bakeshop 16-Grandma's House 25-BYUI Computer Lab "
                +"\n08-Albertson's     17-Creepy Guy's House"  
                +"\n09-Filling Station 18-Library  "
                +"\n------------------------------------------------------------"
   
public void doAction(char selection){
        switch (selection){
            case '01': //display Barbershop
                this.display01();
                break;
            case '02': //display Your Backyard
                this.crossOffList();
                break;
            case '03': //display Friend's House
                this.chooseLocation();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
public void display01() {
        //Barbershop
        System.out.println("*\n Welcome to the Barbershop--");
        
        System.out.println("*\nNo cake here…"       
                + "\nBut there is blood all over the razor…or is it frosting?"
                + "\n"
                + "\nNothing happening here."
                + "\n"
                + "\nN - Next location."   
                + "\n     ");       
        System.out.println("*\n **********************************************");        
    }
public void display02() {
        //Your Backyard
        System.out.println("*\n Welcome to Your Own Backyard--");
        
        System.out.println("*\nNo cake here )-: But there's something for your list!"       
                + "\nNeighborhood bully.  Run! Never mind this toy bat, "
                + "\nwhere’s my tranquilizer dart when I need it."
                + "\n "
                + "\nC - Cross item off my list."
                + "\nN - Next location."   
                + "\n     "); 
        System.out.println("*\n **********************************************");        
    }
public void display03() {
        //Friend's House
        System.out.println("*\n Welcome to Your Best Friend's House--");
        
        System.out.println("*\nNo cake here )-: But you may learn something."       
                + "\nHey buddy, tell me again, how many days until the Christmas."
                + "\nHope you’re bein’ nice."
                + "\nEnter today’s date.  Hit 'Enter'."
                + "\n"
                + "\nD - Do calculation."   
                + "\nN - Next location.");  
        System.out.println("*\n **********************************************");        
    }