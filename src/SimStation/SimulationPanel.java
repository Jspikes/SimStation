package SimStation;

import mvc.*;

import javax.swing.*;
import java.awt.*;

public class SimulationPanel extends AppPanel {
    private JButton start = new JButton("Start");
    private JButton suspend = new JButton("Suspend");
    private JButton resume = new JButton("Resume");
    private JButton stop = new JButton("Stop");
    private JButton stats = new JButton("Stats");
    public SimulationPanel(AppFactory factory) {
        super(factory);
        /**
         * set and add each button to controlPanel
         */
    }

    public static void main(String[] args){
        AppFactory factory = new SimStationFactory();
        AppPanel panel = new SimulationPanel(factory);
        panel.display();
    }
}
