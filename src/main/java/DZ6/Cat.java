package DZ6;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        count++;
    }

    public void swim(int dist) {
        System.out.println(name + "  Ne mozhet plavat' ");
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println(name + "  probezhal " + dist);
        } else {
            System.out.println(name + "  ne dobezhal");
        }
    }
}