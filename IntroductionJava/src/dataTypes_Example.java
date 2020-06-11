import java.util.*;
//import java.io.*;

public class dataTypes_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i<a; i++)
        {
            try
            {
                long l = sc.nextLong();
                System.out.println(l+ "can be fitted in : ");
                if (l >= -128 && l <= 127)
                    System.out.println("* byte");
                if (l >= -Math.pow(2, 15) && l<= Math.pow(2, 15) -  1)
                    System.out.println("* short");
                if (l >= -Math.pow(2, 31) && l<= Math.pow(2, 31) -  1)
                    System.out.println("* int");
                if (l >= -Math.pow(2, 63) && l<= Math.pow(2, 63) -  1)
                    System.out.println("* long");
            }
            catch (Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere");
            }

        }

    }
}
