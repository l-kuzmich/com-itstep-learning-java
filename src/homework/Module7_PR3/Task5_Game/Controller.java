package homework.Module7_PR3.Task5_Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private char getDirection (){
        char direction = ' ';
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = br.readLine().charAt(0);
        } catch (Exception ex){
            System.out.println("Input error");
        }
        return direction;
    }

    public void movePerson (Map map){
        char direction = getDirection();
        switch (direction) {
            case 'a' : {
                map.goToLeft();
                break;
            }
            case 'd' :
            {
                map.goToRight();
                break;
            }
            case 'w' : {
                map.goToTop();
                break;
            }
            case 's' : {
                map.goToBottom();
                break;
            }
            default: {
                System.out.println("Input error");
                break;
            }
        }
    }
}
