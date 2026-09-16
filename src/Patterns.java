import java.util.*;

public class Patterns {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();                              // input get from user

        for (int i = 1; i <= n; i++) {            // no of rows OR outer loop
            for (int j = 1; j <= i; j++) {        // no of cols  OR inner loop
                System.out.print(i + " ");        // statement 1;
            }
            System.out.println();                       // print the one by one row
        }
    }
}
