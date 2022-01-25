package lecture1.example10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] test = new int[5];
        System.out.println("test = " + Arrays.toString(test));
        Arrays.fill(test, -1);  // 반환 X
        System.out.println("test = " + Arrays.toString(test));
    }
}
