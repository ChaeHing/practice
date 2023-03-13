package Thread;

public class ThreadEx {
    public static void main(String[] args) {

        /*
        // 1.
        Runnable task1 = new ThreadTask1(); // Runnable 인터페이스 구현한 객체 생성
        Thread thread1 = new Thread(task1); // 구현 객체를 Thread 클래스로 인스턴스화 (스레드 생성)
        thread1.start(); // 작업 스레드 실행 -> run()을 실행 시킨다.


        // 2.
        ThreadTask2 thread2 = new ThreadTask2(); // Thread를 상속받은 클래스 인스턴스화
        thread2.start(); // 작업 스레드 실행 -> run()을 실행 시킨다.
        */


        /*
        Thread thread3 = new Thread(new Runnable() { // 익명 구현 객체
            @Override
            public void run() {
                System.out.println("thread3");

            }
        });
         */

        /*

        thread3.setName("Thread3!!"); // thread3 이름 설정
        thread3.start();
        System.out.println("thread3 name : "+thread3.getName()); // thread3 이름 출력


        Thread thread4 = new Thread() { // 익명 하위 객체
            public void run() {
                System.out.println("thread4");
            }
        };
        thread4.setName("Thread4!!"); // thread4 이름 설정
        thread4.start();

        System.out.println("thread4 name : "+thread4.getName()); // tread4 이름출력

         */

        /*
        for (int i=0; i<100; i++){
            System.out.print("@"); // @ 100개 찍기
        }

         */


        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름 출력
            }
        });

        thread5.start();
        System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름 출력

        /*
        System.out.println("");
        System.out.println("thread1 name : " + thread1.getName());
        System.out.println("thread2 name : " + thread2.getName());
        System.out.println("thread3 name : " + thread3.getName());
        System.out.println(Thread.currentThread().getName());

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name Setting");
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread4.start();
        System.out.println("thread4 name : "+thread4.getName());
        thread4.setName("super thread");
        System.out.println("thread4 name : "+thread4.getName());

        System.out.println(Thread.currentThread().getName());
        */

    }
}
/*
// 1. Runnable 인터페이스 구현 클래스
class ThreadTask1 implements Runnable{
    @Override
    public void run() { // run()메서드 생성
        for (int i=0; i<100; i++){
            System.out.print("*"); // * 100개 찍기
        }
        //System.out.println(Thread.currentThread().getName());

    }
}

// 2. Thread 클래스 상속 클래스
class ThreadTask2 extends Thread{
    public void run(){  // run()메서드 생성
        for (int i=0; i<100; i++){
            System.out.print("#"); // # 100개 찍기
        }
        //System.out.println(Thread.currentThread().getName());
    }
}
*/