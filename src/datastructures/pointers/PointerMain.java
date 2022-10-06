package datastructures.pointers;

import java.util.HashMap;

public class PointerMain {

    public static void main(String[] args) {
        int num1 = 11;
        //re-assigning to the different object using the pointer
        int num2 = num1;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // Hashmap object of three different objects
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        HashMap<String,Integer> map3 = new HashMap<>();

        // adding the values to the map and re-assigning using the pointers
        map1.put("value", 11);
        map2 = map1;
        map1.put("value", 22);
        map3.put("value", 57);
        map3 = map2;

        System.out.println(map1);
        System.out.println(map2);
        //pointers pointing to the map2 map3 reference will be garbage collected for the value
        // 57 as its no longer referenced by any map object.
        System.out.println(map3);
    }
}
