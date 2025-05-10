package level1.없는숫자더하기;

import java.util.Arrays;

public class q250511_2 {
    public int solution(int[] numbers) {
        int sum = 45; // 0 + 1 + ... + 9 = 45
        for (int num : numbers) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        q250511_2 num= new q250511_2();
        int numbers [] = {1,2,3,4,6,7,8,0};
        int res = num.solution(numbers);
        System.out.println(res);
    }
}
