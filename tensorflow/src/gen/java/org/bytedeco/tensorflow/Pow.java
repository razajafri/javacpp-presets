// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the power of one value to another.
 * 
 *  Given a tensor {@code x} and a tensor {@code y}, this operation computes \(x^y\) for
 *  corresponding elements in {@code x} and {@code y}. For example:
 * 
 *  <pre>{@code
 *  # tensor 'x' is [[2, 2]], [3, 3]]
 *  # tensor 'y' is [[8, 16], [2, 3]]
 *  tf.pow(x, y) ==> [[256, 65536], [9, 27]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Pow extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Pow(Pointer p) { super(p); }

  public Pow(@Const @ByRef Scope scope, @ByVal Input x,
      @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
      @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Pow operation(Operation setter);
  public native @ByRef Output z(); public native Pow z(Output setter);
}
