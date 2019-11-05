// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;
 // support up to 16 visible markers


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class MarkerPoint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MarkerPoint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MarkerPoint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarkerPoint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MarkerPoint position(long position) {
        return (MarkerPoint)super.position(position);
    }


    public native @Cast("ARToolKitPlus::MarkerPoint::coord_type") int x(); public native MarkerPoint x(int setter);
    public native @Cast("ARToolKitPlus::MarkerPoint::coord_type") int y(); public native MarkerPoint y(int setter);
    public native @Cast("unsigned short") short markerIdx(); public native MarkerPoint markerIdx(short setter);
    public native @Cast("unsigned short") short cornerIdx(); public native MarkerPoint cornerIdx(short setter);
}
