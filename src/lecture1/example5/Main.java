package lecture1.example5;

import java.util.Scanner;

public class Main {

    private static void solution1(char[] str) {
        // 처음에는 dictionary 같은 구조를 생각했는데 너무 나간듯.

        //
        int start = 0;
        int end = str.length - 1;

        while (start<end) {
//            if(start == end) {
//                // 같은 인덱스 바라보는 경우 => 짝에 맞게 뒤집은 완료한 상태.
//                break;
//            }
            if (!Character.isAlphabetic(str[start])) {
                // startIndex에 있는 문자가 특수 문자 인 경우
                start++;
                continue;
            }
            if (!Character.isAlphabetic(str[end])) {
                // endIndex에 있는 문자가 특수 문자 인 경우
                end--;
                continue;
            }

            // start와 end 모두 영문자 인 경우, 스왑.
                // 주소? 스왑.
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;

            start++;
            end--;
        }

        // 출력.
        System.out.println(String.valueOf(str));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.next();
        char[] str = inputStr.toCharArray();

        solution1(str);
    }

}
