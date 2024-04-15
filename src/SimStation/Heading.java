package SimStation;

public class Heading {
    public int degrees;


    public Heading(){
        degrees = 0;
    }
    public Heading(int degrees){
        this.degrees = degrees;
    }

    public static Heading random(){
        Heading heading = new Heading((int)Math.floor(Math.random() * 360));
        return heading;
    }
}
