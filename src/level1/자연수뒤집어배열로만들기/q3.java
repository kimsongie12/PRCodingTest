package level1.자연수뒤집어배열로만들기;

import java.util.Arrays;

public class q3 {

        public int[] solution(long n) {
            String str = Long.toString(n);
            int [] answer = new int[str.length()];

            for(int i =0; i<str.length(); i++){
                answer[i] = str.charAt(str.length() - 1 -i)-'0';
            }
            return answer;

        }

    public static void main(String[] args) {
        q3 num = new q3();
        int [] arr = num.solution(12345);
        System.out.println(Arrays.toString(arr));

    }
}
