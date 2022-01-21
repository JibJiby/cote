package lecture1.example7;

import java.util.Locale;

public class Test {
    private static String changeStrAddress(String str) {
        String str2 = str.toLowerCase();
        System.out.println(str == str2); // false
        return str2;
    }

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = changeStrAddress(str);
        System.out.println(str == str2); // false
    }
}
