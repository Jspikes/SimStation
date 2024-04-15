package SimStation.RandomWalk;

import SimStation.RandomWalk.RandomWalkFactory;
import SimStation.SimPanel;
import SimStation.Simulation;
import mvc.AppPanel;

public class RandomWalkSimulation extends Simulation {

    public void populate() {
        for(int i = 0; i < 15; i++)
            addAgent(new Drunk());
    }

    public static void main(String[] args) {
        AppPanel panel = new SimPanel(new RandomWalkFactory());
        panel.display();
    }

}