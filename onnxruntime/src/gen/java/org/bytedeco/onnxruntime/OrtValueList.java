// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Opaque @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtValueList extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OrtValueList() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtValueList(Pointer p) { super(p); }
}
