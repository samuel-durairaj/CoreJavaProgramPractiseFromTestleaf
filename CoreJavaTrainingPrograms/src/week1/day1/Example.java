package week1.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Example {
    static int counter = 0; // Shared by all objects
    
    Example() {
        counter++; // Increment counter whenever an object is created
    }
    
    static void displayCounter() {
        System.out.println("Number of objects created: " +counter);
    }



    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example obj3 = new Example();
       
        Example.displayCounter(); // Output: Number of objects created: 3
    }
}
