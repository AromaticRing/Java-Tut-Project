public class StringSwapping{
    public static void main(String[] args) {
        String firstString = "NASA-SpaceX-Starship";
        String secondString = "ISRO-Chandrayaan-3";

        System.out.println("Before swapping: firstString = " + firstString + ", secondString = " + secondString);

        // Swapping using a temporary variable
        String temp = firstString;
        firstString = secondString;
        secondString = temp;

        System.out.println("After swapping: firstString = " + firstString + ", secondString = " + secondString);
    }
}
