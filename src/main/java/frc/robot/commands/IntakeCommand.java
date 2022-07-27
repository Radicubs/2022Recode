package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;


public class IntakeCommand extends CommandBase {
    private final Intake intake;

    public IntakeCommand(Intake intake)
    {
        this.intake = intake;
        addRequirements(intake);
    }

    @Override
    public void execute()
    {
        boolean isHeldDown = RobotContainer.controller.getRawButton(Constants.A_BUTTON);
        if(isHeldDown){
            intake.setPercent(.5);
        }
        else{
            intake.setPercent(0);
        }
    }

}
