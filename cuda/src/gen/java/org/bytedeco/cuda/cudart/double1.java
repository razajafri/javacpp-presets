// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class double1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public double1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public double1 position(long position) {
        return (double1)super.position(position);
    }

    public native double x(); public native double1 x(double setter);
}
