package frc.robot.commands;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.MecanumDriveBase;
import frc.robot.RobotContainer;

public class MecanumDriveCommand extends CommandBase {

    private final MecanumDriveBase driveBase;

    public MecanumDriveCommand(MecanumDriveBase db) {
        driveBase = db;
        addRequirements(driveBase);
    }

    @Override
    public void execute() {
        double left = RobotContainer.joystick.getRawAxis(1);
        double right = -RobotContainer.joystick.getRawAxis(0);
        double zRot = RobotContainer.joystick.getRawAxis(4);

        MecanumDrive.WheelSpeeds speeds = MecanumDrive.driveCartesianIK(applyDeadBand(left), applyDeadBand(right), applyDeadBand(zRot));

        driveBase.setVelocity(speeds.frontRight, speeds.frontLeft, speeds.rearRight, speeds.rearLeft);


    }

    public double applyDeadBand(double value) {
        return Math.abs(value) <.05 ? 0:value; //turnary Statement
    }


}