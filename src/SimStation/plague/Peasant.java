package SimStation.plague;

import SimStation.Agent;
import SimStation.Heading;

public class Peasant extends Agent {
    public PlagueSim world;
    public boolean infected = false;
    @Override
    public void update() {
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

    public void run() {
        myThread = Thread.currentThread();
        onStart();
        while (!stopped) {
            checkSuspended();
            update();
        }
    }
    public void start(){}
    public void suspend(){ suspended = true; }
    public void resume(){ notify(); }
    public void stop(){ stopped = true; }
    public void move(int steps) {
        heading = Heading.random();
        int stepsTaken = 0;
        int xMove = 0;
        int yMove = 0;
        switch(heading.direction) {
            case NORTH: {
                yMove++;
                break;
            }
            case SOUTH: {
                yMove--;
                break;
            }
            case EAST: {
                xMove++;
                break;
            }
            case WEST: {
                xMove--;
                break;
            }
        }
        while(stepsTaken < steps) {
            xc += xMove;
            yc += yMove;
            world.changed();
            stepsTaken++;
        }
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