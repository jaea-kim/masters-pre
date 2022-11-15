package question1;

import static java.lang.Math.abs;

public class PositivePoint extends Point {
    PositivePoint() {
        super(0,0);
    }

    PositivePoint(int x, int y) {
        super(x<0||y<0?0:x, x<0||y<0?0:y);
    }

    @Override
    public void move(int x, int y) {
        if(x < 0 || y < 0) super.move(getX(), getY());
        else super.move(x,y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

}
