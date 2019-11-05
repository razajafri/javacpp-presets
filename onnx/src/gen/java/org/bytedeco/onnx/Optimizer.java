// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::optimization") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Optimizer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Optimizer(Pointer p) { super(p); }

  public static native @ByRef GlobalPassRegistry passes(); public static native void passes(GlobalPassRegistry setter);
  public Optimizer(@Const @ByRef StringVector names, @Cast("const bool") boolean fixed_point) { super((Pointer)null); allocate(names, fixed_point); }
  private native void allocate(@Const @ByRef StringVector names, @Cast("const bool") boolean fixed_point);

  public native @ByVal ModelProto optimize(@Const @ByRef ModelProto mp_in);
}
