// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// CLR 2.0 header structure.
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_COR20_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_COR20_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_COR20_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_COR20_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_COR20_HEADER position(long position) {
        return (IMAGE_COR20_HEADER)super.position(position);
    }

    // Header versioning
    public native @Cast("DWORD") int cb(); public native IMAGE_COR20_HEADER cb(int setter);
    public native @Cast("WORD") short MajorRuntimeVersion(); public native IMAGE_COR20_HEADER MajorRuntimeVersion(short setter);
    public native @Cast("WORD") short MinorRuntimeVersion(); public native IMAGE_COR20_HEADER MinorRuntimeVersion(short setter);

    // Symbol table and startup information
    public native @ByRef IMAGE_DATA_DIRECTORY MetaData(); public native IMAGE_COR20_HEADER MetaData(IMAGE_DATA_DIRECTORY setter);
    public native @Cast("DWORD") int Flags(); public native IMAGE_COR20_HEADER Flags(int setter);

    // If COMIMAGE_FLAGS_NATIVE_ENTRYPOINT is not set, EntryPointToken represents a managed entrypoint.
    // If COMIMAGE_FLAGS_NATIVE_ENTRYPOINT is set, EntryPointRVA represents an RVA to a native entrypoint.
        public native @Cast("DWORD") int EntryPointToken(); public native IMAGE_COR20_HEADER EntryPointToken(int setter);
        public native @Cast("DWORD") int EntryPointRVA(); public native IMAGE_COR20_HEADER EntryPointRVA(int setter); 

    // Binding information
    public native @ByRef IMAGE_DATA_DIRECTORY Resources(); public native IMAGE_COR20_HEADER Resources(IMAGE_DATA_DIRECTORY setter);
    public native @ByRef IMAGE_DATA_DIRECTORY StrongNameSignature(); public native IMAGE_COR20_HEADER StrongNameSignature(IMAGE_DATA_DIRECTORY setter);

    // Regular fixup and binding information
    public native @ByRef IMAGE_DATA_DIRECTORY CodeManagerTable(); public native IMAGE_COR20_HEADER CodeManagerTable(IMAGE_DATA_DIRECTORY setter);
    public native @ByRef IMAGE_DATA_DIRECTORY VTableFixups(); public native IMAGE_COR20_HEADER VTableFixups(IMAGE_DATA_DIRECTORY setter);
    public native @ByRef IMAGE_DATA_DIRECTORY ExportAddressTableJumps(); public native IMAGE_COR20_HEADER ExportAddressTableJumps(IMAGE_DATA_DIRECTORY setter);

    // Precompiled image info (internal use only - set to zero)
    public native @ByRef IMAGE_DATA_DIRECTORY ManagedNativeHeader(); public native IMAGE_COR20_HEADER ManagedNativeHeader(IMAGE_DATA_DIRECTORY setter);

}
