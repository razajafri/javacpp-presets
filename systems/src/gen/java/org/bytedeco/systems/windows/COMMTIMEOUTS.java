// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class COMMTIMEOUTS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public COMMTIMEOUTS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public COMMTIMEOUTS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public COMMTIMEOUTS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public COMMTIMEOUTS position(long position) {
        return (COMMTIMEOUTS)super.position(position);
    }

    public native @Cast("DWORD") int ReadIntervalTimeout(); public native COMMTIMEOUTS ReadIntervalTimeout(int setter);          /* Maximum time between read chars. */
    public native @Cast("DWORD") int ReadTotalTimeoutMultiplier(); public native COMMTIMEOUTS ReadTotalTimeoutMultiplier(int setter);   /* Multiplier of characters.        */
    public native @Cast("DWORD") int ReadTotalTimeoutConstant(); public native COMMTIMEOUTS ReadTotalTimeoutConstant(int setter);     /* Constant in milliseconds.        */
    public native @Cast("DWORD") int WriteTotalTimeoutMultiplier(); public native COMMTIMEOUTS WriteTotalTimeoutMultiplier(int setter);  /* Multiplier of characters.        */
    public native @Cast("DWORD") int WriteTotalTimeoutConstant(); public native COMMTIMEOUTS WriteTotalTimeoutConstant(int setter);    /* Constant in milliseconds.        */
}
