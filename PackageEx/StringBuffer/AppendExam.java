package src.PackageEx.StringBuffer;

public class AppendExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" Java Programming");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null;
        StringBuffer str2 = null;
        str1 = sb1.append(" Project"); // sb1 ->  Java Programming Project
        //str1 출력값 -> Java Programming Project
        str2 = sb1.append(sb2);
        System.out.println("sb1 = " + sb1); // Java Programming Project Project (?)
        System.out.println("sb2 = " + sb2); // Project
        System.out.println("str1 = " + str1); // Java Programming Project Project
        System.out.println("str2 = " + str2); // Java Programming Project Project
        System.out.println();
    }
}
