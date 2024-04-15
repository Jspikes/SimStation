package SimStation;

import SimStation.plague.Plague;
import SimStation.plague.PlagueView;
import mvc.AppFactory;
import mvc.Command;
import mvc.Model;
import mvc.View;

import java.util.ArrayList;

public class SimFactory implements AppFactory {
    public Model makeModel() {
        return new Simulation();
    }
    public View makeView(Model model) {
        return new SimView(model);
    }

    public String getTitle() {
        return "SimStation";
    }

    public String[] getHelp() {
        ArrayList<String> help = new ArrayList<>();
        help.add("help!");
        String[] helpArray = (String[]) help.toArray();
        return helpArray;
    }

    public String about(){
        return "<Cool Group Name Here> Software 2024";
    }

    public String[] getEditCommands(){
        String[] commands = new String[5];
        commands[0] = "Start";
        commands[1] = "Suspend";
        commands[2] = "Resume";
        commands[3] = "Stop";
        commands[4] = "Stats";
        return commands;
    }

    public Command makeEditCommand(String name){
        return null;
    }
}
