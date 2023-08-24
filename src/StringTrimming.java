public class StringTrimming{
    public static void main(String[] args) {
        String inputString = "   I'm working as a professional app developer!   ";

        String trimmedString = inputString.trim();

        System.out.println("Original: \"" + inputString + "\"");
        System.out.println("Trimmed: \"" + trimmedString + "\"");
    }
}
