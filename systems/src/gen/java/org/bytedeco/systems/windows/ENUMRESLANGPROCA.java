// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #ifdef STRICT

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENUMRESLANGPROCA extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ENUMRESLANGPROCA(Pointer p) { super(p); }
    protected ENUMRESLANGPROCA() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("HMODULE") Pointer hModule,
    @Cast("LPCSTR") BytePointer lpType,
    @Cast("LPCSTR") BytePointer lpName,
    @Cast("WORD") short wLanguage,
    @Cast("LONG_PTR") long lParam);
}
