package frc.robot.commands;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Shooter;
public class ShooterCommand extends CommandBase{

    private final Shooter shooter;
    private int count;

    public ShooterCommand(Shooter shooter){
        this.shooter = shooter;
        addRequirements(shooter);
    }

    @Override
    public void initialize(){
        shooter.set(0,0);
    }

    @Override
    public void execute(){
        count++;
        if(RobotContainer.joystick.getRawButton(0)){
            shooter.set(1, 1);
        }
        else{
            shooter.set(0, 0);
        }
    }

    @Override
    public void end(boolean interrupt){
        shooter.set(0,0);
    }

    @Override
    public boolean isFinished(){
        return count >= 50;
    }
}