package Battleship;



import java.util.ArrayList;

public class Player {
    private long points;

    public Player() {
        points = 0;
    }
    public long getPoints() {
        return points;
    }
    public void addPoints(long points) {
        this.points += points;
    }


}
