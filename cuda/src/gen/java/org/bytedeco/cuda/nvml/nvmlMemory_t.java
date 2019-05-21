// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** 
 * Memory allocation information for a device.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlMemory_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlMemory_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlMemory_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlMemory_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlMemory_t position(long position) {
        return (nvmlMemory_t)super.position(position);
    }

    /** Total installed FB memory (in bytes) */
    public native @Cast("unsigned long long") long total(); public native nvmlMemory_t total(long setter);
    /** Unallocated FB memory (in bytes) */
    public native @Cast("unsigned long long") long free(); public native nvmlMemory_t free(long setter);
    /** Allocated FB memory (in bytes). Note that the driver/GPU always sets aside a small amount of memory for bookkeeping */
    public native @Cast("unsigned long long") long used(); public native nvmlMemory_t used(long setter);
}
