// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



// #if !defined(IS_VALIDATION_ENABLED)

// #if (NTDDI_VERSION >= NTDDI_WIN8)

// #endif // (NTDDI_VERSION >= NTDDI_WIN8)

// #endif // !defined(IS_VALIDATION_ENABLED)

// #if (NTDDI_VERSION >= NTDDI_WIN8)

// #endif // (NTDDI_VERSION >= NTDDI_WIN8)


// #if (NTDDI_VERSION >= NTDDI_WIN8)

// #endif // (NTDDI_VERSION >= NTDDI_WIN8)


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RTL_CRITICAL_SECTION_DEBUG extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RTL_CRITICAL_SECTION_DEBUG() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RTL_CRITICAL_SECTION_DEBUG(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RTL_CRITICAL_SECTION_DEBUG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RTL_CRITICAL_SECTION_DEBUG position(long position) {
        return (RTL_CRITICAL_SECTION_DEBUG)super.position(position);
    }

    public native @Cast("WORD") short Type(); public native RTL_CRITICAL_SECTION_DEBUG Type(short setter);
    public native @Cast("WORD") short CreatorBackTraceIndex(); public native RTL_CRITICAL_SECTION_DEBUG CreatorBackTraceIndex(short setter);
    public native RTL_CRITICAL_SECTION CriticalSection(); public native RTL_CRITICAL_SECTION_DEBUG CriticalSection(RTL_CRITICAL_SECTION setter);
    public native @ByRef LIST_ENTRY ProcessLocksList(); public native RTL_CRITICAL_SECTION_DEBUG ProcessLocksList(LIST_ENTRY setter);
    public native @Cast("DWORD") int EntryCount(); public native RTL_CRITICAL_SECTION_DEBUG EntryCount(int setter);
    public native @Cast("DWORD") int ContentionCount(); public native RTL_CRITICAL_SECTION_DEBUG ContentionCount(int setter);
    public native @Cast("DWORD") int Flags(); public native RTL_CRITICAL_SECTION_DEBUG Flags(int setter);
    public native @Cast("WORD") short CreatorBackTraceIndexHigh(); public native RTL_CRITICAL_SECTION_DEBUG CreatorBackTraceIndexHigh(short setter);
    public native @Cast("WORD") short SpareWORD(); public native RTL_CRITICAL_SECTION_DEBUG SpareWORD(short setter);
}
