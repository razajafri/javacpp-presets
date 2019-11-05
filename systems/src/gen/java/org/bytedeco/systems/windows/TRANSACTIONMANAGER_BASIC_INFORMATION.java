// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTIONMANAGER_BASIC_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTIONMANAGER_BASIC_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTIONMANAGER_BASIC_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTIONMANAGER_BASIC_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTIONMANAGER_BASIC_INFORMATION position(long position) {
        return (TRANSACTIONMANAGER_BASIC_INFORMATION)super.position(position);
    }

    public native @ByRef GUID TmIdentity(); public native TRANSACTIONMANAGER_BASIC_INFORMATION TmIdentity(GUID setter);
    public native @ByRef LARGE_INTEGER VirtualClock(); public native TRANSACTIONMANAGER_BASIC_INFORMATION VirtualClock(LARGE_INTEGER setter);
}
