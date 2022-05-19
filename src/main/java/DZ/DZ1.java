package DZ;
public class DZ1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        }
    public static void checkSumSign() {
        int a = 50;
        int b = -70;
        int Sum;
        Sum = a + b;
        if (Sum >= 0) {
            System.out.println("Summa polozhitelnaya"); }
        else {
            System.out.println("Summa otricatelnaya");
        }
    }
    public static void printColor() {
        int value = 54;
        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 9;
        int b = 7;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }

    }
    }
