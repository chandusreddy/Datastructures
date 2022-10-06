package datastructures.timecomplexity;

public class TimeComplexityExample1 {

    public static void printItems(int n){
        for(int i=0; i <n; i++){
            // Takes O(n) time complexity
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printItems(10);
    }
}