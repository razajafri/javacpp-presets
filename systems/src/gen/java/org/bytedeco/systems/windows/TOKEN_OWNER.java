// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_OWNER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_OWNER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_OWNER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_OWNER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_OWNER position(long position) {
        return (TOKEN_OWNER)super.position(position);
    }

    public native @Cast("PSID") Pointer Owner(); public native TOKEN_OWNER Owner(Pointer setter);
}
