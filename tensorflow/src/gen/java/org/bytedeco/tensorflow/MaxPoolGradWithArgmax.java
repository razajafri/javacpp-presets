// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradients of the maxpooling function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The original input.
 *  * grad: 4-D with shape {@code [batch, height, width, channels]}.  Gradients w.r.t. the
 *  output of {@code max_pool}.
 *  * argmax: The indices of the maximum values chosen for each output of {@code max_pool}.
 *  * ksize: The size of the window for each dimension of the input tensor.
 *  * strides: The stride of the sliding window for each dimension of the
 *  input tensor.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * include_batch_in_index: Whether to include batch dimension in flattened index of {@code argmax}.
 * 
 *  Returns:
 *  * {@code Output}: Gradients w.r.t. the input of {@code max_pool}. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MaxPoolGradWithArgmax extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPoolGradWithArgmax(Pointer p) { super(p); }

  /** Optional attribute setters for MaxPoolGradWithArgmax */
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
  
    /** Whether to include batch dimension in flattened index of {@code argmax}.
     * 
     *  Defaults to false */
    public native @ByVal Attrs IncludeBatchInIndex(@Cast("bool") boolean x);

    public native @Cast("bool") boolean include_batch_in_index_(); public native Attrs include_batch_in_index_(boolean setter);
  }
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece String padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece String padding);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPoolGradWithArgmax(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, grad, argmax, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input grad, @ByVal Input argmax, @ArraySlice int[] ksize, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs IncludeBatchInIndex(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native MaxPoolGradWithArgmax operation(Operation setter);
  public native @ByRef Output output(); public native MaxPoolGradWithArgmax output(Output setter);
}
