

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();//n번반복 해서 반성
        
        for(int i = 0; i < a ; i++ ) {
            bansung(); 
        }
        // int i = 0;
        // while(i < a) {
        //     bansung();
        //     i++;
        
        //    }



    }
    static void bansung(){
        System.out.println("다시는 그러지 않겠습니다...");
    }
}
