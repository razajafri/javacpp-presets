// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulonglong3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulonglong3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulonglong3 position(long position) {
        return (ulonglong3)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong3 x(long setter);
    public native @Cast("unsigned long long int") long y(); public native ulonglong3 y(long setter);
    public native @Cast("unsigned long long int") long z(); public native ulonglong3 z(long setter);
}
