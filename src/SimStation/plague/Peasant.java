package SimStation.plague;

import SimStation.Agent;

public class Peasant extends Agent {
    @Override
    public void update() {
    }
    public void run(){
        myThread = Thread.currentThread();
        onStart();
        while(!stopped&&!suspended){
            update();
            try{
                myThread.wait();
                Thread.sleep(20);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        if(suspended){onInterrupted();}
        if(stopped){onExit();}
    }
    public void start(){}
    public void suspend(){}
    public void resume(){}
    public void stop(){}

    public void move(int steps){}
}