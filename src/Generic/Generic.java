package Generic;

public class Generic {

    // 타입을 구체적으로 지정하는 것이 아니라, 추후에 지정 할 수 있도록 일반화 해두는것 - Generic.Generic(일반적인)
    // 클래스 또는 메서드가 특정 데이터 타입에 얾매이지 않도록 해둔것

    public static void main(String[] args){

        Basket<String> basket1 = new Basket<String>("Generic.Ipad"); // String으로 생성
        Basket<Integer> basket2 = new Basket<Integer>(340); // Interger로 생성
                                                                 // 타입 매개변수에 치환될 타입으로 기본 타입 사용 불가
                                                                 // int -> Integer, double -> Double  (래퍼클래스 사용)

        System.out.println(basket1.getItem());  // Generic.Ipad
        System.out.println(basket2.getItem()); // 340

        basket1.setItem("Galaxy Tab");
        System.out.println(basket1.getItem()); // Galaxy Tab


        Basket<Phone> phoneBasket = new Basket<>(new Iphone());
        phoneBasket.setItem(new Iphone()); // Phone의 자식 클래스 이므로 다형성 가능
       // phoneBasket.setItem(new Galaxy()); // Phone과 아무사이도 아니기 때문에 에러

        // 제한된 클래스 사용
        LimitBasket<Phone> phoneLimitBasket = new LimitBasket<>(new Phone()); // Generic.Phone 자신
        LimitBasket<Iphone> iphoneLimitBasket = new LimitBasket<>(new Iphone()); // Phone의 자식클래스
        //Generic.LimitBasket<Galaxy> galaxyLimitBasket = new Generic.LimitBasket<new Galaxy>(); // 에러 Phone의 자식클래스가 아님

        GenericMethod<String> genericMethod = new GenericMethod<>("test");
        genericMethod.<Integer>print(123); // 제네릭 메서드
        genericMethod.print(1234); // 타입 지정 생략 가능




    }
}
class Basket <T>{ // 제네릭 클래스,  T라는 타입 매겨변수 선언, 임의의 문자로 지정가능 T,K,V (Type, Key, Value) 등 사용
    private T item;
    // static T item; // 클래스 변수에는 사용 불가 - 클래스 변수의 타입이 인스턴스 별로 달라 지게 된다.
                      // 클래스 변수는 공통적으로 사용해야 하는데 인스턴스별로 타입을 다르게 생성하면 같은 타입이 아니게 된다.

    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }



}

class LimitBasket <T extends Phone>{  // 제한된 제네릭, 인스턴스화 할때 Phone의 하위 클래스만 지정 가능
                                     // 인터페이스도 가능 구현한 클래스만 사용가능
                                     // 특정클래스를 상속받으면서 인터페이스를 구현한 클래스 타입도 지정 가능
                                     //  <T extend 부모클래스명 & 인터페이스명>

    private T item;

    public LimitBasket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}


class GenericMethod<T>{ // 1. 제네릭 클래스의 타입 매개변수
    private T result;
    public GenericMethod(T result) {
        this.result = result;
    }

    public T getNum() {
        return result;
    }

    public void setNum(T result) {
        this.result = result;
    }

    public <T> void print(T element){ // 2. 제네릭 메소드의 타입 매겨변수,  1과 2는 서로 다르다.
        System.out.println(element);
        //System.out.println(element.length());  // 타입이 지정안됬기 때문에 특정클래스 메서드 사용 불가
    }

    public static <T> void print2(T elemnet){ // 제네릭 메서드는 static 사용가능
        System.out.println("static 메서드");
    }



}

class Phone{ }
class Iphone extends Phone{}
class Ipad{}

class IphoneSe extends Iphone{}

class User<T>{
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}

class WildCard{
    public void upLimit(User<? extends Phone> user){
        System.out.println("My phone : "+ user.phone);
    }
    public void downLimit(User<? super Iphone> user){
        System.out.println("My phone : "+ user.phone);

    }
}
