// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**
 * \brief Maps an {@code aggregation::Kind} value to it's corresponding binary
 * operator.
 *
 * \note Not all values of {@code aggregation::Kind} have a valid corresponding binary
 * operator. For these values {@code E},
 * {@code std::is_same_v<corresponding_operator<E>::type, void>}.
 *
 * \tparam k The {@code aggregation::Kind} value to map to its corresponding operator
 */

@Name("cudf::experimental::detail::corresponding_operator<aggregation::MIN>") @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class corresponding_operator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public corresponding_operator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public corresponding_operator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public corresponding_operator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public corresponding_operator position(long position) {
        return (corresponding_operator)super.position(position);
    }

}
