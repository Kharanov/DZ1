package DZ6;

public class Dog extends Animal {
    public static int count = 0;

    public Dog(String name) {
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public void swim(int dist) {
        if (dist <= maxSwim) {
            System.out.println(name +"  proplul " + dist);
        } else {
            System.out.println(name+"  ne doplul");
        }
    }

    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println(name+"  probezhal " + dist);
        } else {
            System.out.println(name+"  ne dobezhal");
        }
    }
}
