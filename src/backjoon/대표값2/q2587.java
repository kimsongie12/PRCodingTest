package backjoon.대표값2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class q2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] str = new int[5];

        for(int i =0; i< str.length; i++){
            str[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(str);

        int sum=0;

        for(int i =0; i< str.length; i++){

            sum += str[i];
        }
        int res = sum/ str.length;
        System.out.println(res);


       int middle = str[str.length/2];
        System.out.println(middle);



    }
}
