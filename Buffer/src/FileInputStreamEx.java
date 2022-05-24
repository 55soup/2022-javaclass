import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try{
            FileInputStream fin = new FileInputStream("test.out");
            int n=0, c;
            while((c = fin.read()) != -1){ //파일의 끝(EOF) -1때까지 반복
                b[n] = (byte) c; //읽은 바이트를 배열에 저장
                n++;
            }
            System.out.println("test.out에서 읽은 배열을 출력합니다.");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i] + " ");
            }
        }catch(IOException e){
            System.out.println("test.out에서 읽지 못했습니다. 경로를 체크하세요.");
        }
    }
}
