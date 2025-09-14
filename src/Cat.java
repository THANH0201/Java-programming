public class Cat {
    private String name;
    private String say;
    private static int count = 0;

    public Cat(String name, String say) {
        this.name = name;
        this.say = say;
        count++;
        this.count = count;
    }
    public static int getCatCunt(){
        return count;
    }

    public void say() {
        System.out.println(name + ":" + say);
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat1 = new Cat("Whiskers","Meow");
        Cat cat2 = new Cat("Rex","Woof");

        // Call the meow method on the cat instance
        cat1.say();
        cat2.say();
        System.out.println("Total cats: " + Cat.getCatCunt());

    }
}

