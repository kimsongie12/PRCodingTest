package introduction100.두수의나눗셈;

public class q8 {
    public int solution(int num1, int num2) {

        return (int)((double)num1/num2 *1000); // 나누기 전에 double형 변환 해줘야함 -> int 형 변환
    }

    public static void main(String[] args) {
        q8 num = new q8();
        int res = num.solution(7,3);
        System.out.println(res);
    }
}
