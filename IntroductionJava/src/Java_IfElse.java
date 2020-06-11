import java.util.*;

public class Java_IfElse {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if ((n%2!=0) || (n%2==0 && n>=2 && n<=20))
            System.out.println("Weired");
        else if((n%2==0 && n>=20) || (n%2==0 && n>=2 && n<=5))
            System.out.println("Not Weired");
    }

}
