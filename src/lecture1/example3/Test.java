package lecture1.example3;

public class Test {
    public static void main(String[] args) {
        String str = "it is time to study";

        // 결과 : it  /  is / time / to / study
        for(String s: str.split(" ")) {
//            System.out.println(s.length());
            System.out.println(s);
        }


        // .next() 는 \n 기준이 아니었다!!!!
        // .nextLine() 으로.   (시간 걸림 ...)
    }
}
