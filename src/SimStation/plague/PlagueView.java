package SimStation.plague;

import SimStation.Agent;
import mvc.Model;
import mvc.View;

import java.awt.*;

public class PlagueView extends View {
    public PlagueView(Model model) {
        super(model);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        PlagueSim plague = (PlagueSim) model;
        for(Agent a: plague.agents){
            g.fillRect(a.xc, a.yc, 10, 10);
        }
    }

    public void update(){}
}
