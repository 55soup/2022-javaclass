package src.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {
    public static void main(String[] args) {
        String a="", b="";
        int sum = 0;
        float average = 0;

//        BufferedReader br;
//        br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in)); // 두 줄을 한 줄로 줄여라.
        try{
            System.out.println("Enter the string(정수) ? ");
            a = in.readLine();
            System.out.println("Enter the string(정수) > ");
            b = in.readLine();

        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("your input is " + a + " " + ", " + b);
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        sum += c+d;
        average = (float)sum/2;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println("평균 = " + average);
    }
}
