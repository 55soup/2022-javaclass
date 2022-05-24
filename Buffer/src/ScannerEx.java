import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        FileWriter PhoneNumber= null;
        Scanner scanner = new Scanner(System.in);
        try{
            PhoneNumber = new FileWriter( "PhoneNumber.txt");
            while(true){
                System.out.print("name PhoneNumber>>");
                String num = scanner.nextLine();
                if(num.equals("그만")){
                    System.out.println("Phone.txt에 저장되었습니다."); break;
                }
                PhoneNumber.write(num, 0, num.length()); // 입력값 출력.
                PhoneNumber.write("\r\n", 0, 2); //입력 시 줄바꿈
            }
            PhoneNumber.close();
        }catch(IOException e){
            System.out.println("입출력 오류");
        }
    }
}
