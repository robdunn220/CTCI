package Algorithms;

public class MultiPart {
    public static void main(String[] args) {
        int[] arrA = new int[]{1, 3, 5, 7, 9, 11};
        int[] arrB = new int[]{2, 4, 6, 8, 10, 12};

        //  First method, O(A + B),which iterates over each array in separate for-loops
        for (int a : arrA) {
            System.out.println(a);
        }
        for (int b : arrB) {
            System.out.println(b);
        }

        //  The second method, O(A * B),nests the two for-loops, and has only one evaluating statement within the loops
        for (int a : arrA) {
            for (int b : arrB) {
                System.out.println(a + " " + b);
            }
        }
    }
}
