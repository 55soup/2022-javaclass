package src.PackageEx.StringClass;

public class StringEqualExam {
    public static void main(String[] args) {
        String R1 = new String("JAVA");
        String R2 = new String("JAVA");
        String R3 = new String("java");
        System.out.println("R1 == R2 -->" + (R1==R2));  // 주소비교
        System.out.println("R1.equals(R2) -->" + (R1.equals(R2))); //문자열 비교
        System.out.println("R1 == R3 -->" + (R1==R3));
        System.out.println("R1.equals(R3) -->" + (R1.equals(R3)));  //대소문자 구별

    }
}
