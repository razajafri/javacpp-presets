// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


@Opaque @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class DLManagedTensor extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public DLManagedTensor() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLManagedTensor(Pointer p) { super(p); }
}
