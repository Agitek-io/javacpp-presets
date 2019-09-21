// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;


/** Opaque reference to an LTO input file */
@Name("LLVMOpaqueLTOInput") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class lto_input_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public lto_input_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lto_input_t(Pointer p) { super(p); }
}
