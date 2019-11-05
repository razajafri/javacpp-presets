// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class int1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public int1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public int1 position(long position) {
        return (int1)super.position(position);
    }

    public native int x(); public native int1 x(int setter);
}
