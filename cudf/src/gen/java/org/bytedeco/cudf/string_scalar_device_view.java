// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**
 * \brief A type of scalar_device_view that stores a pointer to a string value
 */
@Namespace("cudf") @NoOffset @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class string_scalar_device_view extends scalar_device_view_base {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public string_scalar_device_view(Pointer p) { super(p); }


  public string_scalar_device_view(@ByVal data_type type, @Cast("const char*") BytePointer data, @Cast("bool*") BoolPointer is_valid,
                              @ByVal size_type size) { super((Pointer)null); allocate(type, data, is_valid, size); }
  private native void allocate(@ByVal data_type type, @Cast("const char*") BytePointer data, @Cast("bool*") BoolPointer is_valid,
                              @ByVal size_type size);
  public string_scalar_device_view(@ByVal data_type type, String data, @Cast("bool*") boolean[] is_valid,
                              @ByVal size_type size) { super((Pointer)null); allocate(type, data, is_valid, size); }
  private native void allocate(@ByVal data_type type, String data, @Cast("bool*") boolean[] is_valid,
                              @ByVal size_type size);

  /**
   * \brief Returns string_view of the value of this scalar.
   */
  public native @ByVal @NoException __device__ value();

  /**
   * \brief Returns a raw pointer to the value in device memory
   */
  public native @Const @NoException __device__ data();
}
