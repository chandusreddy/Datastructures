package datastructures.timecomplexity;

public class TimeComplexityExample7 {

    public static void printItems(int a, int b){
        for(int i=0; i <a; i++){
            // Takes O(a) time complexity
            System.out.println(i);
        }
        for(int j=0; j <b; j++){
            // Takes O(b) time complexity
            System.out.println(j);
        }
        // It might sound like O(n+n) = O(2n)
        // but we here we have two different terms for the input
        // O(a) + o(b) = O(a+b)
    }
    public static void main(String[] args) {

        //printItems(10,10);
        printItems(10,1);
    }
}