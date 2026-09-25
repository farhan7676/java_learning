public class StringManipulationDemo {
    public static void main(String[] args) {
        String name = "String Manipulation Demo";

        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Starts with \"String\": " + name.startsWith("String"));
        System.out.println("Ends with \"Demo\": " + name.endsWith("Demo"));
        System.out.println("Contains \"Manipulation\": " + name.contains("Manipulation"));
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("First word: " + name.substring(0, 6));
        System.out.println("Replace \"Demo\": " + name.replace("Demo", "Example"));
        System.out.println("Index of \"Manipulation\": " + name.indexOf("Manipulation"));
    }
}