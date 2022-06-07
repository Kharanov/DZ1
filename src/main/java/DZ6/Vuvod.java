package DZ6;

public class Vuvod {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        cat1.run(150);
        cat1.swim(400);
        result();
        Cat cat2 = new Cat("Murzik");
        cat2.run(230);
        cat2.swim(15);
        result();
        Dog dog1 = new Dog("Muhtar");
        dog1.run(470);
        dog1.swim(9);
        result();
        Dog dog2 = new Dog("Druzhok");
        dog2.run(520);
        dog2.swim(10);
        result();
    }

    public static void result() {
        System.out.println("Colichestvo zhivotnuh: " + Animal.count + "     Colichestvo cotov: " + Cat.count + "    Colichestvo sobak: " + Dog.count);

    }
}

