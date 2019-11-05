// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyArg_Parser extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyArg_Parser() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyArg_Parser(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyArg_Parser(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyArg_Parser position(long position) {
        return (_PyArg_Parser)super.position(position);
    }

    public native @Cast("const char*") BytePointer format(); public native _PyArg_Parser format(BytePointer setter);
    @MemberGetter public native @Cast("const char*") BytePointer keywords(int i);
    @MemberGetter public native @Cast("const char*const*") PointerPointer keywords();
    public native @Cast("const char*") BytePointer fname(); public native _PyArg_Parser fname(BytePointer setter);
    public native @Cast("const char*") BytePointer custom_msg(); public native _PyArg_Parser custom_msg(BytePointer setter);
    public native int pos(); public native _PyArg_Parser pos(int setter);            /* number of positional-only arguments */
    public native int min(); public native _PyArg_Parser min(int setter);            /* minimal number of arguments */
    public native int max(); public native _PyArg_Parser max(int setter);            /* maximal number of positional arguments */
    public native PyObject kwtuple(); public native _PyArg_Parser kwtuple(PyObject setter);  /* tuple of keyword parameter names */
    public native _PyArg_Parser next(); public native _PyArg_Parser next(_PyArg_Parser setter);
}
