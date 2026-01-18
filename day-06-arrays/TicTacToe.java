public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', ' '},
            {' ', 'O', 'X'}
        };

        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < 2) System.out.print(" | ");
            }

            System.out.println();
            if (row < 2) System.out.println("---+---+---");
        }
    }
}
