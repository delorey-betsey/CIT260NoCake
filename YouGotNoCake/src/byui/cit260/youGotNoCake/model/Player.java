/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Alyse
 */
public class Player implements Serializable{ 
    //class-instance variables
    private String firstName;
    private String lastName;
    private Number gameID;
    private String gameStatus;

    public Player() {
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Player{" + "firstName=" + firstName + ", lastName=" + lastName + ", gameID=" + gameID + ", gameStatus=" + gameStatus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.firstName);
        hash = 37 * hash + Objects.hashCode(this.lastName);
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
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.gameID, other.gameID)) {
            return false;
        }
        if (!Objects.equals(this.gameStatus, other.gameStatus)) {
            return false;
        }
        return true;
    }
    
    
    
}
