package Annotation;

public class StandardEx {
    public static void main(String[] args) {

        OldClass oldClass = new OldClass();

        oldClass.getOldField(); // 인텔리제이에서 경고 발생
                                // 더이상 사용하지 않는 코드

    }

}


class SuperClass {
    public void example(){
        System.out.println("example() of SuperClass.");
    }
}

class SubClass extends SuperClass{
    @Override // 오버라이드 확인
    public void example() {
        super.example();
    }
}

class OldClass{
    @Deprecated // 더 이상 사용하지 않는 코드
    private int oldField;

    @Deprecated // 더 이상 사용하지 않는 코드
    void getOldField(){}
}

@FunctionalInterface // 인터페이스 확인
interface InterEx{
    public abstract void example();
}