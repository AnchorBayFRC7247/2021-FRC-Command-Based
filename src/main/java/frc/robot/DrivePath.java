// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.AutonomousDistance;
import frc.robot.commands.AutonomousTime;
import frc.robot.subsystems.Drivetrain;
import frc.robot.Constants;
import frc.robot.commands.TurnDegrees;
import frc.robot.commands.DriveDistance;


import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DrivePath extends SequentialCommandGroup {
  /** Creates a new DrivePath. */
  public DrivePath(Drivetrain drive) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_ONE, drive),
      new TurnDegrees(Constants.TURN_SPEED_ONE, (Constants.TURN_DEGREES + 50), drive),
      new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_TWO, drive),
      new TurnDegrees(Constants.TURN_SPEED_TWO, (Constants.TURN_DEGREES + 55), drive),
      new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_THREE, drive),
      new TurnDegrees(Constants.TURN_SPEED_TWO, (Constants.TURN_DEGREES + 55), drive),
      new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_FOUR, drive),
      new TurnDegrees(Constants.TURN_SPEED_ONE, (Constants.TURN_DEGREES + 52), drive),
      new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_FIVE, drive)
      //new TurnDegrees(Constants.TURN_SPEED_ONE, Constants.TURN_DEGREES, drive),
      //new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_SIX, drive),
      //new TurnDegrees(Constants.TURN_SPEED_ONE, Constants.TURN_DEGREES, drive),
      //new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_SEVEN, drive),
      //new TurnDegrees(Constants.TURN_SPEED_ONE, Constants.TURN_DEGREES, drive),
      //new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_EIGHT, drive),
      //new TurnDegrees(Constants.TURN_SPEED_TWO, Constants.TURN_DEGREES, drive),
      //new DriveDistance(Constants.DRIVE_SPEED, Constants.DRIVE_DISTANCE_NINE, drive)      

    );
  }
}
