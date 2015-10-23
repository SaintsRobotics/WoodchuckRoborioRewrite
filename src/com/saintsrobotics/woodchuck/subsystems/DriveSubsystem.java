package com.saintsrobotics.woodchuck.subsystems;

import com.saintsrobotics.woodchuck.RobotMap;
import com.saintsrobotics.woodchuck.util.Motor;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Jaguar;
/**
 * Handles the drivetrain of the robot.
 */
public class DriveSubsystem extends Subsystem {
    
    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveCommand());
    }
    
}
