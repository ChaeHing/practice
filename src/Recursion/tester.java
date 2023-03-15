package Recursion;

public class tester {
    public static void main(String[] args) {

        Recursion recursion1 = new Recursion();
        recursion1.recursion(5);


    }
}

class Recursion{
    void recursion(int num){

        if(num == 0) return;

        recursion(num-1);

        System.out.println(num);
    }
}