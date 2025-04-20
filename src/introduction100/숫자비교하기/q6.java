package introduction100.숫자비교하기;

public class q6 {
    public int solution(int num1, int num2) {
        if (num1 == num2){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        q6 num = new q6();
        int res = num.solution(11,11);
        System.out.println(res);
    }
}
/*
* int answer = (num1 == num2) ? 1: -1;
* return answer;
*
* */