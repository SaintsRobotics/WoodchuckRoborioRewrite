package com.saintsrobotics.woodchuck.subsystems;

import com.saintsrobotics.woodchuck.RobotMap;
import com.saintsrobotics.woodchuck.util.Motor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Jaguar;
/**
 * Handles the firing arm.
 */
public class ShooterSubsystem extends Subsystem {
    DigitalInput firingSwitch = new DigitalInput(RobotMap.FIRING_ARM_SWITCH_CHANNEL);
    Relay firingArm = new Relay(
    	RobotMap.FEEDER_RELAY,
    	RobotMap.FEEDER_DIRECTION);
    
    public void enableArm(){
    	firingArm.set(Relay.Value.kOn);
    }
    public void disableArm(){
    	firingArm.set(Relay.Value.kOff);
    }
    public boolean getSwitch(){
    	return firingSwitch.get();
    }
}
