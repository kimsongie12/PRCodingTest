package backjoon.수정렬하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2751_ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //숫자 입력하고
        // 입력한 수 배열에 넣고
        // 그 배열을 정렬
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for(int a: nums){
            sb.append(a).append('\n');// 한 줄씩 저장한다
        }
        System.out.println(sb);
    }
}
