package classwork._9_0310_Annotations.Task1;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatableAnnotation.class)
public @interface MainAnnotation {
    int value();
}
