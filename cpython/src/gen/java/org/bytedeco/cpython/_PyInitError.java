// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyInitError extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyInitError() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyInitError(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyInitError(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyInitError position(long position) {
        return (_PyInitError)super.position(position);
    }

    public native @Cast("const char*") BytePointer prefix(); public native _PyInitError prefix(BytePointer setter);
    public native @Cast("const char*") BytePointer msg(); public native _PyInitError msg(BytePointer setter);
    public native int user_err(); public native _PyInitError user_err(int setter);
}
