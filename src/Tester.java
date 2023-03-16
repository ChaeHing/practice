import java.util.*;

public class Tester {
    public static void main(String[] args) {

        // stack 생성
        Stack<String> stack = new Stack<>();

        // stack 입력
        stack.push("first data");
        stack.push("second data");
        stack.push("third data");

        System.out.println("----------------------");
        System.out.println("stack 입력후");
        System.out.println(stack);

        // stack 삭제
        stack.pop();
        System.out.println("----------------------");
        System.out.println("stack 삭제후");
        System.out.println(stack);
        System.out.println("마지막에 입력한 데이터가 삭제 된다.");

        // 가장상단값 출력, 마지막에 넣은 데이터
        System.out.println("----------------------");
        System.out.println("가장 상단값");
        System.out.println(stack.peek());

        // stack (크기)사이즈 출력
        System.out.println("----------------------");
        System.out.println("stack 사이즈");
        System.out.println(stack.size());

        // stack이 비어있는지 체크 boolean 타입
        System.out.println("----------------------");
        System.out.println("stack이 비어 있나요?");
        System.out.println(stack.isEmpty());

        // stack내 해당 데이터가 있는지 체크
        System.out.println("----------------------");
        System.out.println("해당 데이터가 stack 안에 있나요?");
        System.out.println(stack.contains("second data"));

        // stack 비우기 -> 전부삭제
        System.out.println("----------------------");
        System.out.println("stack 비우기 이후");
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.isEmpty());



    }
}



