package oop_2_6;
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
public @interface About {
    String Author();
    String Version();
}
