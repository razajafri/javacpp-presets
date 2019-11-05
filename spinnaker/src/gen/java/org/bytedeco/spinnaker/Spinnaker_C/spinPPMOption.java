// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* Options for saving PPM images. Used in saving PPM images
* with a call to spinImageSavePpm().
*/
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinPPMOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinPPMOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinPPMOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinPPMOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinPPMOption position(long position) {
        return (spinPPMOption)super.position(position);
    }

    /** Whether to save the PPM as a binary file. */
    public native @Cast("bool8_t") byte binaryFile(); public native spinPPMOption binaryFile(byte setter);
    /** Reserved for future use. */
    public native @Cast("unsigned int") int reserved(int i); public native spinPPMOption reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /*
    _spinPPMOption()
    {
        binaryFile = true;
        memset(reserved, 0, sizeof(reserved));
    }*/
}
