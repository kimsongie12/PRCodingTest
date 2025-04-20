package introduction100.짝수의합;

public class q11 {
    public int solution(int n) {
        int sum =0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                continue;

            }
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        q11 num = new q11();
        int res = num.solution(10);
        System.out.println(res);
    }
}
