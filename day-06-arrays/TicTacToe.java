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

        //PRINTING THE BOARD USING LOOPS
        //1. OUTER LOOP
        for(int row = 0; row < board.length; row++){
            //2. INNER LOOP
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col]);

                if(col < 2){
                    System.out.print(" | ");
                }
            }

            System.out.println();
            if(row < 2){
                System.out.println("---+---+---");
            }
        }

    }
}
