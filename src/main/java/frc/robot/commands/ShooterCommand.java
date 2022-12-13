package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Shooter;

public class ShooterCommand extends CommandBase {
    //initialize, execution, terminate steps, uses initialize method
    //execution happens every 20 milliseconds, uses execute method
    //termination to stop all the motors, uses end method
    private final Shooter shooter;
    private int count;
    public ShooterCommand(Shooter i) {
        shooter = i;
        count = 0;
        //addRequirements sets requirements before the command can run
        addRequirements(shooter);
    }
    @Override
    public void initialize(){
        shooter.set(0, 0);
    }
    @Override
    public void execute(){
        count++;
        if (RobotContainer.joystick.getRawButton(0))
        {
            shooter.set(1, 1);
        }
        else
        {
            shooter.set(0, 0);
        }
    }
    @Override
    public void end(boolean interrupt){
        shooter.set(0, 0);
    }
    @Override
    //Optional
    public boolean isFinished(){
        return count >= 50;
    }

}
