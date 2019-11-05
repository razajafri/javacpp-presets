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



@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyHalfScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyHalfScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyHalfScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyHalfScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyHalfScalarObject position(long position) {
        return (PyHalfScalarObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyHalfScalarObject ob_base(PyObject setter);
        public native @Cast("npy_half") short obval(); public native PyHalfScalarObject obval(short setter);
}
