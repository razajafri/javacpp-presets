// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** TODO: add doc.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output_handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListSetItem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListSetItem(Pointer p) { super(p); }

  public TensorListSetItem(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input index, @ByVal Input item) { super((Pointer)null); allocate(scope, input_handle, index, item); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input index, @ByVal Input item);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListSetItem operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListSetItem output_handle(Output setter);
}
