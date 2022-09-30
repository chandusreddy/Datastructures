package datastructures;

public class TimeComplexityExample3 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Takes O(n * n = n ^ 2 ) time complexity
                System.out.println(i + " " + j);
            }
        }
    }
    public static void main(String[] args) {

        printItems(10);
    }
}