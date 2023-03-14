import java.util.Arrays;

public class tester {
    public static void main(String[] args) {

        Recursion recursion1 = new Recursion();
        recursion1.recursion();


    }
}

class Recursion{
    void recursion(){
        System.out.println("제발 그만해..");
        recursion();
    }
}