// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Describes the availability of a given entity on a particular platform, e.g.,
 * a particular class might only be available on Mac OS 10.7 or newer.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXPlatformAvailability extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXPlatformAvailability() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXPlatformAvailability(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXPlatformAvailability(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXPlatformAvailability position(long position) {
        return (CXPlatformAvailability)super.position(position);
    }

  /**
   * A string that describes the platform for which this structure
   * provides availability information.
   *
   * Possible values are "ios" or "macos".
   */
  public native @ByRef CXString Platform(); public native CXPlatformAvailability Platform(CXString setter);
  /**
   * The version number in which this entity was introduced.
   */
  public native @ByRef CXVersion Introduced(); public native CXPlatformAvailability Introduced(CXVersion setter);
  /**
   * The version number in which this entity was deprecated (but is
   * still available).
   */
  public native @ByRef CXVersion Deprecated(); public native CXPlatformAvailability Deprecated(CXVersion setter);
  /**
   * The version number in which this entity was obsoleted, and therefore
   * is no longer available.
   */
  public native @ByRef CXVersion Obsoleted(); public native CXPlatformAvailability Obsoleted(CXVersion setter);
  /**
   * Whether the entity is unconditionally unavailable on this platform.
   */
  public native int Unavailable(); public native CXPlatformAvailability Unavailable(int setter);
  /**
   * An optional message to provide to a user of this API, e.g., to
   * suggest replacement APIs.
   */
  public native @ByRef CXString Message(); public native CXPlatformAvailability Message(CXString setter);
}
