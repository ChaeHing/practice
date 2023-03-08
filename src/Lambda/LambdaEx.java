package Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaEx {
    public static void main(String[] args) {

        // 기존 메서드
        // int sum(int num1, int num2){
        //     return num1+num2;
        // }

        // 람다식 기본 표현
        // (int num1, int num2) -> { return num1+num2 };

        //FunctionInterface functionInterface = (num1, num2) -> num1 + num2;
        //System.out.println(functionInterface.sum(5, 10));

        //Lambda.InterfaceEx interfaceEx = () -> System.out.println("accept() 호출");
        //interfaceEx.accept();

        //Lambda.InterfaceEx interfaceEx = (num) -> {
        // int sum = num + 5;
        // System.out.println(num);
        // }
        //interfaceEx.accept(30);

        /*
        Lambda.InterfaceEx interfaceEx = (num1, num2) -> num1 + num2;
        int result = interfaceEx.accept(5, 5);
        System.out.println(result);

        interfaceEx = (num1, num2) -> num1 * num2;
        result = interfaceEx.accept(5, 5);
        System.out.println(result);
         */

        /*
        IntBinaryOperator operator; // int형 매개값 두개를 입력받아 int값을 리턴
                                    // 기본 함수형 인터페이스

        operator = Lambda.Calculator::staticMethod; // 정적 메서드
        System.out.println("정적메서드: " + operator.applyAsInt(5, 10));

        Lambda.Calculator calculator = new Lambda.Calculator(); // Lambda.Calculator 인스턴스화
        operator = calculator::instanceMethod; // 인스턴스 메서드
        System.out.println("인스턴스 메서드: "+ operator.applyAsInt(5, 10));
        */

        Function<String, Player> function1 = Player::new; // 기본 함수형 인터페이스, Function<입력타입, 출력타입>
        Player player1 = function1.apply("Messi");

        BiFunction<String, String, Player> function2 = Player::new; // 기본 함수형 인터페이스, BiFunction<입력타입1, 입력타입2, 출력타입>
        Player player = function2.apply("Messi", "PSG");

    }
}
