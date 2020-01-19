/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class InAndOut extends SubsystemBase {
  public DoubleSolenoid doubleIn, doubleOut;
  /**
   * Creates a new InAndOut.
   */
  public InAndOut() {
    doubleIn = new DoubleSolenoid(0, 1, 6);
    doubleOut = new DoubleSolenoid(0, 1, 6);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void out(){
    doubleIn.set(Value.kForward);
    doubleOut.set(Value.kForward);
  }

  public void in(){
    doubleIn.set(Value.kReverse);
    doubleOut.set(Value.kReverse);
  }

  public void stop(){
    doubleIn.set(Value.kOff);
    doubleIn.set(Value.kOff);
  }
}
