// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("google::protobuf") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FieldDescriptorProto extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public FieldDescriptorProto() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldDescriptorProto(Pointer p) { super(p); }
}
