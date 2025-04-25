package Battleship;

public class BoardPrinter {

    Board board;

    public BoardPrinter(Board board) {
        this.board = board;
    }

    public void printBoard(Board board) {
        for (int i = 0; i < this.board.width; i++) {
            for (int j = 0; j < this.board.height; j++) {
                switch (board.getField(i, j)) {
                    case NO_SHIP_NO_HIT -> System.out.print(". ");
                    case SHIP_NO_HIT -> System.out.print(". ");
                    case SHIP_HIT -> System.out.print("D ");
                    case NO_SHIP_HIT -> System.out.print("f ");
                }
            }
            System.out.println();
        }
    }


}

