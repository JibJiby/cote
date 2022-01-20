package lecture3.ex1;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] ary = {1, 5, 10};
        // [검정-흰] 범위로 슬라이싱.
        int[] reminded = Arrays.copyOfRange(ary, 0, 2);
        // 배열 그대로 출력하는 방법.
        System.out.println("reminded = " + Arrays.toString(reminded));
    }
}
