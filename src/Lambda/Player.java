package Lambda;

import java.lang.reflect.Member;

public class Player {
    private String name;
    private String team;

    public Player() {
    }

    public Player(String name) {
        System.out.println("Player(String name) 실행");
        this.name = name;
    }

    public Player(String name, String team) {
        System.out.println("Player(String name, String team) 실행");
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return team;
    }
}
