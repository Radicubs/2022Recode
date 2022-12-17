package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.MecanumDriveCommand;
import frc.robot.commands.TankDrive;

public class MecanumDriveBase extends SubsystemBase {
    private final WPI_TalonFX frontRight;
    private final WPI_TalonFX frontLeft;
    private final WPI_TalonFX backRight;
    private final WPI_TalonFX backLeft;
    public MecanumDriveBase() {
        frontRight = new WPI_TalonFX(2);
        frontLeft = new WPI_TalonFX(1);
        backRight = new WPI_TalonFX(3);
        backLeft = new WPI_TalonFX(4);
        frontLeft.setInverted(true);
        backLeft.setInverted(true);
        setDefaultCommand(new MecanumDriveCommand(this));
    }

    public void setPercent(double fr, double fl, double br, double bl) {
        frontRight.set(ControlMode.PercentOutput, fr);
        frontLeft.set(ControlMode.PercentOutput, fl);
        backRight.set(ControlMode.PercentOutput, br);
        backLeft.set(ControlMode.PercentOutput, bl);
    }

    public void setVelocity(double fr, double fl, double br, double bl) {
        frontRight.set(ControlMode.Velocity, fr*6380*2048/600);
        frontLeft.set(ControlMode.Velocity, fl*6380*2048/600);
        backRight.set(ControlMode.Velocity, fr*6380*2048/600);
        backLeft.set(ControlMode.Velocity, bl*6380*2048/600);
    }




}
