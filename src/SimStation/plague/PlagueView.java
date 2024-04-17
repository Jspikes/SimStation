package SimStation.plague;

import SimStation.Agent;
import mvc.Model;
import mvc.View;

public class PlagueView extends View {
    public PlagueView(Model model) {
        super(model);
        PlagueSim plague = (PlagueSim) model;
        for (Agent a: plague.agents){

        }
    }

    public void update(){}
}
