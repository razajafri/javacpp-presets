// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTIVATION_CONTEXT_QUERY_INDEX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTIVATION_CONTEXT_QUERY_INDEX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTIVATION_CONTEXT_QUERY_INDEX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTIVATION_CONTEXT_QUERY_INDEX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTIVATION_CONTEXT_QUERY_INDEX position(long position) {
        return (ACTIVATION_CONTEXT_QUERY_INDEX)super.position(position);
    }

    public native @Cast("DWORD") int ulAssemblyIndex(); public native ACTIVATION_CONTEXT_QUERY_INDEX ulAssemblyIndex(int setter);
    public native @Cast("DWORD") int ulFileIndexInAssembly(); public native ACTIVATION_CONTEXT_QUERY_INDEX ulFileIndexInAssembly(int setter);
}
