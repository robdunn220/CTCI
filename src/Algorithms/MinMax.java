package Algorithms;

public class MinMax {
    public static void main(String[] args) {
        //  MinMax method 1
        int[] array = new int[]{1, 4, 6, 3, 2, 5, 11};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println(max);
        System.out.println(min);

        //  MinMax method 2 (double for loop), where the if statements are separated into two separate loops
        for (int x : array) {
            if (x < min) min = x;
        }
        for (int x : array) {
            if (x > max) max = x;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
