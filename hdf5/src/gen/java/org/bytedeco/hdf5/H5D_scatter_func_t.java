// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Define the operator function pointer for H5Dscatter() */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_scatter_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_scatter_func_t(Pointer p) { super(p); }
    protected H5D_scatter_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("const void**") @ByPtrPtr Pointer src_buf,
                                     @Cast("size_t*") SizeTPointer src_buf_bytes_used,
                                     Pointer op_data);
}
