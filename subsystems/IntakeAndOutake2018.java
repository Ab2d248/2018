/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeAndOutake2018 extends SubsystemBase {
  public TalonSRX talonRight, talonLeft;
  public TalonSRX innerRight, innerLeft;
  /**
   * Creates a new Intake2018.
   */
  public IntakeAndOutake2018() {
    talonRight = new TalonSRX(6);
    talonLeft = new TalonSRX(11);
    innerRight = new TalonSRX(61);
    innerLeft = new TalonSRX(4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake(){
    talonRight.set(ControlMode.PercentOutput, 1);
    talonLeft.set(ControlMode.PercentOutput, -1);
    innerRight.set(ControlMode.PercentOutput, 1);
    innerLeft.set(ControlMode.PercentOutput, -1);

  }

  public void outake(){
    talonRight.set(ControlMode.PercentOutput, -1);
    talonLeft.set(ControlMode.PercentOutput, 1);
    innerRight.set(ControlMode.PercentOutput, -1);
    innerLeft.set(ControlMode.PercentOutput, 1);


  }

  public void stop(){
    talonRight.set(ControlMode.PercentOutput, 0);
    talonLeft.set(ControlMode.PercentOutput, 0);
    innerRight.set(ControlMode.PercentOutput, 0);
    innerLeft.set(ControlMode.PercentOutput, 0);

  }
}
