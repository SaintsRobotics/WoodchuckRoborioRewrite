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
    
	private Motor leftMotor = new Motor(
    	new Jaguar(RobotMap.MOTOR_LEFT),
    	RobotMap.MOTOR_LEFT_INVERTED);
    private Motor rightMotor = new Motor(
    	new Jaguar(RobotMap.MOTOR_RIGHT),
    	RobotMap.MOTOR_RIGHT_INVERTED);
    
	
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveCommand());
    }
    
    public void drive(double left, double right){
    	leftMotor.set(left);
    	rightMotor.set(right);
    }
}
