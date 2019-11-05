// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESSOR_IDLESTATE_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESSOR_IDLESTATE_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESSOR_IDLESTATE_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESSOR_IDLESTATE_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESSOR_IDLESTATE_POLICY position(long position) {
        return (PROCESSOR_IDLESTATE_POLICY)super.position(position);
    }

    public native @Cast("WORD") short Revision(); public native PROCESSOR_IDLESTATE_POLICY Revision(short setter);
        @Name("Flags.AsWORD") public native @Cast("WORD") short Flags_AsWORD(); public native PROCESSOR_IDLESTATE_POLICY Flags_AsWORD(short setter);
            @Name("Flags.AllowScaling") public native @Cast("WORD") @NoOffset short Flags_AllowScaling(); public native PROCESSOR_IDLESTATE_POLICY Flags_AllowScaling(short setter);
            @Name("Flags.Disabled") public native @Cast("WORD") @NoOffset short Flags_Disabled(); public native PROCESSOR_IDLESTATE_POLICY Flags_Disabled(short setter);
            @Name("Flags.Reserved") public native @Cast("WORD") @NoOffset short Flags_Reserved(); public native PROCESSOR_IDLESTATE_POLICY Flags_Reserved(short setter); 

    public native @Cast("DWORD") int PolicyCount(); public native PROCESSOR_IDLESTATE_POLICY PolicyCount(int setter);
    public native @ByRef PROCESSOR_IDLESTATE_INFO Policy(int i); public native PROCESSOR_IDLESTATE_POLICY Policy(int i, PROCESSOR_IDLESTATE_INFO setter);
    @MemberGetter public native PROCESSOR_IDLESTATE_INFO Policy();
}
