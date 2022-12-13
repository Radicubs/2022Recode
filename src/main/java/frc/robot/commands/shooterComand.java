package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class shooterComand extends CommandBase {

    private final Shooter shooter;
    private int count;

    public ShooterCommand(Shooter s) {
        shooter = s;
        count = 0;
        addRequirements(shooter);

    }

    @Override
    public void initialize() {
        shooter.set(0,0);
    }

    @Override
    public void execute() {
        count++;
        if(RobotContainer.joystick.getRawButton()) {
            shooter.set(1,1);
        } else {
            shooter.set(0, 0);
        }
    }

    @Override
    public void end(boolean interrupt) {
        shooter.set(0, 0);
    }

    @Override
    public boolean isFinished() {
        return count >= 50;
    }

}
