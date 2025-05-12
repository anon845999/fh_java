package battleship;

public class Ship {

    private int x;
    private int y;
    private boolean horizontal;

    public Ship(int x, int y, boolean horizontal) {
        this.x = x;
        this.y = y;
        this.horizontal = horizontal;

    }
    public int getX() {
        return x;

    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }



}
