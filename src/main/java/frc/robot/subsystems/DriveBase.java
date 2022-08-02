package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriveBase extends SubsystemBase {
    private final WPI_TalonFX frontLeft;
    private final WPI_TalonFX backLeft;
    private final WPI_TalonFX frontRight;
    private final WPI_TalonFX backRight;

    public DriveBase()
    {
        frontLeft = new WPI_TalonFX(Constants.FRONT_LEFT_MOTOR);
        frontRight = new WPI_TalonFX(Constants.FRONT_RIGHT_MOTOR);
        backLeft = new WPI_TalonFX(Constants.BACK_LEFT_MOTOR);
        backRight = new WPI_TalonFX(Constants.BACK_RIGHT_MOTOR);

        List<WPI_TalonFX> motors = Arrays.asList(frontLeft, frontRight, backLeft, backRight);
        for(WPI_TalonFX motor:motors){
            motor.configFactoryDefault();
            motor.setNeutralMode(NeutralMode.Brake);
        }


    }
    public void setPercent(double fLPercent, double fRPercent, double bLPercent, double bRPercent)
    {
        frontLeft.set(fLPercent);
        frontRight.set(fRPercent);
        backLeft.set(bLPercent);
        backRight.set(bRPercent);
    }


}
