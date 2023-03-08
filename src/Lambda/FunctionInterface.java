package Lambda;

@FunctionalInterface // 애너테이션, 컴파일러가 인터페이스가 바르게 정의 되었는지 확인
interface FunctionInterface {
    int sum(int num1, int num2);
}