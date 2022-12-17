package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Intake;
import frc.robot.RobotContainer;

public class IntakeCommand extends CommandBase {

    private final Intake intakeMotor;


    public IntakeCommand(Intake intakeMotor) {
        this.intakeMotor = intakeMotor;
        addRequirements(intakeMotor);
    }

    public void execute() {
        boolean isHeldDown = RobotContainer.joystick.getRawButton(0);
        if(isHeldDown) {
            intakeMotor.setPercent(.5);
        } else {
            intakeMotor.setPercent(0);
        }
    }
}
