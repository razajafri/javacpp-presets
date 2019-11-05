// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class NOTIFY_USER_POWER_SETTING extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NOTIFY_USER_POWER_SETTING() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NOTIFY_USER_POWER_SETTING(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NOTIFY_USER_POWER_SETTING(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NOTIFY_USER_POWER_SETTING position(long position) {
        return (NOTIFY_USER_POWER_SETTING)super.position(position);
    }

    public native @ByRef GUID Guid(); public native NOTIFY_USER_POWER_SETTING Guid(GUID setter);
}
