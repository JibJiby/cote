package lecture1.example2;

import java.util.Scanner;

public class Main {
    // 대 -> 소, 소 -> 대

    private static void solution1(String str) {
        // char로 해결.
        char[] ary = str.toCharArray();

        // String 은 .length()
        // char[] 은 .length
        for(int i=0; i<ary.length;i++) {
            if(Character.isLowerCase(ary[i])) {
                ary[i] = Character.toUpperCase(ary[i]);
            } else {
                ary[i] = Character.toLowerCase(ary[i]);
            }
        }

        System.out.println(ary);
    }

    private static void solution2(String str) {
        // 여기에 추가하는 방식.
        String answer ="";

        // 바로 여기서 변환.
        for(char x: str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                // 소 --> 대
                answer += Character.toUpperCase(x);
            } else {
                // 대 --> 소
                answer += Character.toLowerCase(x);
            }
        }

        System.out.println(answer);
    }

    private  static void solution3(String str) {

        // 아스키로 해결

        // 대문자 : 65 ~ 90
        // 소문자 : 97 ~ 122

        String answer = "";

        // char 로 형변환 해준다.!!!!!!!!
        for(char x: str.toCharArray()) {
            if(x >= 97 && x<122) answer+=(char)(x-32);
            else answer +=(char)(x+32);
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        solution1(str);

    }

}
