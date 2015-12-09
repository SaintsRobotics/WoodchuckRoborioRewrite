package com.saintsrobotics.woodchuck;

import edu.wpi.first.wpilibj.Relay;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    private static final int MOTOR_LEFT = 3;
    private static final int MOTOR_RIGHT = 2;
    
    private static final boolean MOTOR_LEFT_INVERTED = true;
    private static final boolean MOTOR_RIGHT_INVERTED = false;

    private static final int FLYWHEEL_1 = 5;
    private static final int FLYWHEEL_2 = 6;
    private static final boolean FLYWHEEL_INVERTED = false;
    
    private final int FEEDER_RELAY = 1;
    private final Relay.Direction FEEDER_DIRECTION = Relay.Direction.kForward;
    
    private final int FIRING_ARM_SWITCH_SIDECAR_SLOT = 1; //Appears to be deprecated. 
    private final int FIRING_ARM_SWITCH_CHANNEL = 1;
    
}
