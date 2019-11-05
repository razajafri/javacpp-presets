// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/****************************************************************************************\
*                      Other supplementary data type definitions                         *
\****************************************************************************************/

/*************************************** CvRect *****************************************/
/** @see Rect_ */
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvRect extends AbstractCvRect {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvRect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvRect(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvRect position(long position) {
        return (CvRect)super.position(position);
    }

    public native int x(); public native CvRect x(int setter);
    public native int y(); public native CvRect y(int setter);
    public native int width(); public native CvRect width(int setter);
    public native int height(); public native CvRect height(int setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvRect() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvRect(int _x/*=0*/, int _y/*=0*/, int w/*=0*/, int h/*=0*/) { super((Pointer)null); allocate(_x, _y, w, h); }
    private native void allocate(int _x/*=0*/, int _y/*=0*/, int w/*=0*/, int h/*=0*/);
// #endif
// #ifdef __cplusplus
// #endif
}
