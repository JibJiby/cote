package lecture1.example9;

import java.util.Scanner;

public class Main {
    private static void mySolution(String str) {
        str = str.replaceAll("[^0-9]","");
        int answer = Integer.parseInt(str);

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        mySolution(str);
    }
}
