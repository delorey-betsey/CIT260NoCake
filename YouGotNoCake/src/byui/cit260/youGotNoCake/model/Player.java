package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player implements Serializable{ 
    //class-instance variables
    private String name;
    private Number gameID;
    private String gameStatus;
    private ArrayList<String> foundCakeIngredients;
    private ArrayList<String> foundPartySupplies;
    private ArrayList<String> foundSleepAids;

    public Player() {
        foundCakeIngredients = new ArrayList<String>();
        foundPartySupplies = new ArrayList<String>();
        foundSleepAids = new ArrayList<String>();
    }  

    public ArrayList<String> sortPlayerItems (ArrayList<String> itemsToSort) {
        itemsToSort.sort( new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        
        return itemsToSort;
    }
    
    public boolean hasItem(String item) {
        boolean hasItem = false;
        if (foundCakeIngredients.contains(item) 
                || foundPartySupplies.contains(item) 
                || foundSleepAids.contains(item)) {
            hasItem = true;
        }
        return hasItem;
    }
    
    public ArrayList<String> getFoundCakeIngredients() {
        return foundCakeIngredients;
    }

    public void setFoundCakeIngredients(ArrayList<String> foundCakeIngredients) {
        this.foundCakeIngredients = foundCakeIngredients;
    }

    public ArrayList<String> getFoundPartySupplies() {
        return foundPartySupplies;
    }

    public void setFoundPartySupplies(ArrayList<String> foundPartySupplies) {
        this.foundPartySupplies = foundPartySupplies;
    }

    public ArrayList<String> getFoundSleepAids() {
        return foundSleepAids;
    }

    public void setFoundSleepAids(ArrayList<String> foundSleepAids) {
        this.foundSleepAids = foundSleepAids;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public Number getGameID() {
        return gameID;
    }

    public void setGameID(Number gameID) {
        this.gameID = gameID;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gameID=" + gameID + ", gameStatus=" + gameStatus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.gameID);
        hash = 37 * hash + Objects.hashCode(this.gameStatus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gameID, other.gameID)) {
            return false;
        }

        return true;
    }

}
