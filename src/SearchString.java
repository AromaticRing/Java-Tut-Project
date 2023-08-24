import java.util.Scanner;

public class SearchString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();

        System.out.println("Enter the string to search:");
        String searchString = scanner.nextLine();

        int index = paragraph.indexOf(searchString);

        if (index == -1) {
            System.out.println("The string " + searchString + " was not found.");
        } else {
            System.out.println("The string " + searchString + " was found at index " + index);
        }
    }

}
