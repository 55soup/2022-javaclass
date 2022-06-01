package src.InterfaceEx;

interface PhoneInterface{
    final int TIMEOUT = 10000; // 인터페이스에 상수필드 선언
    void sendCall(); // 인터페이스에서는 abstract 생략하여도 추상 메서드로 인식
    void receiveCall(); // 추상 메서드
    default void printLogo() { // default 메소드
        System.out.println("** Phone **");
    }
}
interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS(); //추상메서드
    void receiveSMS();
}
interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x, int y){
        return x + y;
    }
}

class SmartPhone extends PDA implements  MobilePhoneInterface, MP3Interface{ // 인터페이스 다중구현
    //MobliePhoneInterface의 추상 메서드 구현해야함!!

    @Override
    public void sendCall() {
        System.out.println("전화 걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자 보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자 받기");
    }

    @Override
    public void play() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
    //추가로 작성하나 메소드
    public void schedule(){
        System.out.println("일정 관리");
    }
}

class SamsungPhone implements PhoneInterface{
    //PhoneInterface의 모든 추상 메서드 구현해야 함!!

    @Override
    public void sendCall() {
        System.out.println("우리존재화이팅");

    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    
    //삼성폰에만  있는 메서드
    public void flash(){
        System.out.println("전화기가 불이 켜졌습니다.");
    }
}

public class InterfaceEx{
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo(); //인터페이스에 존재하는 디폴트 메서드
        phone.sendCall(); // 삼성폰에서 재정의한 메서드
        phone.sendCall(); //삼성폰에서 재정의한 메서드
        phone.receiveCall(); //삼성폰에서 재정의한 메서드
        phone.flash(); //삼성폰에만 있는 메서드

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo(); // PhoneInterface에 존재하는 메서드
        sPhone.sendCall(); // PhoneInterface에 존재하는 추상메서드
        sPhone.play(); //MP3Interface에 존재하는 추상메서드
        System.out.println("3과 5를 더하면 " + sPhone.calculate(3,5)); //PDA 클래스에 존재하는 메서드
        sPhone.schedule(); // SmartPhone에 존재하는 메서드
    }
}
