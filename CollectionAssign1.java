package program;

import java.util.HashMap;

public class CollectionAssign1 {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Display the contents of the HashMap
        System.out.println("HashMap: " + hashMap);
    }
}

