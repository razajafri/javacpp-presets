// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA IPC event handle
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUipcEventHandle extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUipcEventHandle() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUipcEventHandle(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUipcEventHandle(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUipcEventHandle position(long position) {
        return (CUipcEventHandle)super.position(position);
    }

    public native @Cast("char") byte reserved(int i); public native CUipcEventHandle reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
