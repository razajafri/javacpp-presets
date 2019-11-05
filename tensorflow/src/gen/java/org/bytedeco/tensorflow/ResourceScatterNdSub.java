// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Applies sparse subtraction to individual values or slices in a Variable.
 * 
 *  {@code ref} is a {@code Tensor} with rank {@code P} and {@code indices} is a {@code Tensor} of rank {@code Q}.
 * 
 *  {@code indices} must be integer tensor, containing indices into {@code ref}.
 *  It must be shape {@code [d_0, ..., d_{Q-2}, K]} where {@code 0 < K <= P}.
 * 
 *  The innermost dimension of {@code indices} (with length {@code K}) corresponds to
 *  indices into elements (if {@code K = P}) or slices (if {@code K < P}) along the {@code K}th
 *  dimension of {@code ref}.
 * 
 *  {@code updates} is {@code Tensor} of rank {@code Q-1+P-K} with shape:
 * 
 *  <pre>{@code
 *  [d_0, ..., d_{Q-2}, ref.shape[K], ..., ref.shape[P-1]]
 *  }</pre>
 * 
 *  For example, say we want to subtract 4 scattered elements from a rank-1 tensor
 *  with 8 elements. In Python, that subtraction would look like this:
 * 
 *  <pre>{@code python
 *  ref = tf.Variable([1, 2, 3, 4, 5, 6, 7, 8], use_resource=True)
 *  indices = tf.constant([[4], [3], [1], [7]])
 *  updates = tf.constant([9, 10, 11, 12])
 *  sub = tf.scatter_nd_sub(ref, indices, updates)
 *  with tf.Session() as sess:
 *    print sess.run(sub)
 *  }</pre>
 * 
 *  The resulting update to ref would look like this:
 * 
 *      [1, -9, 3, -6, -4, 6, 7, -4]
 * 
 *  See {@code tf.scatter_nd} for more details about how to make updates to
 *  slices.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: A resource handle. Must be from a VarHandleOp.
 *  * indices: A Tensor. Must be one of the following types: int32, int64.
 *  A tensor of indices into ref.
 *  * updates: A Tensor. Must have the same type as ref. A tensor of
 *  values to add to ref.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: An optional bool. Defaults to True. If True, the assignment will
 *  be protected by a lock; otherwise the behavior is undefined,
 *  but may exhibit less contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceScatterNdSub extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceScatterNdSub(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceScatterNdSub */
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
  
    /** An optional bool. Defaults to True. If True, the assignment will
     *  be protected by a lock; otherwise the behavior is undefined,
     *  but may exhibit less contention.
     * 
     *  Defaults to true */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ResourceScatterNdSub(@Const @ByRef Scope scope, @ByVal Input ref,
                       @ByVal Input indices, @ByVal Input updates) { super((Pointer)null); allocate(scope, ref, indices, updates); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
                       @ByVal Input indices, @ByVal Input updates);
  public ResourceScatterNdSub(@Const @ByRef Scope scope, @ByVal Input ref,
                       @ByVal Input indices, @ByVal Input updates,
                       @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, ref, indices, updates, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
                       @ByVal Input indices, @ByVal Input updates,
                       @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceScatterNdSub operation(Operation setter);
}
