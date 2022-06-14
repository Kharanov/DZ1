package DZ7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int action;
            Cat[] allCats = new Cat[4];
            allCats[0] = new Cat("Barsik", 5, false);
            allCats[1] = new Cat("Ron", 25, false);
            allCats[2] = new Cat("Garri", 36, false);
            allCats[3] = new Cat("Germiona", 49, false);


            Plate plate = new Plate(50);
            plate.info();
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                    allCats[i].eat(plate);
                    allCats[i].fullness = true;
                    System.out.println("Cat " + allCats[i].name + " poel!");
                } else {
                    System.out.println("Cat " + allCats[i].name + " ne poel!");
                }
            }
            plate.info();
            System.out.println("Skol'ko edu dobavit'?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();

        }
    }
