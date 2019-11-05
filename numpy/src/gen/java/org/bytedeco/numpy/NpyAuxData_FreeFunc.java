// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/* Function pointers for freeing or cloning auxiliary data */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class NpyAuxData_FreeFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    NpyAuxData_FreeFunc(Pointer p) { super(p); }
    protected NpyAuxData_FreeFunc() { allocate(); }
    private native void allocate();
    public native void call(NpyAuxData arg0);
}
