package backjoon.세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        int maxLength = 0;

        // 5줄 입력받기
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            maxLength = Math.max(maxLength, words[i].length());  // 가장 긴 길이 저장
        }

        StringBuilder sb = new StringBuilder();

        // 세로 읽기
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length()) {
                    sb.append(words[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
