package backjoon.star3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i =1; i<=num; i++){
            for(int k = 1; k<=num+1-i; k++){
                System.out.print("*");
            }
            for (int m = 1; m <i; m++ ){
                System.out.print("");
            }
            System.out.println();
        }

    }
}
