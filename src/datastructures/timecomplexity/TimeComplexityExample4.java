package datastructures.timecomplexity;

public class TimeComplexityExample4 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // Takes O(n * n * n = n ^ 3 )
                    // we can simply this to O(n^2) time complexity
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
    public static void main(String[] args) {

        printItems(10);
    }
}