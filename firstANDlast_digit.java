import java.util.Scanner;

public class firstANDlast_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int last=n%10;
        int first=n;
        while(first>=10){
            first=first/10;
        }
        int second=n;
        while (second>=100) {
            second=second/10;
        }
        int seconddigit=second%10;
        int secondlast=n;
        while (secondlast>=10) {
            secondlast=secondlast/10;
            secondlast=secondlast%10;

        }
        System.out.println("First digit is: "+first);
        System.out.println("Last digit is: "+last);
        System.out.println("Second digit is: "+seconddigit);
        System.out.println("Second last digit is: "+secondlast);
        sc.close();
    }
}
