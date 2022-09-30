package datastructures;

public class TimeComplexityExample6 {

    public static int addItems(int n){
        return n + n;
        // Time complexity O(1)
    }
    public static void main(String[] args) {

        System.out.println(addItems(10));
    }
}