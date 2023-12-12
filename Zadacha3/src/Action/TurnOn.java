package Action;

import Other.Command;

public class TurnOn implements Command {
    @Override
    public void action(String str) {
        System.out.println(str + "включиться");
    }
}
