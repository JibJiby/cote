package lecture1.example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void solution1(String[] wordAry) {
        // StringBuilder 로 뒤집고 바로 출력하기.
        for (String s : wordAry) {
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println(reversed);
        }
    }

    private static void solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        // 출력
        for (String s : answer) {
            System.out.println(s);
        }
    }

    private static void solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // n^2 시간 복잡도.
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                // 문자 변경
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                // 인덱스 변경
                lt++;
                rt--;
            }
            // char[] --> String
            answer.add(String.valueOf(s));
        }

        // 출력
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n개의 단어
        int nWord = in.nextInt();

        // String[]에 저장.
        // String[]은 length.
        String[] wordAry = new String[nWord];
        for (int i = 0; i < wordAry.length; i++) {
            wordAry[i] = in.next();
        }

        solution1(wordAry);
    }
}
