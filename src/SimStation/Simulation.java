package SimStation;

import mvc.Model;

import java.util.*;

public class Simulation extends Model {
    public ArrayList<Agent> agents;
    transient private Timer timer; // timers aren't serializable
    private int clock = 0;
    private void startTimer() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new ClockUpdater(), 1000, 1000);
    }
    private class ClockUpdater extends TimerTask {
        public void run() {
            clock++;
        }
    }
    private void stopTimer() {
        timer.cancel();
        timer.purge();
    }
    public void start(){}

    public void suspend(){}

    public void resume(){}

    public void stop(){}

    public Agent getNeighbor(Agent a, Double radius){
        boolean found = false;
        int i = (int) Math.floor(Math.random() * agents.size());
        int count = 0;
        while(!found) {
            i++;
            count++;
            if(i >= agents.size()) {i = 0;}
            int xDiff = a.xc - agents.get(i).xc;
            int yDiff = a.yc - agents.get(i).yc;
            double rad = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
            if(rad <= radius && !a.equals(agents.get(i))){ found = true; }
            if(count >= agents.size()) { return null; }
        }
            return agents.get(i);
    }

    public void addAgent(Agent agent){
            agents.add(agent);
            notifySubscribers();
    }
    public void populate(){}
}
