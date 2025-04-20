package introduction100.배열자르기;


import java.util.Arrays;

public class q12 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int [] answer = new int[num2- num1+1];
        int index =0;

        for(int i =num1; i<=num2; i++){
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        q12 num = new q12();
        int[] res = num.solution(new int[]{1, 3,5},1,2);
        System.out.println(Arrays.toString(res));
    }
}
