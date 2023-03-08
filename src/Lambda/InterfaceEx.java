package Lambda;

@FunctionalInterface
public interface InterfaceEx {

    //void accept();  // 매개변수, 리턴 없음
    //void accept(int num); // 매개변수 있음
    int accept(int num1, int num2); // 리턴값 있음
}
