package introduction100.배열원소의길이;

import java.util.Arrays;

public class q13 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];//배열 길이 선언
        for(int i=0; i<answer.length; i++){ //앤썰의 길이만큼 반복
            answer[i] = strlist[i].length(); // 앤썰의 배열에 리스트 길이를 입력
        }
        return  answer;
    }

    public static void main(String[] args) {
        q13 strlist = new q13();
        String[] input = {"We", "are", "the", "world!"};
        int[] result = strlist.solution(input);

        System.out.println(Arrays.toString(result));
    }
}
