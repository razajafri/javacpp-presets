// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTCTXW extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTCTXW() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTCTXW(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTCTXW(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTCTXW position(long position) {
        return (ACTCTXW)super.position(position);
    }

    public native @Cast("ULONG") long cbSize(); public native ACTCTXW cbSize(long setter);
    public native @Cast("DWORD") int dwFlags(); public native ACTCTXW dwFlags(int setter);
    public native @Cast("LPCWSTR") CharPointer lpSource(); public native ACTCTXW lpSource(CharPointer setter);
    public native @Cast("USHORT") short wProcessorArchitecture(); public native ACTCTXW wProcessorArchitecture(short setter);
    public native @Cast("LANGID") short wLangId(); public native ACTCTXW wLangId(short setter);
    public native @Cast("LPCWSTR") CharPointer lpAssemblyDirectory(); public native ACTCTXW lpAssemblyDirectory(CharPointer setter);
    public native @Cast("LPCWSTR") CharPointer lpResourceName(); public native ACTCTXW lpResourceName(CharPointer setter);
    public native @Cast("LPCWSTR") CharPointer lpApplicationName(); public native ACTCTXW lpApplicationName(CharPointer setter);
    public native @Cast("HMODULE") Pointer hModule(); public native ACTCTXW hModule(Pointer setter);
}
