package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class Exceptions {

    public static void main(String[] args) {
        //BufferedReader notExist = new BufferedReader(new FileReader("없는 파일"));
        //notExist.readLine();
        //notExist.close();
        // java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

        //int i;
        //for(i=1; i<=5; i++{
        //    System.out.println(i);
        //}
        // java: ')' expected

        // 컴파일에러, 신탁스에러 - 문법적 오류, 컴파일러가 감지
        // 런타임전 빨간색줄로 알려줌

        //int array[] = {2,4,6};
        //System.out.println(array[3]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at Exception.main(Exception.java:12)

        //System.out.println(4 * 4);
        //System.out.println(4 / 0); // 예외 발생
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Exception.main(Exception.java:26)
        // 런타임 에러, 개발자가 컴퓨터가 수행할 수 없는 특정한 작업을 요청할때 발생
        // JVM에 의해서 감지된다.

        // 런타임시 발생할수 있는 프로그램의 오류는 에러와 예외로 구분
        // 에러 : 복구하기 어려운 수준의 심각한 오류
        // ex) OutOfMemoryError, StackOverflowError
        // 예외 : 잘못된 사용 또는 코딩으로 인한 상대적으로 미약한 수준의 오류
        //        코드 수정 등을 토해 수습이 가능
        // 예외상황은 개발자가 핸들링 가능함.

        // 예외의 최고 상위 클래스는 Exception
        // 일반 예외 클래스와 실행 예외 클래스로 나뉨

        // 일반 예외 클래스
        // 컴파일러가 코드 실행 전에 예외처리 코드 여부를 검사 - checked 예외
        // 잘못된 클래스(ClassNotFoundException))명 이나 데이터 형식(DataFormatException)등
        // 사용자 편의 실수로 발생하는 경우

        // 실행 예외 클래스
        // 컴파일러가 예외 처리 코드 여부를 검사하지 않는다. - unchecked 예외
        // 주로 개발자의 실수에 의해 발생하는 경우, 자바 문법 요소와 관련된다.
        // 클래스 간 형변환 오류(ClassCastException),
        // 벗어난 배열 범위 지정(ArrayIndexOutOfBoundsException),
        // 값이 null인 참조변수 사용(NullPointerException) 등

        // try - catch문
        // 예외 처리란 잠재적으로 발생 할 수 있는 비정상 종료나 오류에 대비하여 정살 실행을 유지
        // 할 수 있도록 처리하는 코드 작성 과정

        /*
        try{
            // 예외 발생 가능성이 있는 코드 삽입
        }
        catch (ExceptionType1 e1){
            // ExceptionType1 유형의 예외 발생시 실행 코드
        }
        catch (ExceptionType2 e2){
            // ExceptionType2 유형의 예외 발생시 실행 코드
        } finally {
            // 옵션 조건
            // 예외 발생 여부와 상관없이 항상 실행
        }
        */
        // 정상적으로 실행되면 catch는 실행되지 않고 finally가 실행됨
        // catch는 해당 유형의 예외가 발생하는 경우 실행
        // catch가 여러개면 일치하는 하나의 catch만 실행
        // 일치하는 예외를 못찾는 경우 예외 처리 되지 못함

     /*
        System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
        printMyName("abc"); // (1)
        printMyName(null); // (2) 넘겨주는 매개변수가 null인 경우 NullPointerException 발생
        System.out.println("[프로그램 종료]");
        // Exception in thread "main" java.lang.NullPointerException
    */
/*
        try{
            System.out.println("[소문자 알파벳을 대문자로 출력하는 프로그램]");
            printMyName(null); // (1) 예외 발생 NullPointerException 발생
            printMyName("abc"); // 이 코드는 실행 되지 않음
        }
        catch (ArithmeticException e){ // (2) instanceOf 연산자를 통해 예외클래스의 인스턴스와 비교
                                       // 예외처리 되지 않음
            System.out.println("ArithmeticException 발생");
        }
        catch (NullPointerException e){ // (3) 일치하기 때문에 예외처리됨 {} 안 실행
            System.out.println("NullPointerException 발생");

            // 예외 정보 얻는 방법 세개
            System.out.println("e.getMessage: " + e.getMessage());
            System.out.println("e.toString " + e.toString());
            e.printStackTrace();
        }
        finally { // (4) 예외 발생 여부와 관계 없이 무조건 실행,  option 이기 때문에 생략 가능
            System.out.println("프로그램 종료");
        }
    }
    static void printMyName(String str) {
        String upperCaseAlphabet = str.toUpperCase();
        System.out.println(upperCaseAlphabet);
    }
*/
    // [소문자 알파벳을 대문자로 출력하는 프로그램]
    // NullPointerException 발생
    // e.getMessage: null
    // e.toString java.lang.NullPointerException
    // 프로그램 종료

    /*
        try {
            throwException();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
 }

    static void throwException() throws ClassNotFoundException, NullPointerException {
        Class.forName("java.lang.StringX");
    }
     */
        try {
            Exception intendedException = new Exception("의도된 예외 만들기");
            throw intendedException;
        } catch (Exception e) {
            System.out.println("고의로 예외 발생시키기 성공!");
        }
    }
}

