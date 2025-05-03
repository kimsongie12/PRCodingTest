package backjoon.star4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i<=num; i++){

            for (int m = 1; m <i; m++){
                System.out.print(" ");
            }
            for (int k = 1; k<=num-i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
