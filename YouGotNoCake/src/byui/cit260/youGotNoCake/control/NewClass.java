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
            case '04'://display Your Frontyard
                this.crossOffList();
                break;
            case '05': //display Meuseum
                this.display05());
                break;
            case '06': //display Garage
                this.crossOffList();
                break;
            case '07': //display Soviet Bakeshop
                this.youLose();
                break;
            case '08': //display Albertson’s
                this.crossOffList();
                break;
            case '09': //display Filling Station
                this.crossOffList();
                break;
            case '10': //display Manhole
                this.chooseLocation();
                break;
            case '11': //display Treehouse
                this.display11();
                break;
            case '12': //display Outhouse
                this.crossOffList();
                break;
            case '13': //display Playground
                this.crossOffList();
                break;
            case '14': //display School
                this.chooseLocation();
                break;
            case '15': //display Florist
                this.crossOffList();
                break;
            case '16': //display Grandma's House
                this.youWin();
                break;
            case '17': //display Creepy Guy’s House
                this.youLose();
                break;
            case '18': //display Library
                this.display18();
                break;
            case '19': //display Skate park
                this.display19();
                break;
            case '20': //display Dark Alley
                this.crossOffList();
                break;
            case '21': //display Dollar Theatre
                this.crossOffList();
                break;
            case '22': //display Motel 6
                this.youWin();
                break;
            case '23': //display Dr. Roots
                this.youLose();
                break;
            case '24': //display Police Station
                this.crossOffList();
                break;
            case '25': //display BYUI Computer Lab
                this.crossOffList();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
public void display01() {
        //Barbershop
        System.out.println("*\n Welcome to the Barbershop--");
        
        System.out.println("*\n No cake here…"       
                + "\n But there is blood all over the razor…or is it frosting?"
                + "\n"
                + "\n Nothing happening here."
                + "\n"
                + "\n N - Next location."   
                + "\n     ");       
        System.out.println("*\n **********************************************");        
    }
public void display02() {
        //Your Backyard
        System.out.println("*\n Welcome to Your Own Backyard--");
        
        System.out.println("*\n No cake here )-: But there's something for your list!"       
                + "\n Neighborhood bully.  Run! Never mind this toy bat, "
                + "\n where’s my tranquilizer dart when I need it."
                + "\n "
                + "\n C - Cross item off my list."
                + "\n N - Next location."   
                + "\n     "); 
        System.out.println("*\n **********************************************");        
    }
public void display03() {
        //Friend's House
        System.out.println("*\n Welcome to Your Best Friend's House--");
        
        System.out.println("*\n No cake here )-: But you may learn something."       
                + "\n Hey buddy, tell me again, how many days until the Christmas."
                + "\n Hope you’re bein’ nice."
                + "\n Enter today’s date.  Hit 'Enter'."
                + "\n"
                + "\n D - Do calculation."   
                + "\n N - Next location.");  
        System.out.println("*\n **********************************************");        
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
        //Museum
        System.out.println("*\n Welcome to Museum");
                
        System.out.println("*\n Marie Antoinette’s Cake"
                + "\n It's stale, you try to take a bite. You crack a tooth."
                + "\n "
                + "\n Better see Dr. Roots."
                + "\n "
                + "\n "
                + "\n N - next location.");
        System.out.println("*\n **********************************************");
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
        System.out.println("*\n Welcome to Manhole");
                
        System.out.println("*\n No cake here…"
                + "\n Based on your family’s habits,"
                + "\n how many gallons of water do you put into your sewage system per day."
                + "\n Enter number of household flushes. Hit Enter."
                + "\n D - do calculations"
                + "\n No wonder it doesn’t smell very good down here."
                + "\n N - next location");
        System.out.println("*\n **********************************************");
}
public void display11() {
        //Treehouse
        System.out.println("*\n Welcome to Treehouse");
                
        System.out.println("*\n No cake here."
                + "\n Inspiration:"
                + "\n When the going gets tough, the tough get going."
                + "\n "
                + "\n "
                + "\n "
                + "\n N - next location");
        System.out.println("*\n **********************************************");
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
        System.out.println("*\n Welcome to School");
                
        System.out.println("*\n No cake here."
                + "\n While you are here we would love to calculate your BMI."
                + "\n Enter your age and height. Press enter."
                + "\n "
                + "\n D - do calculations"
                + "\n Knowledge is power!"
                + "\n N - next location");
        System.out.println("*\n **********************************************");
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
        System.out.println("*\n Welcome to Grandma’s House");
                
        System.out.println("*\n Cupcakes"
                + "\n These’ll do. The End. Good bye."
                + "\n "
                + "\n "
                + "\n You Win!"
                + "\n "
                + "\n E - end game.");
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
        //Library
        System.out.println("*\n Welcome to Library");
                
        System.out.println("*\n No cake here."
                + "\n Theres cookbooks. Shhhhhhhhhh. ZZZZzzzzzzzz."
                + "\n "
                + "\n "
                + "\n "
                + "\n "
                + "\n N - next location");
        System.out.println("*\n **********************************************");
}
public void display19() {
        //Skate park
        System.out.println("*\n Welcome to Skate park");
                
        System.out.println("*\n No cake here."
                + "\n Inspiration:  Never, never, never, never give up."
                + "\n "
                + "\n "
                + "\n "
                + "\n "
                + "\n N - next location.");
        System.out.println("*\n **********************************************");
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
        System.out.println("*\n Welcome to Motel 6");
                
        System.out.println("*\n Cake!"
                + "\n Party time!  Excellent!! The End. Good bye."
                + "\n "
                + "\n You win."
                + "\n "
                + "\n "
                + "\n E - end game");
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