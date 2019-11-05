// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class CacheLevelInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CacheLevelInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CacheLevelInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CacheLevelInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CacheLevelInfo position(long position) {
        return (CacheLevelInfo)super.position(position);
    }

  public native int level(); public native CacheLevelInfo level(int setter);
  public native @Cast("cpu_features::CacheType") int cache_type(); public native CacheLevelInfo cache_type(int setter);
  public native int cache_size(); public native CacheLevelInfo cache_size(int setter);    // Cache size in bytes
  public native int ways(); public native CacheLevelInfo ways(int setter);          // Associativity, 0 undefined, 0xFF fully associative
  public native int line_size(); public native CacheLevelInfo line_size(int setter);     // Cache line size in bytes
  public native int tlb_entries(); public native CacheLevelInfo tlb_entries(int setter);   // number of entries for TLB
  public native int partitioning(); public native CacheLevelInfo partitioning(int setter);  // number of lines per sector
}
