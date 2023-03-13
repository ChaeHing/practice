package Annotation;

import java.lang.annotation.Repeatable;

@MetaAnno("class annotation")
@Work("first annotation") // @Repeatble에 의해 두개
@Work("Second annotation") // @Repeatable에 의해 두개
public class MetaEx {
    @MetaAnno("method annotation")
    public static void main(String[] args) {

    }

}

@MetaAnno("super")
class Super {}

class Sub extends Super{}  // @Inherited에 의해 @MetaAnno("super") 애너테이션이 붙은것으로 인식
