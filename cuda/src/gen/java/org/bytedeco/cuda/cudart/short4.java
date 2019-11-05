// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class short4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public short4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public short4 position(long position) {
        return (short4)super.position(position);
    }
 
    public native short x(); public native short4 x(short setter); public native short y(); public native short4 y(short setter); public native short z(); public native short4 z(short setter); public native short w(); public native short4 w(short setter);
}
