package SimStation.plague;

import SimStation.Agent;
import SimStation.SimPanel;
import SimStation.Simulation;
import mvc.AppPanel;

public class Plague extends Simulation {
    int clock;
    public void populate() {
        for(int i = 0; i < 50; i++)
            addAgent(new Peasant());
    }
    public void start(){
        for(Agent a: agents) {
            a.start();
        }
    }

        public static void main(String[] args) {
            AppPanel panel = new SimPanel(new PlagueFactory());
            panel.display();
        }

    }
