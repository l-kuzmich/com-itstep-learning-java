package homework.Module7_PR3.task5_game;

public class Map {

    public char[][] map;

    int x = 9; //start position (x,y)
    int y = 0;

    public void goToTop() {
        if (map[x--][y] == '#'){
            System.out.println("There is no way!");
            return;
        } else {
            map[x--][y] = 'P';
            map[x++][y] = '-';
        }
    }

    public void goToRight() {
        if (map[x][y++] == '#'){
            System.out.println("There is no way!");
            return;
        } else {
            map[x][y++] = 'P';
            map[x][y--] = '-';
        }
    }

    public void goToLeft() {
        if (map[x][y--] == '#'){
            System.out.println("There is no way!");
            return;
        } else {
            map[x][y--] = 'P';
            map[x][y++] = '-';
        }
    }

    public void goToBottom() {
        if (map[x++][y] == '#'){
            System.out.println("There is no way!");
            return;
        } else {
            map[x++][y] = 'P';
            map[x--][y] = '-';
        }
    }
}
