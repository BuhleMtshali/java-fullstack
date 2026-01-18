public class TicTacToe {
    public static void main(String[] args){
        //FIRST WE CREATE CHAR[][] WHICH WILL HOLD 1 CHARACTER EACH
        char [][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        //indexes start at 0
        //board[0][0] // top-left
        //board[1][1] // center
        // board[2][2] // bottom-right

        //PRINTING the first ROW manually
        System.out.println(
            board[0][0] + " | " + board[0][1] + " | " + board[0][2]
        );

    }
}
