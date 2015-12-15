package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Playground implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private String foundItem;

    public Playground(Player player) {
        this.mmvPlayer = player;
        this.locationID = 13;
        this.foundItem = "Plastic Fork";
    }

    public Player pickupItem() {
        
            for (String cakeIngredient : new CakeIngredients().getCakeIngredientsArray()) {
                if (cakeIngredient.equalsIgnoreCase(foundItem)) {
                    mmvPlayer.getFoundCakeIngredients().add(foundItem);
                }
            }

            for (String partySupply : new PartySupplies().getPartySuppliesArray()) {
                if (partySupply.equalsIgnoreCase(foundItem)) {
                    mmvPlayer.getFoundPartySupplies().add(foundItem);
                }
            }
        return mmvPlayer;
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
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
        final Playground other = (Playground) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Playground{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}
