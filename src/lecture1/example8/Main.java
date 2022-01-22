package lecture1.example8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static void mySolution(String str) {
        String answer = "YES";

        String[] splitAry = str.split("\\s");  // split 해도 '' 인 문자열 있음.
        // 스트림 필터 익명 함수 안에서는 final 써야 함.

        // 특수문자 제거
//        splitAry = Arrays.stream(splitAry).map(v -> v.replaceAll("[^a-zA-Z]", "")).toArray();
        ArrayList<String> clearAry = new ArrayList<>();
        for (String s : splitAry) {
            clearAry.add(s.replaceAll("[^a-zA-Z]", ""));
        }


        for (int i = 0; i < clearAry.size() / 2; i++) {
            // 짝수 일 때는 딱 반까지 순회
            // 홀수 일 때는 가운데 인덱스 포함해서 순회
            // -> 자신과 자신을 비교하기 때문에 상관 없음.
            String ltStr = clearAry.get(i);
            String rtStr = new StringBuffer(clearAry.get(clearAry.size() - 1 - i)).reverse().toString();

            if (!ltStr.equalsIgnoreCase(rtStr)) {
//                System.out.println(ltStr + " / " + rtStr);
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }

    private static void lectureSolution(String str) {
        // 문제를 잘못 이해함..
            // 단어마다 회문패턴인지 확인하는 걸로 이해.. 문자열을 하나로 회문패턴을 확인하는 거였음
            // 문제 --> 해당 문자열이 팰린드롬이면 "YES" ...

        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

//        mySolution(str);
        lectureSolution(str);
    }


}


