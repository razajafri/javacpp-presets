// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**---------------------------------------------------------------------------*
 * \brief Indicator for the logical data type of an element in a column.
 *
 * Simple types can be be entirely described by their {@code id()}, but some types
 * require additional metadata to fully describe elements of that type.
 *---------------------------------------------------------------------------**/
@Namespace("cudf") @NoOffset @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class data_type extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public data_type(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public data_type(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public data_type position(long position) {
        return (data_type)super.position(position);
    }

  public data_type() { super((Pointer)null); allocate(); }
  private native void allocate();
  public data_type(@Const @ByRef data_type arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef data_type arg0);
  public native @ByRef @Name("operator =") data_type put(@Const @ByRef data_type arg0);

  /**---------------------------------------------------------------------------*
   * \brief Construct a new {@code data_type} object
   *
   * @param id The type's identifier
   *---------------------------------------------------------------------------**/
  public data_type(type_id id) { super((Pointer)null); allocate(id); }
  private native void allocate(type_id id);
  public data_type(@Cast("cudf::type_id") int id) { super((Pointer)null); allocate(id); }
  private native void allocate(@Cast("cudf::type_id") int id);

  /**---------------------------------------------------------------------------*
   * \brief Returns the type identifier
   *---------------------------------------------------------------------------**/
  public native @NoException type_id id();
}