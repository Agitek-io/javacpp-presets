// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


/**
  A controller is a device that plugs into either the left or right 
  controller jack of the Video Computer System (VCS).  The pins of 
  the controller jacks are mapped as follows:
                           <p>
                           -------------
                           \ 1 2 3 4 5 /
                            \ 6 7 8 9 /
                             ---------
            <p>
            Left Controller             Right Controller
    <p>
    pin 1   D4  PIA SWCHA               D0  PIA SWCHA
    pin 2   D5  PIA SWCHA               D1  PIA SWCHA
    pin 3   D6  PIA SWCHA               D2  PIA SWCHA
    pin 4   D7  PIA SWCHA               D3  PIA SWCHA
    pin 5   D7  TIA INPT1 (Dumped)      D7  TIA INPT3 (Dumped)
    pin 6   D7  TIA INPT4 (Latched)     D7  TIA INPT5 (Latched)
    pin 7   +5                          +5
    pin 8   GND                         GND
    pin 9   D7  TIA INPT0 (Dumped)      D7  TIA INPT2 (Dumped)
  <p>
  Each of the pins connected to the PIA can be configured as an
  input or output pin.  The "dumped" TIA pins are used to charge
  a capacitor.  A potentiometer is sometimes connected to these
  pins for analog input.
  <p>
  This is a base class for all controllers.  It provides a view
  of the controller from the perspective of the controller's jack.
  <p>
  @author  Bradford W. Mott
  @version $Id: Control.hxx,v 1.9 2007/02/22 02:15:46 stephena Exp $
*/
@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Controller extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Controller(Pointer p) { super(p); }

    /**
      Enumeration of the controller jacks
    */
    /** enum Controller::Jack */
    public static final int
      Left = 0, Right = 1;

    /**
      Enumeration of the controller types
    */
    /** enum Controller::Type */
    public static final int
      BoosterGrip = 0, Driving = 1, Keyboard = 2, Paddles = 3, Joystick = 4,
      TrakBall = 5, AtariVox = 6;
    /**
      Create a new controller plugged into the specified jack
      <p>
      @param jack  The jack the controller is plugged into
      @param event The event object to use for events
      @param type  The type for this controller
    */

    /**
      Destructor
    */

    /**
      Returns the type of this controller.
    */
    public native @Cast("Controller::Type") int type();

    /**
      Inform this controller about the current System.
    */
    public native void setSystem(System system);
    /**
      Enumeration of the digital pins of a controller port
    */
    /** enum Controller::DigitalPin */
    public static final int
      One = 0, Two = 1, Three = 2, Four = 3, Six = 4;

    /**
      Enumeration of the analog pins of a controller port
    */
    /** enum Controller::AnalogPin */
    public static final int
      Five = 0, Nine = 1;
    /**
      Read the value of the specified digital pin for this controller.
      <p>
      @param pin The pin of the controller jack to read
      @return The state of the pin
    */
    public native @Cast("bool") boolean read(@Cast("Controller::DigitalPin") int pin);

    /**
      Read the resistance at the specified analog pin for this controller.  
      The returned value is the resistance measured in ohms.
      <p>
      @param pin The pin of the controller jack to read
      @return The resistance at the specified pin
    */

    /**
      Write the given value to the specified digital pin for this 
      controller.  Writing is only allowed to the pins associated 
      with the PIA.  Therefore you cannot write to pin six.
      <p>
      @param pin The pin of the controller jack to write to
      @param value The value to write to the pin
    */
    public native void write(@Cast("Controller::DigitalPin") int pin, @Cast("bool") boolean value);
    /** Constant which represents maximum resistance for analog pins */
    @MemberGetter public static native @Cast("const Int32") int maximumResistance();
    public static final int maximumResistance = maximumResistance();

    /** Constant which represents minimum resistance for analog pins */
    @MemberGetter public static native @Cast("const Int32") int minimumResistance();
    public static final int minimumResistance = minimumResistance();
}
