package SimStation;

import mvc.Model;

import java.util.*;

public class Simulation extends Model {
    ArrayList<Agent> agents;

        transient private Timer timer; // timers aren't serializable
        private int clock = 0;

        private void startTimer() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new ClockUpdater(), 1000, 1000);
        }

        private void stopTimer() {
            timer.cancel();
            timer.purge();
        }

        private class ClockUpdater extends TimerTask {
            public void run() {
                clock++;
            }
        }
    public void start(){}

    public void suspend(){}

    public void resume(){}

    public void stop(){}

    public Agent getNeighbor(Agent a, Double radius){

    }

    public void populate(){}
}
