package pr1_KlausurVorbereitung;

import java.util.Random;

public class Direction {
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    private int d;

    public Direction(int d){this.d = d;}

    public Direction(){
        this(new Random().nextInt(4));
    }

    public int getDirection(){return d;}

    public String toString(){
        switch(d){
            case 0: return "UP";
            case 1: return "DOWN";
            case 2: return "LEFT";
            case 3: return "RIGHT";
        }
        return "THIS SHOULD BE IMPLEMENTED";
    }
}
