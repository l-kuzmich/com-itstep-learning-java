package classwork._15_2410_CreateMyException.task;

import java.io.FileNotFoundException;

public class FirstCheckedException extends FileNotFoundException {

    public FirstCheckedException(String message){
        super(message);
    }

}
