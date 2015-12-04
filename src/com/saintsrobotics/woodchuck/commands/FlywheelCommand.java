package com.saintsrobotics.woodchuck.commands.drive;

import edu.wpi.first.wpilibj.command.Command;
import com.saintsrobotics.woodchuck.commands.CommandBase;
import com.saintsrobotics.woodchuck.subsystems.DriveSubsystem;

/**
 * This class overrides the default abstract methods
 * from Command. For readability and code simplicity.
 */
public class FlywheelCommand extends CommandBase {
	
	public FlywheelCommand(){
		require(flywheel);
	}
	
    protected void execute() {
    	flywheel.changeFlywheel(OI.getAxisValue(
    								OI.stick,
    								OI.Axis.TRIGGERS)
    	);
    }
}