package SimStation;

import mvc.*;
import java.awt.*;

public class SimulationView extends View {
    public SimulationView(Simulation sim) {
        super(sim);
    }
    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);

        Simulation sim = (Simulation) model;
        //set colors for all agents? default white on black background
    }

}
