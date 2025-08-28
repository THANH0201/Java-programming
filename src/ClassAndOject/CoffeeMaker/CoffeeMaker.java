package ClassAndOject.CoffeeMaker;

public class CoffeeMaker {
    private boolean isOn = false;
    private String[] type = {"Normal","Espresso"};
    private int choice = 0;
    private CoffeeMaker myCoffeeMaker;
    private int amount = 10;

    public boolean isOn() {
        return isOn;
    }
    public void pressOnOff() {
        if(isOn) {
            isOn = true;
        }
    }
    public void setCoffeeType(int choice) {
        if (choice >type.length-1) {
            this.choice = 0;
        }else {
            this.choice = choice;
        }
    }
    public int getchoice() {
        return choice;
    }
    public String getCoffeeType() {
        return type[choice];
    }
    public void setCoffeeAmount(int amount) {
        if (amount > 80) {
            this.amount = 10;
        } else {
            this.amount = amount;
        }
    }
    public int getCoffeeAmount() {
        return amount;
    }
}
