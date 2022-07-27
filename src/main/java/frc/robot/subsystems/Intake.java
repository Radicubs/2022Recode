package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

    private final CANSparkMax motor;

    public Intake(){
        motor = new CANSparkMax(Constants.INTAKE_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);
        motor.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    public void setPercent(double percent){
        motor.set(percent);
    }
}
