import java.util.Scanner;

public class natural_no_reverese {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no n");
        int n = sc.nextInt();
        for(int i =n;i>=1;i--){
            System.out.print(i+" ");
            
        }
        sc.close();
    }
}
