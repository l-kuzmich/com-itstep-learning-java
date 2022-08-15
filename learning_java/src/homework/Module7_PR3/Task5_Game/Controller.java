package homework.Module7_PR3.Task5_Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private int getDirection (){
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (IOException ex){
            System.out.println("Input error");
        }
        return direction;
    }

    public void movePerson (Map map){
        int direction = getDirection();
        switch (direction) {
            case 4 : {
                map.goToLeft();
                break;
            }
            case 6 :
            {
                map.goToRight();
                break;
            }
            case 8 : {
                map.goToTop();
                break;
            }
            case 2 : {
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
