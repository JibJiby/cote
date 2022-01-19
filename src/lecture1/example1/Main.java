package lecture1.example1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static void solution1(String inputWord, char targetChar) {
        // 대,소문자 구분 없이 ---> 모두 소문자로.
        inputWord = inputWord.toLowerCase();
        targetChar = Character.toLowerCase(targetChar); // Wrapper의 static 메소드 사용.

        char[] ary = inputWord.toCharArray();   // String --> char[]
                                                // 반대로 char[] ---> String 할 때는 .valueOf()

        int count = 0;
        for(char c: ary) {
            if(c == targetChar) ++count;
        }

        System.out.println(count);
    }

    private static void solution2(String inputWord, char targetChar) {
        inputWord = inputWord.toLowerCase();
        targetChar = Character.toLowerCase(targetChar);

        // 강의에선 for문 이 다름.
        int count = 0;
        for(int i=0;i<inputWord.length(); i++) {
            if(inputWord.charAt(i) == targetChar) count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputWord = in.next();   // 반환 타입 String.
        char targetChar = in.next().charAt(0);

        solution1(inputWord, targetChar);

    }
}
