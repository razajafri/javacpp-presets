// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Batch normalization.
 * 
 *  Note that the size of 4D Tensors are defined by either "NHWC" or "NCHW".
 *  The size of 1D Tensors matches the dimension C of the 4D Tensors.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A 4D Tensor for input data.
 *  * scale: A 1D Tensor for scaling factor, to scale the normalized x.
 *  * offset: A 1D Tensor for offset, to shift to the normalized x.
 *  * mean: A 1D Tensor for population mean. Used for inference only;
 *  must be empty for training.
 *  * variance: A 1D Tensor for population variance. Used for inference only;
 *  must be empty for training.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * epsilon: A small float number added to the variance of x.
 *  * data_format: The data format for x and y. Either "NHWC" (default) or "NCHW".
 *  * is_training: A bool value to indicate the operation is for training (default)
 *  or inference.
 * 
 *  Returns:
 *  * {@code Output} y: A 4D Tensor for output data.
 *  * {@code Output} batch_mean: A 1D Tensor for the computed batch mean, to be used by TensorFlow
 *  to compute the running mean.
 *  * {@code Output} batch_variance: A 1D Tensor for the computed batch variance, to be used by
 *  TensorFlow to compute the running variance.
 *  * {@code Output} reserve_space_1: A 1D Tensor for the computed batch mean, to be reused
 *  in the gradient computation.
 *  * {@code Output} reserve_space_2: A 1D Tensor for the computed batch variance (inverted variance
 *  in the cuDNN case), to be reused in the gradient computation. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FusedBatchNormV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FusedBatchNormV2(Pointer p) { super(p); }

  /** Optional attribute setters for FusedBatchNormV2 */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** A small float number added to the variance of x.
     * 
     *  Defaults to 0.0001 */
    
    ///
    public native @ByVal Attrs Epsilon(float x);

    /** The data format for x and y. Either "NHWC" (default) or "NCHW".
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    /** A bool value to indicate the operation is for training (default)
     *  or inference.
     * 
     *  Defaults to true */
    public native @ByVal Attrs IsTraining(@Cast("bool") boolean x);

    public native float epsilon_(); public native Attrs epsilon_(float setter);
    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
    public native @Cast("bool") boolean is_training_(); public native Attrs is_training_(boolean setter);
  }
  public FusedBatchNormV2(@Const @ByRef Scope scope, @ByVal Input x,
                   @ByVal Input scale, @ByVal Input offset,
                   @ByVal Input mean, @ByVal Input variance) { super((Pointer)null); allocate(scope, x, scale, offset, mean, variance); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                   @ByVal Input scale, @ByVal Input offset,
                   @ByVal Input mean, @ByVal Input variance);
  public FusedBatchNormV2(@Const @ByRef Scope scope, @ByVal Input x,
                   @ByVal Input scale, @ByVal Input offset,
                   @ByVal Input mean, @ByVal Input variance, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, scale, offset, mean, variance, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                   @ByVal Input scale, @ByVal Input offset,
                   @ByVal Input mean, @ByVal Input variance, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Epsilon(float x);
  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);
  public static native @ByVal Attrs IsTraining(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native FusedBatchNormV2 operation(Operation setter);
  public native @ByRef Output y(); public native FusedBatchNormV2 y(Output setter);
  public native @ByRef Output batch_mean(); public native FusedBatchNormV2 batch_mean(Output setter);
  public native @ByRef Output batch_variance(); public native FusedBatchNormV2 batch_variance(Output setter);
  public native @ByRef Output reserve_space_1(); public native FusedBatchNormV2 reserve_space_1(Output setter);
  public native @ByRef Output reserve_space_2(); public native FusedBatchNormV2 reserve_space_2(Output setter);
}
