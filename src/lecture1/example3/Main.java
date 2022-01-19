package lecture1.example3;

import java.util.Scanner;

public class Main {

    private static void solution1(String str) {
//        String[] splited = str.split("\s");
        String[] splited = str.split(" ");

        // "-".repeat() 는 JAPA 11부터 가능.

        int max = 0;
        String answer = "";

        for (String s : splited) {
            if (max == s.length()) {
                 continue;
            }
            else if (max < s.length()) {
                max = s.length();
                answer = s;
            }
        }

        System.out.println(answer);
    }

    private static void solution2(String str) {

        String answer = "";
        // 가장 작은 값으로
        int m = Integer.MIN_VALUE, pos;

        // -1은 "못 찾으면" 을 의미
        while((pos=str.indexOf(' ')) == -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            // str 다시 초기화 (pos + 1부터 끝까지)
            str = str.substring(pos + 1);
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        solution1(str);
//        solution1("it is the time");

    }
}
