package lecture1.example6;

import java.util.Scanner;

public class Main {
    private static void mySolution(String str) {

        String answer = "";

        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                // 2번째 이상인 문자들
                answer += str.charAt(i);
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        mySolution(str);
    }
}
