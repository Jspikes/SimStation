package SimStation.plague;

import SimStation.Agent;

public class Peasant extends Agent {
    public PlagueSim world;
    public boolean infected = false;
    private int d100;

    @Override
    public void update() {
        synchronized(world) {
            move(5);
            Peasant p = (Peasant) world.getNeighbor(this, world.RANGE);
            if(p == null) {return;}
            if(!infected && p.infected) {
                if (d100() <= world.VIRULENCE) {
                    if(d100() >= world.RESISTANCE){
                        infected = true;
                    }
                }
            }
        }
    }

    public void run() {
        myThread = Thread.currentThread();
        onStart();
        while (!stopped && !suspended) {
            update();
        }
        if (suspended) {
            onInterrupted();
        }
        if (stopped) {
            onExit();
        }
    }

    public void move(int steps) {
    }

    public void onStart() {

        if (d100() <= world.INFECTED) {
            infected = true;
        }
    }

    private int d100(){
        int roll = (int) Math.ceil(Math.random() * 100);
        return roll;
    }
}