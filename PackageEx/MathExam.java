package src.PackageEx;

public class MathExam {
    public static void main(String[] args) {
        //abs
//        System.out.println("-abs");
//        System.out.println(Math.abs(25));
//        System.out.println(Math.abs(-25));
//        System.out.println(Math.abs(25.5));
//        System.out.println(Math.abs(-25.5));
//
//        //round(반올림)
//        System.out.println("-round");
//        System.out.println(Math.round(25));  //25
//        System.out.println(Math.round(25.3));  //25
//        System.out.println(Math.round(25.5));    //26
//        System.out.println(Math.round(-25.4));    //-25
//        System.out.println(Math.round(-25.5));    //-25
//        System.out.println(Math.round(-25.6));    //-26
//
//        System.out.println();

        // pow 거듭제곱
        System.out.println("-pow");
        System.out.println(Math.pow(3,2));
        System.out.println(Math.pow(3.0f, 2.0f));
        System.out.println(Math.pow(5.0, 2));
        System.out.println(Math.pow(-5.0, 3.0));

        //sqrt() 제곱근
        System.out.println("-sqrt");
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(9.0f));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.sqrt(-9.0));  //매개변수가 음수일경우 NaN 반환.

        //random() 난수
        System.out.println("-random");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*5));
        System.out.println((int)(Math.random()*5));
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*100));
    }
}
