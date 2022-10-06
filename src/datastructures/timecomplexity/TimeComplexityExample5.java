package datastructures.timecomplexity;

public class TimeComplexityExample5 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Takes O(n * n = n ^ 2 ) time complexity
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0; k < n; k++) {
            // Takes O(n) time complexity
            System.out.println(k);
        }
        // Total time complexity
        //Dropping off  the non-dominants
        //O(n^2 + n) = )(n^2)
    }
    public static void main(String[] args) {

        printItems(10);
    }
}