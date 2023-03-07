import java.util.Arrays;

public class Enum {

    enum Position { ATTACKER, MIDFIELDER, DEFENDER, GOALKEEPER };

    public static void main(String[] args) {

/*
    Position position = Position.MIDFIELDER; // posion 인스턴스

    switch(position){
        case ATTACKER :
            System.out.println("공격수 입니다.");
            break;
        case MIDFIELDER:
            System.out.println("미드필더 입니다.");
            break;
        case DEFENDER :
            System.out.println("수비수 입니다.");
        case GOALKEEPER:
            System.out.println("골키퍼 입니다.");
        default:
            System.out.println("벤치 선수 입니다.");

*/
        Position[] allPosition = Position.values(); // 모든 열거 객체를 배열로 저장
        System.out.println(Arrays.toString(allPosition)); // [ATTACKER, MIDFIELDER, DEFENDER, GOALKEEPER]

        Position position = Position.DEFENDER; // 참조변수의 열거 객체 DEFENDER 저장
        System.out.println(position.name()); // DEFENDER, 열거 객체 문자열 리턴
        System.out.println(position.ordinal()); // 2, 열거 객체 순번(index) 리턴

        Position position1 = Position.ATTACKER;
        System.out.println(position.compareTo(position1)); // 2, 매개값과 순번(index)차이 리턴

        System.out.println(Position.valueOf("ATTACKER")); // ATTACKER, 주어진 문자열의 열거 객체 리턴


    }

}



