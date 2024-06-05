import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj3052 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = a % 42;

            if (list.contains(b)) {

            } else {
                count++;
                list.add(b);

            }

        }
        System.out.println(count);

    }
}
