package com.saintsrobotics.treecycle.commands;

import com.saintsrobotics.treecycle.OI.Axis;
import com.saintsrobotics.treecycle.OI.Button;
import com.saintsrobotics.treecycle.OI.Stick;
import com.saintsrobotics.treecycle.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Controls the winch during teleop.
 * 
 * One Xbox 360 Controller.
 * 
 * Left Vertical Axis: Winch control.
 * RB: Turbo mode (increased speed).
 */
public class WinchCommand extends Command {

    public WinchCommand() {
        requires(Robot.winch);
    }

    @Override
    protected void initialize() {

    }

    protected void execute() {
        double scale = Robot.oi.getButton(Stick.OPERATOR, Button.RB)? 1 : 0.6;
        if (Robot.oi.getButton(Stick.OPERATOR, Button.A))
            Robot.winch.reset();
        if (Robot.oi.getButton(Stick.OPERATOR, Button.B))
            Robot.winch.lift(Robot.oi.getAxisValue(Stick.OPERATOR, Axis.LY)*scale);
        else
            Robot.winch.liftEncoder(Robot.oi.getAxisValue(Stick.OPERATOR, Axis.LY)*scale);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {

    }
}
