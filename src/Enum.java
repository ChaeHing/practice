public class Enum {

    enum Position { ATTACKER, MIDFIELDER, DEFENDER, GOALKEEPER };

    public static void main(String[] args) {

/*
    Position position = Position.MIDFIELDER;

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
        Position position = Position.DEFENDER;

        Position[] allPosition = Position.values();

        System.out.println(position.name());
        System.out.println(position.ordinal());

        Position position1 = Position.ATTACKER;

        System.out.println(position.compareTo(position1));
        System.out.println(position1 == Position.valueOf("DEFENDER"));

        System.out.println(Position.values());

    }

}



