package Battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    Player player1;
    Player player2;
    int width;
    int height;

    private State fields[][];

    public Board(int width, int height, Player player1, Player player2) {
        this.width = width;
        this.height = height;
        this.player1 = player1;
        this.player2 = player2;
        initializeFields();
        setRandomShips();
    }
    private void initializeFields() {
        //field is generated with NO_SHIP_NO_hit
        if(width != 0 && height != 0) {
            fields = new State[width][height];
            for(int i = 0; i < width; i++) {
                for(int j = 0; j < height; j++) {
                    fields[i][j] = State.NO_SHIP_NO_HIT;
                }
            }
        }
    }
    private void setRandomShips(){
        Random rm = new Random();
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                int randomShip = rm.nextInt(2);
                if(randomShip == 0) {
                    fields[i][j] = State.SHIP_NO_HIT;
                }
            }
        }
    }



    public ArrayList<Integer> getFreeFields(){
        ArrayList<Integer> freeFields = new ArrayList<>();
        int counter = 0;
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                if(fields[i][j] == State.NO_SHIP_NO_HIT) {
                    counter++;
                    freeFields.add(counter);
                }
            }
        }
        return freeFields;
    }
    //in eigene klasse übergeben


    public State getField(int x, int y) {
        return fields[x][y];
    }
    public void setField(int x, int y, State state) {
        fields[x][y] = state;
    }

    public boolean isBoardFinished(){
        boolean finished = false;
        int counter = 0;
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                if(fields[i][j] == State.NO_SHIP_NO_HIT) {
                    counter++;
                }
            }
        }
        if(counter == 0){
            finished = true;
        }
        return finished;
    }

}
