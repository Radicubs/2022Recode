package frc.robot.commands;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveBase;

public class DriveBaseCommand extends CommandBase {
    private final DriveBase driveBase;

    public DriveBaseCommand(DriveBase drivebase)
    {
        this.driveBase = drivebase;
        addRequirements(drivebase);
    }

    @Override
    public void execute()
    {
        double sideways = RobotContainer.controller.getRawAxis(Constants.AXIS_ID);
        double upDown = RobotContainer.controller.getRawAxis(Constants.AXIS_ID);
        double rotate = RobotContainer.controller.getRawAxis(Constants.AXIS_ID);

        MecanumDrive.WheelSpeeds wheelSpeeds = MecanumDrive.driveCartesianIK(sideways, upDown, rotate);

        driveBase.setPercent(wheelSpeeds.frontLeft, wheelSpeeds.frontRight, wheelSpeeds.rearLeft, wheelSpeeds.rearRight);
    }

}
