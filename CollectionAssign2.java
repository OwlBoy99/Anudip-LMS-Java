package program;
import java.util.HashMap;

public class CollectionAssign2 {
    public static void main(String[] args) {
        // Create a HashMap with String keys and String values
        HashMap<String, String> hashMap = new HashMap<>();
        // Add elements to the HashMap
        hashMap.put("Key1", "Value1");
        hashMap.put("Key2", "Value2");
        hashMap.put("Key3", "Value3");
        // Display the HashMap
        System.out.println("HashMap: " + hashMap);
        // Access elements by key
        String keyToAccess = "Key2";
        String value = hashMap.get(keyToAccess);
        System.out.println("Value for key " + keyToAccess + ": " + value);
        // Check if a key exists in the HashMap
        String keyToCheck = "Key4";
        boolean keyExists = hashMap.containsKey(keyToCheck);
        System.out.println("Key " + keyToCheck + " exists in HashMap: " + keyExists);
        // Remove an element from the HashMap
        String keyToRemove = "Key1";
        hashMap.remove(keyToRemove);
        System.out.println("HashMap after removing " + keyToRemove + ": " + hashMap);
    }
}
