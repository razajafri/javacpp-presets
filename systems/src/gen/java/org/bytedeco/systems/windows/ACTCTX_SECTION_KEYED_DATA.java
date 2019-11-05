// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTCTX_SECTION_KEYED_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTCTX_SECTION_KEYED_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTCTX_SECTION_KEYED_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTCTX_SECTION_KEYED_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTCTX_SECTION_KEYED_DATA position(long position) {
        return (ACTCTX_SECTION_KEYED_DATA)super.position(position);
    }

    public native @Cast("ULONG") long cbSize(); public native ACTCTX_SECTION_KEYED_DATA cbSize(long setter);
    public native @Cast("ULONG") long ulDataFormatVersion(); public native ACTCTX_SECTION_KEYED_DATA ulDataFormatVersion(long setter);
    public native @Cast("PVOID") Pointer lpData(); public native ACTCTX_SECTION_KEYED_DATA lpData(Pointer setter);
    public native @Cast("ULONG") long ulLength(); public native ACTCTX_SECTION_KEYED_DATA ulLength(long setter);
    public native @Cast("PVOID") Pointer lpSectionGlobalData(); public native ACTCTX_SECTION_KEYED_DATA lpSectionGlobalData(Pointer setter);
    public native @Cast("ULONG") long ulSectionGlobalDataLength(); public native ACTCTX_SECTION_KEYED_DATA ulSectionGlobalDataLength(long setter);
    public native @Cast("PVOID") Pointer lpSectionBase(); public native ACTCTX_SECTION_KEYED_DATA lpSectionBase(Pointer setter);
    public native @Cast("ULONG") long ulSectionTotalLength(); public native ACTCTX_SECTION_KEYED_DATA ulSectionTotalLength(long setter);
    public native @Cast("HANDLE") Pointer hActCtx(); public native ACTCTX_SECTION_KEYED_DATA hActCtx(Pointer setter);
    public native @Cast("ULONG") long ulAssemblyRosterIndex(); public native ACTCTX_SECTION_KEYED_DATA ulAssemblyRosterIndex(long setter);
// 2600 stops here
    public native @Cast("ULONG") long ulFlags(); public native ACTCTX_SECTION_KEYED_DATA ulFlags(long setter);
    public native @ByRef ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA AssemblyMetadata(); public native ACTCTX_SECTION_KEYED_DATA AssemblyMetadata(ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA setter);
}
