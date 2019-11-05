// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


@Convention("CV_CDECL") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvDistanceFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvDistanceFunction(Pointer p) { super(p); }
    protected CvDistanceFunction() { allocate(); }
    private native void allocate();
    public native float call( @Const FloatPointer a, @Const FloatPointer b, Pointer user_param );
}
