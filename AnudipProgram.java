package program;
public class AnudipProgram {
    public static void main(String[] args) {
        // 1. Create a StringBuffer with initial content.
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");
        System.out.println("Original String: " + stringBuffer);

        // 2. Add the string "- This is a sample program" to the existing string.
        stringBuffer.append("- This is a sample program");
        System.out.println("After appending: " + stringBuffer);

        // 3. Insert the string "Object" into the existing string at the 21st position.
        stringBuffer.insert(21, "Object");
        System.out.println("After inserting 'Object': " + stringBuffer);

        // 4. Reverse the entire string and display it.
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // 5. Replace the word "Buffer" with "Builder" and display it.
        stringBuffer.reverse();
        System.out.println("After reversing to original: " + stringBuffer);
        String replacedString = stringBuffer.toString().replace("Buffer", "Builder");
        System.out.println("After replacing 'Buffer' with 'Builder': " + replacedString);
    }
}

