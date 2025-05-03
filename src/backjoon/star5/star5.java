package backjoon.star5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class star5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i =1; i<=num; i++){
            for(int p=1; p<=num-i; p++){
                System.out.print(" ");
            }
            for(int m =1; m<=i; m++){
                System.out.print("*");
            }
            for(int n =0; n<i-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
