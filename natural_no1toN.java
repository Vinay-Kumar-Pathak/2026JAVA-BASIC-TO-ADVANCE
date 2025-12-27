import java.util.Scanner;
public class natural_no1toN{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println("natural number from 1 to N");
        for(int i=0;i<=n;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}