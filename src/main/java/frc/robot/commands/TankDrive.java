package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.MeccanumDriveBase;

public class TankDrive extends CommandBase{
    private final MeccanumDriveBase driveBase;

    public TankDrive(MeccanumDriveBase driveBase){
        this.driveBase = driveBase;
        addRequirements(driveBase);
    }

    @Override
    public void initialize(){
        driveBase.setPercent(0, 0, 0, 0);
    }

    @Override
    public void execute(){
        double left = RobotContainer.joystick.getRawAxis(1);
        double right = RobotContainer.joystick.getRawAxis(5);
    }

    @Override
    public void end(boolean interrupt){

    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
