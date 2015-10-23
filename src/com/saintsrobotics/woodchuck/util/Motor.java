package com.saintsrobotics.woodchuck.util;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Jaguar;

/**
 * A class representing a Talon motor controller.
 * Controls ramping and motor inversion as well,
 * making it easy to change such behavior.
 */
public class Motor {
    public enum MotorType{
        JAGUAR, TALON
    }
    private final SpeedController motor;
    private final Ramp ramp;
    private final boolean inverted;
    
    /**
     * Constructs a TalonMotor on a pin.
     * 
     * @param motorPin The PWM pin the motor is attached to.
     * @param inv Whether or not the motor is inverted.
     */
    public TalonMotor(SpeedController sc, boolean inv, double rampage) {
        motor = sc;
        ramp = new Ramp(rampage);
        inverted = inv;
    }
    public TalonMotor(SpeedController sc, boolean inv) {
        this(sc,inv,0.2);
    }
    public TalonMotor(MotorType type, int pin, boolean inv, double rampage){
        SpeedController sc;
        switch(type){
            JAGUAR:
                sc = new Jaguar(pin);
                break;
            TALON:
                sc = new Talon(pin);
                break;
            default:
                System.out.println("Okay how even. How");
                break;
        }
        this(sc, inv, rampage);
    }
    public TalonMotor(MotorType type, int pin, boolean inv){
        this(type, pin, inv);
    }
    
    /**
     * Set a target value for this motor. This
     * value will be ramped.
     * 
     * @param val The target value, between -1.0 and 1.0 for
     *            full reverse and full forward respectively.
     */
    public void set(double val) {
        val = inverted ? -val : val;
        val = ramp.rampValues(val);
        motor.set(val);
    }
    
    /**
     * Stops the motor, without getting interrupted by ramping.
     */
    public void stop() {
        motor.stopMotor();
    }
}
