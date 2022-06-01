package src.PackageEx.StringClass;

public class ValueofExam {
    public static void main(String[] args) {
        char ch = 'A';
        String strData1 = "A";
        String strData2;
        strData2 = String.valueOf(ch); //매개변수 값을 String 형으로 변환
        if(strData1.equals(strData2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
