package homework.Module7_PR3.task5_game;

import java.util.Random;

/*Create a game. You have a field 10x10 cells. Your initial position is left down corner.
You should follow the hero to the top right corner through the field of obstacles.
Use ‘w’, ’e’, ’n’, ’s’ (or alternatively '4', '6', '8', '2') symbols read from console.
Use all possible forms of unary increment and decrement operations to move the hero in the given directions.
Each time assign the result of the operation to your variable.
Use a switch statement the program.
Show the current position of the hero on the field in console as “X” symbol.

Read data from keyboard method (four directions '4', '6', '8', '2'):

   private int getDirection(){
       int direction = 0;

       try {
           BufferedReader br = new BufferedReader(
               new InputStreamReader(System.in));
           direction = Integer.parseInt(br.readLine());
       } catch (IOException ex) {
           System.out.println("Ошибка ввода!!!");
       }

       return direction;
   }*/

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
