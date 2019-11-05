// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class MaxUnpoolLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MaxUnpoolLayer(Pointer p) { super(p); }
    
        public native @ByRef Size poolKernel(); public native MaxUnpoolLayer poolKernel(Size setter);
        public native @ByRef Size poolPad(); public native MaxUnpoolLayer poolPad(Size setter);
        public native @ByRef Size poolStride(); public native MaxUnpoolLayer poolStride(Size setter);

        public static native @Ptr MaxUnpoolLayer create(@Const @ByRef LayerParams params);
    }
