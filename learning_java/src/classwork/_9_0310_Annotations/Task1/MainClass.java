package classwork._9_0310_Annotations.Task1;

import java.lang.annotation.Annotation;

@MainAnnotation(4)
@MainAnnotation(5)
@MainAnnotation(15)
@NewAnnotation("hi")
public class MainClass {
    public static void main(String[] args) {
        printAnnotation();
        System.out.println(isNewAnnotationPresent());
    }

    public static void printAnnotation(){
        MainClass mainClass = new MainClass();
        try {
            Annotation[] annotationsArray = mainClass.getClass().getAnnotations();
            for (Annotation a: annotationsArray) {
                System.out.println(a);
            }
        } catch (Exception e){

        }
    }

    public static boolean isNewAnnotationPresent(){
        return MainClass.class.isAnnotationPresent(NewAnnotation.class);
    }
}
