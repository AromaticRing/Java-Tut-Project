import java.util.Scanner;

public class JavaTutPat1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of input: ");
        int num = sc.nextInt();
        float Sum = 0;

        for(int i=0;i<num;i++) {
            float mrk = sc.nextFloat();
            if (mrk >= 0 && mrk <= 100) {
                Sum += mrk;
            } else {
                System.out.println("Enter VALID marks plz!!");
                i = 0;
            }
        }
        Sum = Sum/num;
        System.out.println("Percentage Score is : " + Sum);
    }
}