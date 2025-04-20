package introduction100.양꼬치;

public class q10 {
    public int solution(int n, int k) {
        // n(양꼬치)를 10으로 나눴을 때 0이면, k(음료수) 1개 추가
        int nprice = 12000;              // 양꼬치 가격
        int kprice = 2000;               // 음료수 가격

        int fdrink = n / 10;             // 무료 음료수 개수
        int paiddrink = k - fdrink;      // 실제 지불해야 하는 음료수 개수

        int total = (n * nprice) + (paiddrink * kprice);  // 총 지불 금액
        return total;
    }

    public static void main(String[] args) {
        q10 num = new q10();
        int res = num.solution(64,6);
        System.out.println(res);
    }
}
