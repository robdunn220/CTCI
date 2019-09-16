package Algorithms;

class QuickSort {

    public static void main(String[] args) {
        int recursive = sum(4);
        System.out.println("Recursive: " + recursive);

        int nonRecursive = pairSumSequence(4);
        System.out.println("Non-recursive: " + nonRecursive);
    }

    // This version of quick sort is directly related to size of array, n. An array of size n will have a Big O of O(n)
    // A 2-dimensional array will have a Big O of O(n^2), and so on.
    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n-1);
    }

    //  This version is non-recursive. So while it roughly makes O(n) calls total, each call is only O(1) instead of simultaneous
    private static int pairSumSequence(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += pairSum(i, i + 1);
        }
        return total;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }

}

