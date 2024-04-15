package SimStation;

import mvc.*;

public class StopCommand extends Command {
    public StopCommand(Model model){
        super(model);
    }

    @Override
    public void execute(Model model) {
        //Simulation sim = (Simulation) model;
        //sim.stop();
    }
}
