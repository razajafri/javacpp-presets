// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


// #endif /* _WIN32 */

@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class long3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public long3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public long3 position(long position) {
        return (long3)super.position(position);
    }

    public native long x(); public native long3 x(long setter);
    public native long y(); public native long3 y(long setter);
    public native long z(); public native long3 z(long setter);
}
