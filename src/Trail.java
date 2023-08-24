import java.util.Scanner;

public class Trail {
    public static void main(String[] arg) {
        float mrk, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for six subjects :");
        for (int i = 0; i < 6; i++) {
            mrk = sc.nextFloat();
            if(mrk<=100 && mrk>=0){
                sum = sum + mrk;
            }
            else{
                System.out.println("Syntax Error!!");
                break;
            }
        }
        float total = (sum/6);
        System.out.println("Average obtain is:" + total);

    }
}