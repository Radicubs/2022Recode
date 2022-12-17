package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.TankDrive;

public class MeccanumDriveBase extends SubsystemBase{
    private final WPI_TalonFX front_left;
    private final WPI_TalonFX front_right;
    private final WPI_TalonFX back_left;
    private final WPI_TalonFX back_right;

    public MeccanumDriveBase(){
        front_left = new WPI_TalonFX(1);
        front_right = new WPI_TalonFX(2);
        back_left = new WPI_TalonFX(3);
        back_right = new WPI_TalonFX(4);
        setDefaultCommand(new TankDrive(this));
        
    }

    public void setPercent(double fl, double fr, double bl, double br){
        front_left.set(ControlMode.PercentOutput, fl);
        front_right.set(ControlMode.PercentOutput, fr);
        back_left.set(ControlMode.PercentOutput, bl);
        back_right.set(ControlMode.PercentOutput, br);
    }
}
