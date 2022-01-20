package lecture4.ex1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static void mySolution(char[] ary) {
        HashMap<Character, Integer> map = new HashMap<>();

        // hashmap은 put()으로 데이터 넣기.
        for (char c : ary) {
            if(map.get(c) != null) {
                // 이미 하나 있는 경우
                map.put(c, map.get(c) + 1);
            } else {
                // 처음 넣는 경우
                map.put(c, 1);
            }
        }

        int max = -1;
        char answer = ' ';  // 자바는 공백으로 초기화해야 하네..

        for(Character key: map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }

    private static void lectureSolution(char[] ary) {
        // 여기도 공백으로 초기화하네.
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : ary) {
            // 분기문으로 처리하지 않고 간단히 메소드 하나로 처리.
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        // 키값 포함되어 있는지 확인하는 메소드
//        map.containsKey('A');
        // 값 포함 확인 메소드
//        map.containsValue(값)


        // 상수로 최소값 초기화함.
        int max = Integer.MIN_VALUE;
        for(char key: map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        char[] ary = in.next().toCharArray();

        mySolution(ary);
    }
}
