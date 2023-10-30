package program;
public class StringAssign1 {

    public static void main(String[] args) {

        String originalString = "Welcome to Java World";

        char charAt1= originalString.charAt(4);

        System.out.println("Character at 5th position: " + charAt1);

        boolean compareIgnoreCase = originalString.equalsIgnoreCase("Welcome");

        System.out.println("Comparison with 'Welcome' (case-insensitive): " + compareIgnoreCase);

        String concatenatedString = originalString.concat(" - Let us learn");

        System.out.println("Concatenated string: " + concatenatedString);

        int indexOfA = originalString.indexOf('a');

        System.out.println("Position of first 'a' occurrence: " + indexOfA);

        String replacedString = originalString.replace('a', 'e');

        System.out.println("String with 'a' replaced by 'e': " + replacedString);

        String substring = originalString.substring(4, 10);

        System.out.println("Substring between 4th and 10th position: " + substring);

        String lowercaseString = originalString.toLowerCase();

        System.out.println("Lowercase string: " + lowercaseString);

    }

}


