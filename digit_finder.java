import java.util.Scanner;
public class digit_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = sc.nextInt();

        String s = Integer.toString(n);

        if (index < 0 || index >= s.length()) {
            System.out.println("Invalid index");
        } else {
            char digit = s.charAt(index);
            System.out.println("Digit at index " + index + " = " + digit);
        }

        sc.close();
    }
}
