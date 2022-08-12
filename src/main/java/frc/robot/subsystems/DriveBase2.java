package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveBase2 extends SubsystemBase {

    private final WPI_TalonFX frontLeft = new WPI_TalonFX(Constants.FRONT_LEFT_MOTOR);
    private final WPI_TalonFX frontRight = new WPI_TalonFX(Constants.FRONT_RIGHT_MOTOR);
    private final WPI_TalonFX backLeft = new WPI_TalonFX(Constants.BACK_LEFT_MOTOR);
    private final WPI_TalonFX backRight = new WPI_TalonFX(Constants.BACK_RIGHT_MOTOR);

    private final MotorControllerGroup leftMotors = new MotorControllerGroup(frontLeft, backLeft);

    private final MotorControllerGroup rightMotors = new MotorControllerGroup(frontRight, backRight);

    private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    private final ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    private final DifferentialDriveOdometry odometry;

    public DriveBase2 () {
        rightMotors.setInverted(true);
        odometry = new DifferentialDriveOdometry(gyro.getRotation2d());
        resetEncoders();
    }

    public Pose2d getPose() {
        return odometry.getPoseMeters();
    }

    @Override
    public void periodic() {
        odometry.update(gyro.getRotation2d(), frontLeft.getSelectedSensorPosition(), frontRight.getSelectedSensorPosition());
    }

    public void resetEncoders() {
        frontLeft.setSelectedSensorPosition(0);
        frontRight.setSelectedSensorPosition(0);
        backLeft.setSelectedSensorPosition(0);
        backRight.setSelectedSensorPosition(0);
    }

    public DifferentialDriveWheelSpeeds getWheelSpeeds() {
        return new DifferentialDriveWheelSpeeds(frontLeft.getSelectedSensorVelocity(), frontRight.getSelectedSensorVelocity());
    }

    public void resetOdometry(Pose2d pose) {
        resetEncoders();
        odometry.resetPosition(pose, gyro.getRotation2d());
    }

    public void arcadeDrive(double fwd, double rot) {
        drive.arcadeDrive(fwd, rot);
    }

    public void tankDriveVolts(double leftVolts, double rightVolts) {
        leftMotors.setVoltage(leftVolts);
        rightMotors.setVoltage(rightVolts);
    }

    public void setMaxOutput(double max) {
        drive.setMaxOutput(max);
    }

    public void zeroHeading() {
        gyro.reset();
    }

    public double getHeading() {
        return gyro.getRotation2d().getDegrees();
    }

    public double getTurnRate() {
        return -gyro.getRate();
    }


}