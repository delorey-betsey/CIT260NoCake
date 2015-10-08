/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

import byui.cit260.youGotNoCake.model.CakeIngredients;
import byui.cit260.youGotNoCake.model.CalcBMI;
import byui.cit260.youGotNoCake.model.CalcGallons;
import byui.cit260.youGotNoCake.model.CalcXmas;
import byui.cit260.youGotNoCake.model.Calculations;
import byui.cit260.youGotNoCake.model.CreepyHseL;
import byui.cit260.youGotNoCake.model.DrRootsDentalL;
import byui.cit260.youGotNoCake.model.Friends;
import byui.cit260.youGotNoCake.model.GrandmasW;
import byui.cit260.youGotNoCake.model.Lists;
import byui.cit260.youGotNoCake.model.Manhole;
import byui.cit260.youGotNoCake.model.Map;
import byui.cit260.youGotNoCake.model.Motel6W;
import byui.cit260.youGotNoCake.model.PartySupplies;
import byui.cit260.youGotNoCake.model.Player;
import byui.cit260.youGotNoCake.model.School;
import byui.cit260.youGotNoCake.model.SleepAids;
import byui.cit260.youGotNoCake.model.SovietBakeShopL;

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
        
        Lists listsOne = new Lists();
        listsOne.setListName("CakeIngredients");
        listsOne.setNumItemsFound(4);
        String listsInfo = listsOne.toString();
        System.out.println(listsInfo);
        
        CakeIngredients cakeIngredientsOne = new CakeIngredients();
        cakeIngredientsOne.setItemFlour("YES");
        cakeIngredientsOne.setItemSugar("NO");
        cakeIngredientsOne.setItemButta("YES");
        cakeIngredientsOne.setItemBananas("NO"); 
        String cakeIngredientsInfo = cakeIngredientsOne.toString();
        System.out.println(cakeIngredientsInfo);
        
        PartySupplies partySuppliesOne = new PartySupplies();
        partySuppliesOne.setItemWhoopie("NO");
        partySuppliesOne.setItemSpumoni("NO");
        partySuppliesOne.setItemGrimReaper("NO");
        partySuppliesOne.setItemPlasticFork("NO"); 
        String partySuppliesInfo = partySuppliesOne.toString();
        System.out.println(partySuppliesInfo);
        
        SleepAids sleepAidsOne = new SleepAids();
        sleepAidsOne.setItemApneaFairy("YES");
        sleepAidsOne.setItemTranquilDart("YES");
        sleepAidsOne.setItemTaxCode("YES");
        sleepAidsOne.setItemWarmMilk("NO"); 
        String sleepAidsInfo = sleepAidsOne.toString();
        System.out.println(sleepAidsInfo);
        
        Map mapOne = new Map();
        mapOne.setLocationID(02);
        mapOne.setPlayerChoice(02);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Motel6W motel6WOne = new Motel6W();
        motel6WOne.setLocationID(15);
        motel6WOne.setLocationText("Party time!  Excellent!! The End. Good bye.");
        motel6WOne.setCongratsYouWin("Win");
        String motel6WInfo = motel6WOne.toString();
        System.out.println(motel6WInfo);
        
        GrandmasW grandmasWOne = new GrandmasW();
        grandmasWOne.setLocationID(21);
        grandmasWOne.setLocationText("These’ll do. The End. Good bye.");
        grandmasWOne.setCongratsYouWin("Win");
        String grandmasWInfo = grandmasWOne.toString();
        System.out.println(grandmasWInfo);
        
        CreepyHseL creepyHseLOne = new CreepyHseL();
        creepyHseLOne.setLocationID(13);
        creepyHseLOne.setLocationText("Your end.  The End. Good bye.");
        creepyHseLOne.setBooHooYouLose("Loss");
        String creepyHseLInfo = creepyHseLOne.toString();
        System.out.println(creepyHseLInfo);
        
        DrRootsDentalL drRootsDentalLOne = new DrRootsDentalL();
        drRootsDentalLOne.setLocationID(14);
        drRootsDentalLOne.setLocationText("You wake up in a tree. The End. Good bye.");
        drRootsDentalLOne.setBooHooYouLose("Loss");
        String drRootsDentalLInfo = drRootsDentalLOne.toString();
        System.out.println(drRootsDentalLInfo);
        
        SovietBakeShopL sovietBakeShopLOne = new SovietBakeShopL();
        sovietBakeShopLOne.setLocationID(15);
        sovietBakeShopLOne.setLocationText("я мертв. Конец. До свидания.");
        sovietBakeShopLOne.setBooHooYouLose("Loss");
        String sovietBakeShopLInfo = sovietBakeShopLOne.toString();
        System.out.println(sovietBakeShopLInfo);
        
        Friends friendsOne = new Friends();
        friendsOne.setLocationID(11);
        friendsOne.setLocationText("But tell me again, how many days until the Christmas.  Enter today’s date.  Hope you’re bein’ nice.");
        friendsOne.setCalcXmas("2015-12-25");
        friendsOne.setTodaysDate("2015-10-31");
        friendsOne.setPlayerDaysToXmas(78);
        String friendsInfo = friendsOne.toString();
        System.out.println(friendsInfo);
        
        Manhole manholeOne = new Manhole();
        manholeOne.setLocationID(8);
        manholeOne.setLocationText("Based on your family’s habits, how many gallons of water do you put into your sewage system per day.  Enter number of household flushes.  No wonder it doesn’t smell very good down here.");
        manholeOne.setCalcFlushes("YES");
        manholeOne.setNumFamilyMbrs(25);
        manholeOne.setPlayerGallonsFlushed(30);
        String manholeInfo = manholeOne.toString();
        System.out.println(manholeInfo);
        
        School schoolOne = new School();
        schoolOne.setLocationID(6);
        schoolOne.setLocationText("But while you are here we would love to calculate your BMI.  Enter your age and height.  Knowledge is power.");
        schoolOne.setCalcBMI("YES");
        schoolOne.setPlayerHeight(66);
        schoolOne.setPlayerWeight(128);
        schoolOne.setPlayerBMI(20.7);
        String schoolInfo = schoolOne.toString();
        System.out.println(schoolInfo);
        
        Calculations calculationsOne = new Calculations();
        calculationsOne.setNumInput1(10);
        calculationsOne.setNumInput2(20);
        calculationsOne.setNumInput3(30);
        calculationsOne.setNumInput4(40);
        calculationsOne.setInput1("red");
        calculationsOne.setInput2("white");
        calculationsOne.setInput3("blue");
        calculationsOne.setNumberOutput(50);
        calculationsOne.setStringOutput("hurray");
        String calculationsInfo = calculationsOne.toString();
        System.out.println(calculationsInfo);
        
        CalcXmas calcXmasOne = new CalcXmas();
        calcXmasOne.setTodaysDate("2015-10-31");
        calcXmasOne.setResult("78");
        calcXmasOne.setXmasDay("2015-12-25");
        String calcXmasInfo = calcXmasOne.toString();
        System.out.println(calcXmasInfo);
        
        CalcBMI calcBMIOne = new CalcBMI();
        calcBMIOne.setHeight(66);
        calcBMIOne.setWeight(128);
        calcBMIOne.setResult(20.7);
        String calcBMIInfo = calcBMIOne.toString();
        System.out.println(calcBMIInfo);
        
        CalcGallons calcGallonsOne = new CalcGallons();
        calcGallonsOne.setMembers(12);
        calcGallonsOne.setResult(42);
        String calcGallonsInfo = calcGallonsOne.toString();
        System.out.println(calcGallonsInfo);
    }
    
}
