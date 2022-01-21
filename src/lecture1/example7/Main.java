package lecture1.example7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static void mySolution(String str) {

        // 문제 제대로 읽자...  (대소문자 무시함)
            str = str.toLowerCase();

        int lt = 0, rt = str.length() - 1;

        while(lt<rt) {
            // compare 메소드는 정수 반환!!
//            if(str.charAt(lt) != str.charAt(rt)) {
            if(Character.compare(str.charAt(lt), str.charAt(rt)) != 0) {
                // 앞 뒤 똑같다면
                System.out.println("NO");
                break;
            }
            lt++;rt--;
        }

        if(lt>=rt) {
            System.out.println("YES");
        }
    }

    private static void lectureSolution(String str) {
        String answer = "YES";
        str = str.toUpperCase();

        int len = str.length();
        for(int i = 0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }

    private static void lectureSolution2(String str) {

        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        mySolution(str);
    }

}
