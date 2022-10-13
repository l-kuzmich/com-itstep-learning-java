package homework.Module9_PR5;

/*Create a 2D array and a 3D array. Copy the 2D array into a part of the 3D array.
* Reference redirection, real copy of the initial 2D array as a branch of the 3D array*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] twoD = {3,4,5,6};
        int [][] threeD = {
                {6,7,8,9,0},
                {1,1,1,1,1},
                {0,0,0,0,0}
        };

        System.arraycopy(twoD, 0, threeD[2], 1, 4);
        threeD[1] = twoD;

        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                System.out.print(threeD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(threeD[2]));
        System.out.println(Arrays.toString(twoD));
    }
}
