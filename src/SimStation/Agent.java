package SimStation;

import java.io.Serializable;

public abstract class Agent implements Serializable, Runnable {
    public Simulation world;

    public String name;
    public Heading heading;
    public int xc;
    public int yc;
    public boolean suspended;
    public boolean stopped = false;
    public Thread myThread;
    
    public void run(){}
    public void start(){}
    public void suspend(){}
    public void resume(){}
    public void stop(){}
    public abstract void update();

    public void move(int steps){}

}
