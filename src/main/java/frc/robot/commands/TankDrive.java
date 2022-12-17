package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.MecanumDriveBase;
import frc.robot.RobotContainer;

import java.net.URLConnection;

public class TankDrive extends CommandBase {

    private final MecanumDriveBase driveBase;

    public TankDrive(MecanumDriveBase db) {
        driveBase = db;
        addRequirements(driveBase);
    }

    @Override
    public void execute() {
        double left = RobotContainer.joystick.getRawAxis(1);
        double right = RobotContainer.joystick.getRawAxis(5);

        driveBase.setPercent(right, left, right, left);

    }

}
