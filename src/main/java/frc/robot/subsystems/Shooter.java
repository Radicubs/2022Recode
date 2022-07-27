package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import javax.naming.ldap.Control;

public class Shooter extends SubsystemBase {
    private final WPI_TalonFX topMotor;
    private final WPI_TalonFX bottomMotor;

    public Shooter(){
        topMotor = new WPI_TalonFX(Constants.TOP_SHOOTER);
        bottomMotor = new WPI_TalonFX(Constants.BOTTOM_SHOOTER);

        topMotor.configFactoryDefault();
        bottomMotor.configFactoryDefault();

        topMotor.setNeutralMode(NeutralMode.Coast);
        bottomMotor.setNeutralMode(NeutralMode.Coast);
        bottomMotor.setInverted(true);
    }

    public void setMotor(int ticks)
    {
        topMotor.set(ControlMode.Velocity, ticks);
        bottomMotor.set(ControlMode.Velocity, ticks);
    }
}
