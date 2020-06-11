import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s = 0;
            s = s+a;
            for (int j=0; j<n; j++){
                s +=(Math.pow(2,j))*b;
                System.out.print(s+" ");

            }
            System.out.println();

        }
    }
}
