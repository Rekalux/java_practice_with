import java.util.Scanner;

public class Boj9498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // String s;
        // if (90 <= a && a <= 100) {
        //     s = "A";
        // } else if (80 <= a && a <= 89) {
        //     s = "B";
        // } else if (70 <= a && a <= 79) {
        //     s = "C";
        // } else if (60 <= a && a <= 69) {
        //     s = "D";
        // } else {
        //     s = "F"; // 제일아래에 sout 해서 한번에 출력가능 (정의내리고 함수값 집어넣어주고 해야됨)
        // }
        // System.out.println(s);
        if(90 <= a && a <= 100) {
            System.out.println("A");
        } else if(80 <= a && a <= 89){
            System.out.println("B");
        } else if(70 <= a && a <= 79){
            System.out.println("C");
        } else if(60 <= a && a <= 69){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
