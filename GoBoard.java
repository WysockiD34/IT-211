class GoBoard {
    
    private final int boardLength = 19;
    private final String emptySpace = " O ";
    private final String blackStone = " B ";
    private final String whiteStone = " W ";
    private String whoseTurn = " B ";

    private String[][] board = new String[boardLength][boardLength];

    GoBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptySpace;
            }
        }

        whoseTurn = blackStone;
    }

    private void changeTurn() {
        if (whoseTurn == blackStone) {
            whoseTurn = whiteStone;
        } else {
            whoseTurn = blackStone;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength
        ||   x < 0
        ||   y >= boardLength
        ||   y < 0) {
                System.out.println("invalid coordinate x: " + x + " y: " + y);
            }

        if (board[x][y] != emptySpace) {
            System.out.println("invalid move, this space is already occupied");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board.length; j++) {
                board[i][j] = emptySpace;
            }
        }

        whoseTurn = blackStone;
    }

    public void displayBoard() {
        System.out.print("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

class GoBoardDemo {
    public static void main(String[] args) {
        GoBoard board = new GoBoard();
        board.displayBoard();
        board.updateBoard(18, 17);
        board.displayBoard();
        board.updateBoard(18, 16);
        board.displayBoard();
        board.updateBoard(18, 15);
        board.displayBoard();
        board.updateBoard(21, 20);
        board.displayBoard();

    }
}

//The only part I am having troubles with is deciding how I would go about not having "current turn" ruin the shape of the board. Besides that I feel like this is a good start to creating a go board.
