package IWantToPlayAGame.units;

public class Position {
    
    protected int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected double distance(Position defence) {
        return Math.sqrt((defence.x - x) * (defence.x - x) + (defence.y - y) * (defence.y - y));
    }

}
