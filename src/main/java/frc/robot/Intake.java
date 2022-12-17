package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.MecanumDriveCommand;

public class Intake extends SubsystemBase {

    private final CANSparkMax intake;

    public Intake() {
        intake = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
        intake.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    public void setPercent(double percent) {
        intake.set(percent);
    }





}
