import java.util.Scanner;

public class Prinf_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<3; i++)
        {
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%-15s%07d%n", s, n);
        }
    }
}
