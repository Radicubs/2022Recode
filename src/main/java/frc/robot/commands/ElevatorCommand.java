package frc.robot.commands;


import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Elevator;

public class ElevatorCommand extends CommandBase{
    private final Elevator elevator;

    public ElevatorCommand(Elevator elevator)
    {
        this.elevator = elevator;
        addRequirements(elevator);
    }

    @Override
    public void execute(){
        boolean isHeldDown = RobotContainer.controller.getRawButton(Constants.B_BUTTON);
        if(isHeldDown)
        {
            elevator.setPercent(.5);
        }
        else{
            elevator.setPercent(0);
        }
    }
}
