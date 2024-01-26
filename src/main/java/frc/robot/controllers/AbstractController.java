package frc.robot.controllers;


/**
 * An abstract class for the joystick wrappers. Contains the common methods that we wrap around.
 */
public abstract class AbstractController {
    public abstract double getRightHorizontalMovement();
    
    public abstract double getRightVerticalMovement();

    public abstract double getLeftHorizontalMovement();
    
    public abstract double getLeftVerticalMovement();

    public abstract boolean getRawButtonWrapper(int button);

    public abstract boolean getRawButtonReleasedWrapper(int button);

}