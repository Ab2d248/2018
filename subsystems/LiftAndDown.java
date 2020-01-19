/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LiftAndDown extends SubsystemBase {
  public DoubleSolenoid solenoidLeft, solenoidRight;
  
  /**
   * Creates a new Lift.
   */
  public LiftAndDown() {
    solenoidRight = new DoubleSolenoid(0, 5, 2);
    solenoidLeft = new DoubleSolenoid(0, 0, 7);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void down(){
    solenoidRight.set(Value.kForward);
    solenoidLeft.set(Value.kForward);
  }

  public void lift(){
    solenoidRight.set(Value.kReverse);
    solenoidLeft.set(Value.kReverse);
  }

  public void stop(){
    solenoidRight.set(Value.kOff);
    solenoidLeft.set(Value.kOff);
    
  }
}
