package battleship;


public class Player {
    private String name;
    private long points;

    public Player() {
        points = 0;
    }
    public Player(String name) {
        this.name = name;
    }

    public long getPoints() {
        return points;
    }
    public void addPoints(long points) {
        this.points += points;
    }


}
