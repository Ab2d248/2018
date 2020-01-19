/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DownCommand;
import frc.robot.commands.InCommand;
import frc.robot.commands.Intake2018Command;
import frc.robot.commands.LiftCommand;
import frc.robot.commands.OutCommand;
import frc.robot.commands.Outake2018Command;

/**
 * Add your docs here.
 */
public class OI {
    public JoystickButton intake2018, outake2018, lift, down;
    public Joystick joy;
    public JoystickButton outakeButton, intakeButton;
    
    public OI(){
        joy = new Joystick(0);
        intake2018 = new JoystickButton(joy, 1);
        outake2018 = new JoystickButton(joy, 2);
        lift = new JoystickButton(joy, 3);
        down = new JoystickButton(joy, 4);
        outakeButton = new JoystickButton(joy, 5);
        intakeButton = new JoystickButton(joy, 6);
        
        intake2018.whenPressed(new Intake2018Command());
        outake2018.whenPressed(new Outake2018Command());
        lift.whenPressed(new LiftCommand());
        down.whenPressed(new DownCommand());
        intakeButton.whenPressed(new InCommand());
        outakeButton.whenPressed(new OutCommand());
    }
    
}
