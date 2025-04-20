package level1.자릿수더하기;

public class q2_2 {
    public int solution(int n) {
        int sum =0;
        while ( n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        q2_2 num = new q2_2();
        System.out.println(num.solution(123));
    }
}
