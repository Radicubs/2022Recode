// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int INTAKE_MOTOR = 0;
    public static final int ELEVATOR_MOTOR = 0;
    public static final int CONTROLLER = 0;
    public static final int A_BUTTON = 0;
    public static final int B_BUTTON = 0;
    public static final int TOP_SHOOTER = 0;
    public static final int BOTTOM_SHOOTER = 0;
    public static final int SHOOTER_BUTTON = 0;
    public static final int FRONT_LEFT_MOTOR = 0;
    public static final int BACK_LEFT_MOTOR = 0;
    public static final int FRONT_RIGHT_MOTOR = 0;
    public static final int BACK_RIGHT_MOTOR = 0;
    public static final int AXIS_ID = 0;
    public static final double ksVolts = 0;
    public static final double kvVoltSecondsPerMeter = 0;
    public static final double kaVoltSecondsSquaredPerMeter = 0;
    public static final double kPDriveVel = 0;
    public static final double kTrackwidthMeters = 0;
    public static final DifferentialDriveKinematics kDriveKinematics = new DifferentialDriveKinematics(kTrackwidthMeters);
    public static final double kMaxSpeedMetersPerSecond = 0;
    public static final double kMaxAccelerationMetersPerSecondSquared = 0;
    public static final double kRamseteB = 0;
    public static final double kRamseteZeta = 0;
}
