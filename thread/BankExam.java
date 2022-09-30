package src.thread;

class Bank{
    private int money = 10000; //계좌 초기 금액
    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int save){//입금
        int m = this.getMoney();
        try{
            Thread.sleep(500); //0.5초간 정지 후 실행
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m+save); //기존 예금액 + 지금 입금액

    }// saveMoney 종료
    public void minusMoney(int minus){
        int m = this.getMoney();
        try{
            Thread.sleep(500); //0,5초간 정지 후 실행
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m-minus); //기존예금액 - 지금 출금액
    }

}

class Family1 extends Thread{ //Thread 상속받아서 구현
    @Override
    public void run() {
        synchronized (BankExam.mybank){
            BankExam.mybank.saveMoney(5000);
        }
        System.out.println("saveMoney(5000): " + BankExam.mybank.getMoney());
    }
}

class Family2 extends Thread{ //Thread 상속받아서 구현
    @Override
    public void run() {
        synchronized (BankExam.mybank){
            BankExam.mybank.minusMoney(2000);
        }
        System.out.println("saveMoney(2000): " + BankExam.mybank.getMoney());
    }
}

public class BankExam {
    public static Bank mybank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 : " +mybank.getMoney());
        Family1 f1 = new Family1();
        Family2 f2 = new Family2();
        f1.start();
        try{
            Thread.sleep(200);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        f2.start();
        
    }
}
