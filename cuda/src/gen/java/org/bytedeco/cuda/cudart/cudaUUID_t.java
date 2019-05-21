// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaUUID_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaUUID_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaUUID_t(Pointer p) { super(p); }
}
