package Annotation;

import java.lang.annotation.*;


@Retention(RetentionPolicy.SOURCE) // 컴파일시에만 확인하고 사라진다.
@Inherited // 해당 애너테이션을 상위 클래스가 사용한다면 하위클래스에도 동일 하게 적용
@Documented // javadoc로 작성한 문서에 포함
@Target({ElementType.METHOD, ElementType.TYPE}) // 메서드와 타입(클래스, 인터페이스, 열거형)에 사용가능
@interface MetaAnno {
    String value();
}
