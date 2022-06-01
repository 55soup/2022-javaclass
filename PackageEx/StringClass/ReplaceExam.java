package src.PackageEx.StringClass;

public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java Programming");
        StringBuffer sb2 = null;
        sb2 = sb1.replace(0,4,"JAVA");
        //start ~ end - 1 문자열을 치환
        System.out.println("sb2 = " + sb2);
    }
}
