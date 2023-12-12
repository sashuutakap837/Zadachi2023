package Devices;

import Other.Command;
import Other.Devices;
public class AutonomCar extends Devices {
    public AutonomCar(Command command) {
        super(command);
    }

    @Override
    public void action() {
        command.action("Автономная машина выполняет действие ");
    }
}