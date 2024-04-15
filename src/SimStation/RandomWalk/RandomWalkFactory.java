package SimStation.RandomWalk;

import SimStation.SimFactory;
import mvc.Model;

public class RandomWalkFactory extends SimFactory {
    public Model makeModel() {
        return new RandomWalkSimulation();
    }

    public String getTitle() {
        return "Random Walks";
    }
}
