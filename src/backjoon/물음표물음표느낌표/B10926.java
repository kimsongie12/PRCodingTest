package backjoon.물음표물음표느낌표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String name = st.nextToken(); //공백 단위로 한 단어 읽음
        String amazing = "??!";

        System.out.println(name+amazing);
    }
}
