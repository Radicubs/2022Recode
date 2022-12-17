package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Elevator;
import frc.robot.Intake;
import frc.robot.RobotContainer;

public class ElevatorCommand extends CommandBase {

    private final Elevator e;


    public ElevatorCommand(Elevator e) {
        this.e = e;
        addRequirements(this.e);
    }

    public void execute() {
        boolean isHeldDown = RobotContainer.joystick.getRawButton(0);
        if(isHeldDown) {
            e.setPercent(.5);
        } else {
            e.setPercent(0);
        }
    }

}
