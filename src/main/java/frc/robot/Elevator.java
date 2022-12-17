package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {

    private final CANSparkMax elevator;

    public Elevator() {
        elevator = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
        elevator.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    public void setPercent(double percent) {
        elevator.set(percent);
    }

}
