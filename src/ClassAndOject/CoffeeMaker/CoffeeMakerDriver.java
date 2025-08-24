package ClassAndOject.CoffeeMaker;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker mycoffeeMaker = new CoffeeMaker();
        for(int j = 0; j < 3; j++) {
            mycoffeeMaker.pressOnOff();
            System.out.println("CoffeeMaker is on");
            for (int i = 0; i < 1; i++) {
                mycoffeeMaker.setCoffeeType(mycoffeeMaker.getchoice() + 1);
                System.out.println("Coffee type is " + mycoffeeMaker.getCoffeeType());

                mycoffeeMaker.setCoffeeAmount(mycoffeeMaker.getCoffeeAmount() + 40);
                System.out.println("Coffee amount is " + mycoffeeMaker.getCoffeeAmount() + " ml");
            }
            mycoffeeMaker.pressOnOff();
            System.out.println("Coffee maker is off");

        }
    }
}

