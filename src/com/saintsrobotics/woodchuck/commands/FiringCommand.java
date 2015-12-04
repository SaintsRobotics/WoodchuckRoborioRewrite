package com.saintsrobotics.woodchuck.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This class overrides the default abstract methods
 * from Command. For readability and code simplicity.
 */
public class FiringCommand extends CommandBase {
	
	private boolean lastSwitch = true;
	public FiringCommand(){
		requires(firing);
	}
    protected void initialize() {
    	firing.enableArm();
    }
    protected boolean isFinished() {
    	boolean lastlastSwitch = lastSwitch;
    	lastSwitch = firing.getSwitch();
    	return lastlastSwitch==false&&lastSwitch==true; 
    }
    protected void end() { 
    	firing.disableArm();
    }
}