package lecture1.example4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // n개의 단어
        String[] inputWords = {"abc", "name", "never die"};
        String[] wordAry = new String[inputWords.length];

        // Array --> List
            // ArrayList x. List 임.
        List<String> strArrList = Arrays.asList(inputWords);

//        Collections.reverse();






        // + 추가.
//        // stream으로 만드는 방법.
//        Arrays.stream(wordAry).forEach(v -> System.out.println(v));
    }
}
