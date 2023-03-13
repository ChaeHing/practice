package Thread;

// 버핏과 머스크가 깐부를 맺어 통장을 공유 하여 서로 돈을 인출하는 프로그램

public class ThreadSyn {
    public static void main(String[] args) {

        Runnable threadTask3 = new ThreadTask3(); // Runable 인터페이스 구현 객체
        Thread thread3_1 = new Thread(threadTask3);  // 스레드1 생성
        Thread thread3_2 = new Thread(threadTask3); // 스레드2 생성

        thread3_1.setName("버핏");
        thread3_2.setName("머스크");

        thread3_1.start();
        thread3_2.start();

    }
}

class Acoount { // 계좌 클래스
    private int balance; //잔고

    public Acoount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    synchronized public boolean withdraw(int money) { // 돈 인출 메서드
        //public synchronized boolean withdraw(int money){ // 메서드 전체의 임계 영역 지정
        //synchronized (this) { // 특정 부분 임계 영역 지정
            if (balance >= money) { // 인출하려는 돈보다 잔고가 더 많다면 실행

                try {
                    Thread.sleep(1000); // 스레드를 1초가 멈춤, 문제 상황을 발생시키기 위해 사용
                } catch (Exception error) {
                }

                balance -= money; // 인출하려는 돈
                return true; // 인출후 true 반환

            }
            return false; // 인출이 불가하므로 false 반환
        }
}


class ThreadTask3 implements Runnable {   // 쓰레드
    Acoount account = new Acoount(100000); // 계좌 객체 생성, 십만달러 입금

    // public void run(){

    public void run() {
        while (account.getBalance() > 0) {

            int money = (int) (Math.random() * 3 + 1) * 10000; //  10000~30000 달러 랜덤 생성
            boolean denied = !account.withdraw(money); // 돈 인출 메서드 withdraw() 호출, 결과를 denied의 저장

            System.out.println(String.format("Withdraw %d$ By %s. Balance %d$ %s",
                            money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
                    // 결과 출력
            );
        }
    }
}