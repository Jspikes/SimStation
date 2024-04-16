package SimStation;

import mvc.*;

public class StatsCommand extends Command {
    public StatsCommand(Model model){
        super(model);
    }

    @Override
    public void execute(Model model) {
        Simulation sim = (Simulation) model;
        sim.stats();
    }
}
