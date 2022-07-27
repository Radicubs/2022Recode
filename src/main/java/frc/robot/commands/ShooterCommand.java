package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Shooter;

public class ShooterCommand extends CommandBase {
    private final Shooter shooter;

    public ShooterCommand(Shooter shooter){
        this.shooter = shooter;
        addRequirements(shooter);
    }

    @Override
    public void execute(){
        boolean isHeldDown = RobotContainer.controller.getRawButton(Constants.SHOOTER_BUTTON);
        if(isHeldDown){
            shooter.setMotor(8000);
        }
        else{
            shooter.setMotor(0);
        }
    }

}
