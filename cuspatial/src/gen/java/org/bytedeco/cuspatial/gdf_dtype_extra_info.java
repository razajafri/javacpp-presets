// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuspatial;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuspatial.global.cuspatial.*;


/**
 * \brief Extra information about column type.
 */
@Properties(inherit = org.bytedeco.cuspatial.presets.cuspatial.class)
public class gdf_dtype_extra_info extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gdf_dtype_extra_info() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gdf_dtype_extra_info(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gdf_dtype_extra_info(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gdf_dtype_extra_info position(long position) {
        return (gdf_dtype_extra_info)super.position(position);
    }

  //here we can also hold info for decimal datatype or any other datatype that requires additional information
  /** Time Unit resolution */
  public native @Cast("gdf_time_unit") int time_unit(); public native gdf_dtype_extra_info time_unit(int setter);
  /** Categories related to the GDF_STRING_CATEGORY datatype */
  public native Pointer category(); public native gdf_dtype_extra_info category(Pointer setter);
}
