// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Free space section information */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5F_sect_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5F_sect_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5F_sect_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5F_sect_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5F_sect_info_t position(long position) {
        return (H5F_sect_info_t)super.position(position);
    }

    public native @Cast("haddr_t") long addr(); public native H5F_sect_info_t addr(long setter);   /* Address of free space section */
    public native @Cast("hsize_t") long size(); public native H5F_sect_info_t size(long setter);   /* Size of free space section */
}
