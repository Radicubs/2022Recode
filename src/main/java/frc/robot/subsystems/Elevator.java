package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Elevator extends SubsystemBase {
    private final CANSparkMax motor;

    public Elevator() {
        motor = new CANSparkMax(Constants.ELEVATOR_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);
        motor.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    public void setPercent(double percent)
    {
        motor.set(percent);
    }
}
