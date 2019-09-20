
import java.util.Scanner;

public class menudriven {
    static int[][] board = {
            {43,44,45,0,47,48,49},
            {36,37,38,39,40,41,42},
            {29,30,31,32,33,34,35},
            {22,23,24,25,26,27,28},
            {15,16,17,18,19,20,21},
            {8,9,10,11,12,13,14},
            {1,2,3,0,5,6,7}};
    
    static int loc = 33;
    static int x;
    static int y;

    public static void pos(int x, int y, int loc, int board[][]) {
    	for (int i = 0; i<7; i++) {
    		for (int j = 0; j<7; j++) {
    			if (board[i][j] == loc) {
    				x = i;
    				y = j;
    			}
    		}
    	}
    	System.out.println(x + " " + y);
    }
    
    public static void printboard (int x, int y, int loc, int board[][]) {
    	for (int i = 0; i < 7; i++) {
    		for (int j = 0; j < 7; j++) {
    			
    		}
    	}
    }
    public static void main(String args[]) {
    	pos(x, y, loc, board);
    }
}
