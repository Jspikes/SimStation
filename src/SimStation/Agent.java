package SimStation;

import java.io.Serializable;

public abstract class Agent implements Serializable, Runnable {
    public Simulation world;
    public String name;
    public Heading heading;
    public int xc;
    public int yc;
    public boolean suspended = false;
    public boolean stopped = false;
    transient protected Thread myThread;
    
    public void run(){
        myThread = Thread.currentThread();
        onStart();
        while(!stopped){
            checkSuspended();
            update();
            try{
                Thread.sleep(20);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        onExit();
    }
    public void start(){
        suspended = false;
        stopped = false;
        run();
    }
    public void suspend(){
        suspended = true;
    }
    public void resume(){
        suspended = false;
        notify();
    }
    public void stop(){
        stopped = true;
    }
    public abstract void update();

    public void move(int steps){
    }
    public void onStart(){}
    public void onInterrupted(){}
    public void onExit(){}
    private synchronized void checkSuspended() {
        try {
            while(!stopped && suspended) {
                wait();
                suspended = false;
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
