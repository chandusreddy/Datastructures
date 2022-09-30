package datastructures;

public class TimeComplexityExample2 {

    public static void printItems(int n){
        for(int i=0; i <n; i++){
            // Takes O(n) time complexity
            System.out.println(i);
        }
        for(int j=0; j <n; j++){
            // Takes O(n) time complexity
            System.out.println(j);
        }
        // It might sound like O(n+n) = O(2n)
        // But we need to drop off the constants now the time
        //complexity will be O(n). It doesn't matter what the constant is
    }
    public static void main(String[] args) {

        printItems(10);
    }
}