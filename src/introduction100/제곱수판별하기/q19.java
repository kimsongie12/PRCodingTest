package introduction100.제곱수판별하기;
// 시간 복잡도 O(1)
// Math.sqrt() : 재곱근 구하는 메서드
public class q19 {
    public int solution(int n) {
        /* 4 = 2 2
          16 = 4 4
        * */
        int num = (int) Math.sqrt(n);
        if( num * num == n){
            return 1;

        }else {
            return 2;
        }


    }

    public static void main(String[] args) {
        q19 num = new q19();
        int n = 976;
        int res = num.solution(n);
        System.out.println(res);
    }
}
