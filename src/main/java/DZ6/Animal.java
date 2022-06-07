package DZ6;

import java.sql.SQLOutput;

public class Animal {
    public String name;
    public int maxRun;
    public int maxSwim;
    public static int count = 0;
    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int dist) {
        System.out.println("probezhal ");
    }

    public void swim(int dist) {
        System.out.println("proplul ");
    }


}

