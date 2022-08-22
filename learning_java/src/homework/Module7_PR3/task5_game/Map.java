package homework.Module7_PR3.Task5_Game;

public class Map {

    public char[][] map;

    public int x = 9; //start position (x,y)
    public int y = 0;

    public void goToTop() {
        if (x == 0) {
            System.out.println("There is no way!");
        } else {
            if (map[--x][y] == '#') {
                System.out.println("There is no way!");
                x++;
            } else {
                map[++x][y] = '-';
                map[--x][y] = 'P';
            }
        }
    }

    public void goToRight() {
        if (y == 19) {
            System.out.println("There is no way!");
        } else {
            if (map[x][++y] == '#') {
                System.out.println("There is no way!");
                y--;
            } else {
                map[x][--y] = '-';
                map[x][++y] = 'P';
            }
        }
    }

    public void goToLeft() {
        if (y == 0) {
            System.out.println("There is no way!");
        }
        else {
            if (map[x][--y] == '#') {
                System.out.println("There is no way!");
                y++;
            } else {
                map[x][++y] = '-';
                map[x][--y] = 'P';
            }
        }
    }

    public void goToBottom() {
        if (x == 9) {
            System.out.println("There is no way!");
        }
        else {
            if (map[++x][y] == '#') {
                System.out.println("There is no way!");
                x--;
            } else {
                map[--x][y] = '-';
                map[++x][y] = 'P';
            }
        }
    }
}
