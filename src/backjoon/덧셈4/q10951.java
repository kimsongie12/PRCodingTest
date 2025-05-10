package backjoon.덧셈4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        //입력 개수 정해지지 않으면 -> while()
        // 입력 개수 정해져있으면 -> for
        while((line = br.readLine()) != null&& !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);

            int numa = Integer.parseInt(st.nextToken());
            int numb = Integer.parseInt(st.nextToken());

            System.out.println(numa+numb);
        }

    }
}
