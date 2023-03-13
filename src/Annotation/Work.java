package Annotation;

import java.lang.annotation.*;

@interface Works {  // 여러개의 Work애너테이션을 담을 컨테이너 애너테이션 Works
    Work[] value();
}

@Repeatable(Works.class) // 컨테이너 애너테이션 지정
@interface Work {
    String value();
}