package homework.Module7_PR3.Task5_Game;

import java.util.Random;

public class Game extends Map{

    private Map generateMap() {
        Map map = new Map();
        map.map = new char[10][20];
        Random random = new Random();

        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {

                if (random.nextInt(9) == random.nextInt(9)) {
                    map.map[i][j] = '#';
                    continue;
                }
                map.map[i][j] = '-';
            }
        }

        map.map[9][0] = 'P';
        map.map[0][19] = '-';

        return map;
    }

    public void displayMap (char[][] map){
        for (char[] chars : map) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        Controller controller = new Controller();

        map = game.generateMap();
        game.displayMap(map.map);

        while (/*map.map[0][19] == 'P'*/ true){

            controller.movePerson(map);
            game.displayMap(map.map);
        }

    }
}
