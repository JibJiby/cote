package lecture1.example11;

import java.util.Scanner;

public class Main {
    private static void mySolution(String s) {
        // 못 품..
        String answer = "";

        int count = 0;
        char tmp = ' '; // 첫번째 나온 문자.
        for (int i = 0; i < s.length(); i++) {
            if (count == 0) {
                // 새로운 문자인 경우
                tmp = s.charAt(i);
                count++;

            } else {
                if (tmp == s.charAt(i)) {
                    // 마지막 넣은 문자와 현재 문자와 동일하면
                    count++;
                } else {
                    // tmp와 s.charAt(i) 를 헷갈림...
                    // 연속이 끊긴 경우
                    answer += tmp;
                    answer += String.valueOf(count);
                    answer += "||";
                    answer += s.charAt(i);  // 여길 안넣어줌..
                    count = 0; // 다시 초기화
                }
            }
        }
        System.out.println(answer);

    }

    private static void lectureSolution(String s) {
        String answer = "";
        s = s+" ";  // 마지막 칸 하나 추가.

        int cnt = 1; // 여긴 1부터 시작.
        for(int i=0;i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                answer +=s.charAt(i);
                if(cnt >1) answer +=String.valueOf(cnt);
                cnt=1;  // 다시 1로 초기화.
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        mySolution(s);
    }
}
