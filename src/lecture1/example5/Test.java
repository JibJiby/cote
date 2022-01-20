package lecture1.example5;

public class Test {
    public static void main(String[] args) {
        char[] ary = {'a', 'b', 'c'};

        // 배열도 객체이므로 주소 출력.
        System.out.println("ary = " + ary);


        // 문자열로 출력하기.
        System.out.println("===============");

        for (char c : ary) {
            System.out.print(c);
        }

        System.out.println("\n===============");

        System.out.println(String.valueOf(ary));
        System.out.println(new String(ary));
    }
}
