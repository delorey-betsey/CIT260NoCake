package byui.cit260.youGotNoCake.model;

import java.io.Serializable;

public class SleepAids implements Serializable{
    //class-instance variables
    private String itemApneaFairy;
    private String itemTranquilDart;
    private String itemTaxCode;
    private String itemWarmMilk;
    private String[] sleepAidsArray;

    public SleepAids() {
        itemApneaFairy = "Apnea Fairy";
        itemTranquilDart = "Tranquilizer Dart";
        itemTaxCode = "Tax Code";
        itemWarmMilk = "Warm Milk";
        sleepAidsArray = new String[]{this.itemApneaFairy, this.itemTaxCode, this.itemTranquilDart, this.itemWarmMilk};
    }

    public String[] getSleepAidsArray() {
        return sleepAidsArray;
    }
    
    public String getItemApneaFairy() {
    return itemApneaFairy;
    }

    public void setItemApneaFairy(String itemApneaFairy) {
        this.itemApneaFairy = itemApneaFairy;
    }

    public String getItemTranquilDart() {
        return itemTranquilDart;
    }

    public void setItemTranquilDart(String itemTranquilDart) {
        this.itemTranquilDart = itemTranquilDart;
    }

    public String getItemTaxCode() {
        return itemTaxCode;
    }

    public void setItemTaxCode(String itemTaxCode) {
        this.itemTaxCode = itemTaxCode;
    }

    public String getItemWarmMilk() {
        return itemWarmMilk;
    }

    public void setItemWarmMilk(String itemWarmMilk) {
        this.itemWarmMilk = itemWarmMilk;
    }
}
