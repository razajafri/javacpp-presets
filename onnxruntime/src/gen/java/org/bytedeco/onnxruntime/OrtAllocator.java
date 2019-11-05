// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


// When passing in an allocator to any ORT function, be sure that the allocator object
// is not destroyed until the last allocated object using it is freed.
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtAllocator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtAllocator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtAllocator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtAllocator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtAllocator position(long position) {
        return (OrtAllocator)super.position(position);
    }

  public native @Cast("uint32_t") int version(); public native OrtAllocator version(int setter);  // Initialize to ORT_API_VERSION
  public static class Alloc_OrtAllocator_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_OrtAllocator_long(Pointer p) { super(p); }
      protected Alloc_OrtAllocator_long() { allocate(); }
      private native void allocate();
      public native Pointer call(OrtAllocator this_, @Cast("size_t") long size);
  }
  public native Alloc_OrtAllocator_long Alloc(); public native OrtAllocator Alloc(Alloc_OrtAllocator_long setter);
  public static class Free_OrtAllocator_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_OrtAllocator_Pointer(Pointer p) { super(p); }
      protected Free_OrtAllocator_Pointer() { allocate(); }
      private native void allocate();
      public native void call(OrtAllocator this_, Pointer p);
  }
  public native Free_OrtAllocator_Pointer Free(); public native OrtAllocator Free(Free_OrtAllocator_Pointer setter);
  public static class Info_OrtAllocator extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Info_OrtAllocator(Pointer p) { super(p); }
      protected Info_OrtAllocator() { allocate(); }
      private native void allocate();
      public native @Const OrtAllocatorInfo call(@Const OrtAllocator this_);
  }
  public native Info_OrtAllocator Info(); public native OrtAllocator Info(Info_OrtAllocator setter);
}
