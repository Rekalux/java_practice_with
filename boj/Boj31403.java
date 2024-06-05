import java.util.Scanner;

public class Boj31403 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();
        
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        System.out.println(a + b - c);

        int p1 = Integer.parseInt(A + B);

        System.out.println(p1 - c);

    }
}
