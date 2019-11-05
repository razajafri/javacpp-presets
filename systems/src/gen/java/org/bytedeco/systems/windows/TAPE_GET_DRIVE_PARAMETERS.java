// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
  //mask for high features flag

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_GET_DRIVE_PARAMETERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_GET_DRIVE_PARAMETERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_GET_DRIVE_PARAMETERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_GET_DRIVE_PARAMETERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_GET_DRIVE_PARAMETERS position(long position) {
        return (TAPE_GET_DRIVE_PARAMETERS)super.position(position);
    }

    public native @Cast("BOOLEAN") boolean ECC(); public native TAPE_GET_DRIVE_PARAMETERS ECC(boolean setter);
    public native @Cast("BOOLEAN") boolean Compression(); public native TAPE_GET_DRIVE_PARAMETERS Compression(boolean setter);
    public native @Cast("BOOLEAN") boolean DataPadding(); public native TAPE_GET_DRIVE_PARAMETERS DataPadding(boolean setter);
    public native @Cast("BOOLEAN") boolean ReportSetmarks(); public native TAPE_GET_DRIVE_PARAMETERS ReportSetmarks(boolean setter);
    public native @Cast("DWORD") int DefaultBlockSize(); public native TAPE_GET_DRIVE_PARAMETERS DefaultBlockSize(int setter);
    public native @Cast("DWORD") int MaximumBlockSize(); public native TAPE_GET_DRIVE_PARAMETERS MaximumBlockSize(int setter);
    public native @Cast("DWORD") int MinimumBlockSize(); public native TAPE_GET_DRIVE_PARAMETERS MinimumBlockSize(int setter);
    public native @Cast("DWORD") int MaximumPartitionCount(); public native TAPE_GET_DRIVE_PARAMETERS MaximumPartitionCount(int setter);
    public native @Cast("DWORD") int FeaturesLow(); public native TAPE_GET_DRIVE_PARAMETERS FeaturesLow(int setter);
    public native @Cast("DWORD") int FeaturesHigh(); public native TAPE_GET_DRIVE_PARAMETERS FeaturesHigh(int setter);
    public native @Cast("DWORD") int EOTWarningZoneSize(); public native TAPE_GET_DRIVE_PARAMETERS EOTWarningZoneSize(int setter);
}
