package level1.약수의합;

public class q1 {
    public int solution(int n) {
        int sum =0;
        for(int i =1; i<=n; i++){
            if(n % i  ==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        q1 num = new q1();
        int res = num.solution(5);
        System.out.println(res);
    }
}
