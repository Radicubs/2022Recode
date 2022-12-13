package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase {

    private final WPi_TalonFX topMotor;
    private final WPi_TalonFX bottomMotor;

    public Shooter() {
        topMotor = new WPi_TalonFX(0);
        bottomMotor = new WPi_TalonFX(0);
        setDefaultCommand(new ShooterCommand(this));
    }

    public void set(double top, double bottom) {
        topMotor.set(ControlMode.PercentOutput, top);
        bottomMotor.set(ControlMode.PercentOutput, bottom);
    }

}
