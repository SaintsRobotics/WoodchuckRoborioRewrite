package com.saintsrobotics.woodchuck.commands.drive;

import edu.wpi.first.wpilibj.command.Command;
import com.saintsrobotics.woodchuck.commands.CommandBase;
import com.saintsrobotics.woodchuck.subsystems.DriveSubsystem;

/**
 * This class overrides the default abstract methods
 * from Command. For readability and code simplicity.
 */
public class ArcadeDriveCommand extends CommandBase {
	
	public ArcadeDriveCommand(){
		require(drive);
	}
	                              
    protected void execute() {
        double y = OI.getAxisValue(
        		OI.stick,
        		OI.Axis.LY);
        double x = OI.getAxisValue(
        		OI.stick,
        		OI.Axis.RX);
    	drive.drive(
    		y+x,
    		y-x
        );
    }
}