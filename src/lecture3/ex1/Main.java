package lecture3.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // mySolution 이랑 lectureSolution 둘 다 런타임 에러?

    private static void mySolution(int[] firstAry, int[] secondAry) {
        int firstI = 0, secondI = 0, answerI = 0;
        int[] answer = new int[firstAry.length + secondAry.length];

        // 한 쪽 끝날 때까지 작업.
        while (firstI < firstAry.length && secondI < secondAry.length) {
            if (firstAry[firstI] <= secondAry[secondI]) {
                // first 배열에 있는 값이 더 작은 경우, 그 값을 넣기
                answer[answerI++] = firstAry[firstI++];
            } else if (firstAry[firstI] > secondAry[secondI]) {
                answer[answerI++] = secondAry[secondI++];
            }
        }

        // 나머지는 이어 붙이기
//        if (firstI != firstAry.length - 1) {  // 틀림.  마지막에도 firstI++ 되니까.
        if (firstI == firstAry.length) {
            // second가 남았다면
            int[] reminded = Arrays.copyOfRange(secondAry, secondI, secondAry.length);

            for(int i=0; i<reminded.length; i++) {
                answer[answerI++] = reminded[i];    // i++ 실수.
            }
        } else if (secondI == secondAry.length) {
            // first가 남았다면  (자바6부터 사용가능)
            int[] reminded = Arrays.copyOfRange(firstAry, firstI, firstAry.length);

            for(int i=0; i<reminded.length; i++) {
                answer[answerI++] = reminded[i];
            }
        }


        // 출력
        for (int v : answer) {
            System.out.print(v+" ");
        }

    }

    private static void lectureSolution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = a.length, m = b.length;
        int p1=0, p2=0;
        while(p1<n && p2 <m) {
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        // 나머지
        while(p1<n) answer.add(a[p1++]);
        while(p2<n) answer.add(b[p2++]);

        for(int v: answer) {
            System.out.println(v+ " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstSize = in.nextInt();
        int[] firstAry = new int[firstSize];

        // 첫 배열 입력
        for (int i = 0; i < firstAry.length; i++) {
            firstAry[i] = in.nextInt(); // 공백마다 하나씩.
        }

        int secondSize = in.nextInt();
        int[] secondAry = new int[secondSize];

        // 두번째 배열 입력
        for (int i = 0; i < secondAry.length; i++) {
            secondAry[i] = in.nextInt(); // 공백마다 하나씩.
        }

//        mySolution(firstAry, secondAry);
        lectureSolution(firstAry, secondAry);
    }
}
