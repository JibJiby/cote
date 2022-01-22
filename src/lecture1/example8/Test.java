package lecture1.example8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            문자 공백마다 분리하기
         */
//        String str = "found7, time: study; Yduts; emit, 7Dnuof\n";
//        System.out.println(Arrays.toString(str.split(""))); // 한 글자씩 쪼갬.
//
////        str.split("\s")     // 에러
//        str.split("\\s");      // 자바는 이스케이스를 위해 역슬래쉬 2개!!

        /*
            문자 뒤집기
         */
//        String originalStr = "abc";
//        // 회문   // cba
//        String reverseStr = new StringBuffer(originalStr).reverse().toString();
//        System.out.println("reverseStr = " + reverseStr);

        /*
            영어만 남기기
         */
        String mixedStr = "@abc^zz";

        String clearStr = mixedStr.replaceAll("[^a-zA-Z]+", "");
        System.out.println("clearStr = " + clearStr);

        

    }
}
