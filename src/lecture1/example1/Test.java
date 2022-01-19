package lecture1.example1;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        // 참조가 바뀜
        s1 = "ccc";

        System.out.println("s1 = " + s1);

    }
}
