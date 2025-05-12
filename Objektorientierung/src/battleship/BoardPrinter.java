package battleship;

import java.util.ArrayList;
import java.util.List;

public class BoardPrinter {

    Board board;
    List<Player> playlist = new ArrayList<>();
    List<Board> boardList = new ArrayList<>();

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

