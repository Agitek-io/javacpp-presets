// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


@Opaque @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class System extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public System() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public System(Pointer p) { super(p); }
}
