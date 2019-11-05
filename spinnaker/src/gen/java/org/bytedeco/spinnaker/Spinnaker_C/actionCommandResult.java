// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* Action Command Result.
*/
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class actionCommandResult extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public actionCommandResult() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public actionCommandResult(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public actionCommandResult(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public actionCommandResult position(long position) {
        return (actionCommandResult)super.position(position);
    }

    /* IP Address of device that responded to Action Command */
    public native @Cast("unsigned int") int DeviceAddress(); public native actionCommandResult DeviceAddress(int setter);

    /* Action Command status return from device */
    public native @Cast("actionCommandStatus") int Status(); public native actionCommandResult Status(int setter);
}
