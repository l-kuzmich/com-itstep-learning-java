package classwork._9_0310_Annotations.Task1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {
    MainAnnotation [] value();
}
