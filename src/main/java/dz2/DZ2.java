package dz2;

public class DZ2 {
    public static void main(String[] args) {
        within10and20(5, 25);
        positiveOrNegative(-5);
        isPositive(-7);
        printLine("slovo", 4);
        isLeap(400);
    }

    public static boolean within10and20(int x1, int x2) {
        boolean result= x1 + x2 >= 10 && x1 + x2 <= 20;
        System.out.println("rezul'tat x1+x2 " + result);
        return result;
    }

    public static void positiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("chislo polozhitel'noe");
        } else {
            System.out.println("chislo otricatel'noe");
        }
    }

    public static boolean isPositive(int x) {
        boolean result = x >=0;
        System.out.println(result);
               return result;
    }

    public static void printLine(String stroka, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(stroka);
        }
    }

    public static boolean isLeap(int year) {
        boolean result = year%4==0 && year%100!=0 || year%400==0;
        System.out.println(result);
        return result;
    }


}



