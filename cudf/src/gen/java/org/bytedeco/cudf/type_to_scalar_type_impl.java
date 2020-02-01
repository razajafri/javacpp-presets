// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;

// #endif

@Name("cudf::experimental::type_to_scalar_type_impl<int8_t>") @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class type_to_scalar_type_impl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public type_to_scalar_type_impl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public type_to_scalar_type_impl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public type_to_scalar_type_impl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public type_to_scalar_type_impl position(long position) {
        return (type_to_scalar_type_impl)super.position(position);
    }

}
