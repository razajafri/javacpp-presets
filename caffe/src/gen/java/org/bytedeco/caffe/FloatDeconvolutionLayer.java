// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Convolve the input with a bank of learned filters, and (optionally)
 *        add biases, treating filters and convolution parameters in the
 *        opposite sense as ConvolutionLayer.
 *
 *   ConvolutionLayer computes each output value by dotting an input window with
 *   a filter; DeconvolutionLayer multiplies each input value by a filter
 *   elementwise, and sums over the resulting output windows. In other words,
 *   DeconvolutionLayer is ConvolutionLayer with the forward and backward passes
 *   reversed. DeconvolutionLayer reuses ConvolutionParameter for its
 *   parameters, but they take the opposite sense as in ConvolutionLayer (so
 *   padding is removed from the output rather than added to the input, and
 *   stride results in upsampling rather than downsampling).
 */
@Name("caffe::DeconvolutionLayer<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatDeconvolutionLayer extends FloatBaseConvolutionLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatDeconvolutionLayer(Pointer p) { super(p); }

  public FloatDeconvolutionLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native void Forward_cpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Forward_gpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Backward_cpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native void Backward_gpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native @Cast("bool") boolean reverse_dimensions();
  @Virtual protected native void compute_output_shape();
}
