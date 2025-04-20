package level1.자릿수더하기;
// n = 123  res = 1+2+3 = 6
// 스트링으로 바꿔서 문자 하나로 만들고 하나씩 뽑아서 더하기
public class q2 {
    public int solution(int n) {
        String returnString = Integer.toString(n);
        int sum =0;

        for(int i=0; i<returnString.length(); i++){
            sum += returnString.charAt(i)-'0' ; // 문자 0빼서 숫자로 변환

        }
        return sum;


    }
    public static void main(String[] args) {
        q2 num = new q2();
        System.out.println(num.solution(987));
    }
}
