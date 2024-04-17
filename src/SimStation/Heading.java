package SimStation;

import java.util.Random;

public class Heading {
    public enum Cardinals {
        NORTH, SOUTH, EAST, WEST;
    }
    public Cardinals direction;

    public Heading(int x){
        direction = Cardinals.values()[x];
    }

    public static Heading random(){
        int x = new Random().nextInt(Cardinals.values().length);
        return new Heading(x);
    }
}
