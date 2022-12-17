package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ShooterCommand;

public class Shooter extends SubsystemBase{
    private final WPI_TalonFX topMotor;
    private final WPI_TalonFX bottomMotor;

    public Shooter(){
        topMotor = new WPI_TalonFX(5);
        bottomMotor = new WPI_TalonFX(6);
        setDefaultCommand(new ShooterCommand(this));
    }

    public void set(double top, double bottom){
        topMotor.set(ControlMode.PercentOutput, top);
        bottomMotor.set(ControlMode.PercentOutput, bottom);
    }
}
