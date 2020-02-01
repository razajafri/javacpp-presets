// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**---------------------------------------------------------------------------*
 * \brief Indicates whether the type {@code T} is a simple type.
 *
 * "Simple" element types are implemented with only a single column, i.e.,
 * {@code num_children() == 0} for columns of "simple" elements
 *
 * \tparam T The type to verify
 * @return true {@code T} corresponds to a simple type
 * @return false {@code T} corresponds to a compound type
 *---------------------------------------------------------------------------**/

@Namespace("cudf") @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class is_simple_impl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public is_simple_impl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public is_simple_impl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public is_simple_impl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public is_simple_impl position(long position) {
        return (is_simple_impl)super.position(position);
    }

}
