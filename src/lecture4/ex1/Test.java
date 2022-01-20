package lecture4.ex1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        // 없어도 예외 X. null 리턴.
        map.get('a');

        map.put('a', 1);
        System.out.println("map = " + map);
    }
}
