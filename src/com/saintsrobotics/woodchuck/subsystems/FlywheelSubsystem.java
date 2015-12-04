package com.saintsrobotics.woodchuck.subsystems;

import com.saintsrobotics.woodchuck.RobotMap;
import com.saintsrobotics.woodchuck.util.Motor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Jaguar;
/**
 * Handles the firing flywheel.
 */
public class ShooterSubsystem extends Subsystem {
	Motor flywheel = new Motor(
    	new Jaguar(RobotMap.FLYWHEEL),
    	RobotMap.FLYWHEEL_INVERTED,
    	0);

    public void changeFlywheel(double amount){
    	double target = flywheel.get()+amount;
    	if(target < 0) target = 0;
    	flywheel.set(target);
    }
}