// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif

// #if __CUDA_API_VERSION >= 10000

/**
 * CUDA host function
 * @param userData Argument value passed to the function
 */
@Convention("CUDA_CB") @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUhostFn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CUhostFn(Pointer p) { super(p); }
    protected CUhostFn() { allocate(); }
    private native void allocate();
    public native void call(Pointer userData);
}
