// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// See parse_context.h for explanation
@Namespace("google::protobuf::internal") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParseContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ParseContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParseContext(Pointer p) { super(p); }
}
