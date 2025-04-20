package introduction100.두수의합구하기;

public class q1 {
    public int solution(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        q1 num = new q1();
        int res = num.solution(2,3);
        System.out.println(res);
    }
}
