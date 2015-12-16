package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Garage implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private SleepAids foundItem;

    public Garage(Player player) {
        this.mmvPlayer = player;
        this.locationID = 6;
        this.foundItem = SleepAids.APNEA_FAIRY;
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public Player pickupItem() {
        
        if (!mmvPlayer.hasItem(foundItem)) {
        
            for (SleepAids sleepAid : new SleepAids[]{
                SleepAids.APNEA_FAIRY,
                SleepAids.TAX_CODE,
                SleepAids.TRANQUILIZER_DART,
                SleepAids.WARM_MILK
            }) {
                if (sleepAid.equals(foundItem)) {
                    mmvPlayer.getFoundSleepAids().add(foundItem);
                }
            }
        }  else {
            System.out.println("You already have " + foundItem.toString() + ". Choose new location.");
        }           
        return mmvPlayer;
    }
            
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.locationID);
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
        final Garage other = (Garage) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Garage{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}