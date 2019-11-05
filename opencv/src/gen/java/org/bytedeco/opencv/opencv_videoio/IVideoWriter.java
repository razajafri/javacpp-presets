// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videoio;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;

import static org.bytedeco.opencv.global.opencv_videoio.*;


@Namespace("cv") @Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_videoio.class)
public class IVideoWriter extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IVideoWriter() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IVideoWriter(Pointer p) { super(p); }
}
