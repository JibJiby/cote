package lecture1.example10;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void mySolution(String str, char target) {
        //  str 한 인덱스당 모두 탐색하는게 아니라
        // 먼저 target 인덱스 위치를 찾고 그 이후로 진행하는 식으로
        // --> 너무 복잡
        int[] answer = new int[str.length()];
        int fIndex = -1;

        // 왼쪽에서부터
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                answer[i] = 0;
                fIndex = i;
            } else if (fIndex == -1) {
                // 첫번째 동일 문자 나오기 전
                answer[i] = -1;
            } else {
                // 첫번째 문자 이미 나오고 다른 문자
                answer[i] = i - fIndex;
            }
        }

        // 오른쪽에서부터
        fIndex = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (target == str.charAt(i)) {
                fIndex = i;
            } else if (fIndex != -1) {
                if (answer[i] == -1 || answer[i] > (fIndex - i)) {
                    answer[i] = fIndex - i;
                }
                // 왼쪽에서 할 때 첫 target 나오기 전엔 -1로 초기화 했던 자리

            }
        }

//        System.out.println(Arrays.toString(answer));
        for(int v: answer) {
            System.out.print(v+" ");
        }

    }

    private static void lectureSolution(String str, char target) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0; i<str.length();i++) {
            if (str.charAt(i) == target) {
                p=0;
                answer[i] = p;
            } else {
                p++;
                answer[i]=p;
            }
        }


        // 오른쪽부터
        p = 1000;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == target) {
                p=0;
                answer[i] = p;
            } else {
                p++;
                // 작은 값으로 넣기
                answer[i] = Math.min(answer[i], p);

            }
        }


        // 정답 출력
        for (int v : answer) {
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char target = in.next().charAt(0);

//        mySolution(str, target);
        lectureSolution(str, target);
    }
}
