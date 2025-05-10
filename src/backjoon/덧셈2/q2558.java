package backjoon.덧셈2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numa = Integer.parseInt(br.readLine());
        int numb = Integer.parseInt(br.readLine());

        System.out.println(numa+numb);
    }
}
