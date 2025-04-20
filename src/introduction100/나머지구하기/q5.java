package introduction100.나머지구하기;

public class q5 {
    public int solution(int num1, int num2) {
        return num1%num2;

    }

    public static void main(String[] args) {
        q5 num = new q5();
        int res = num.solution(10  ,5 );
        System.out.println(res);

    }
}
