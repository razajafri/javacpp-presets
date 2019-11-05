// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;

// #endif

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnContext(Pointer p) { super(p); }
}
