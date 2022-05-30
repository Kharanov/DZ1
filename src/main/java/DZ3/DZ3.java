package DZ3;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        zeroAndOne();
        arrOneHundred();
        lessSix();
        arrSquare();
        twoArguments();
        minAndMax();
        int[] arr2 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr2));
        int[] arr = {1, 2, 3, 4, 5};
        shift(arr, 33);

    }

    public static void zeroAndOne() {
        int nums[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i] + 1;
            } else if (nums[i] == 1) {
                nums[i] = nums[i] - 1;
            }
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
    }

    public static void arrOneHundred() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void lessSix() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void arrSquare() {
        int[][] square = new int[10][10];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                } else if (i == square.length - j - 1) {
                    square[i][j] = 1;
                }

                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void twoArguments() {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int initialValue = scan.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void minAndMax() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 25, 9, 1};
        int min = arr[1];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("minimum = " + min);
        System.out.println("maximum = " + max);
    }

    public static void shift(int arr[], int n) {
        n = (n % arr.length + arr.length) % arr.length;
        for (int j = 0; j < n; j++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkBalance(int[] arr) {
              int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            if (sumLeft * 2 == sum) {
                return true;
            }
        }
        return false;
    }
}
