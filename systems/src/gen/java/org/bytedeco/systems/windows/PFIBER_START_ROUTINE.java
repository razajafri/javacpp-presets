// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



//
// Fiber structures
//

// #if(_WIN32_WINNT >= 0x0400)
@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PFIBER_START_ROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFIBER_START_ROUTINE(Pointer p) { super(p); }
    protected PFIBER_START_ROUTINE() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("LPVOID") Pointer lpFiberParameter
    );
}
