import java.util.Scanner;

public class intTo_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //String str = String.valueOf(n);
        //String str_1 = Integer.toString(n);
        String str_2 = ""+ n;
        System.out.println(str_2);

        if (n==Integer.parseInt(str_2)){
            System.out.println("Good Job");
        } else
            System.out.println("unsuccesfull");
    }
}
