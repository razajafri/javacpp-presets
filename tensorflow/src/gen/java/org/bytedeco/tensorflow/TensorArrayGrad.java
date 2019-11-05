// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a TensorArray for storing the gradients of values in the given handle.
 * 
 *  If the given TensorArray gradient already exists, returns a reference to it.
 * 
 *  Locks the size of the original TensorArray by disabling its dynamic size flag.
 * 
 *  **A note about the input flow_in:**
 * 
 *  The handle flow_in forces the execution of the gradient lookup to occur
 *  only after certain other operations have occurred.  For example, when
 *  the forward TensorArray is dynamically sized, writes to this TensorArray
 *  may resize the object.  The gradient TensorArray is statically sized based
 *  on the size of the forward TensorArray when this operation executes.
 *  Furthermore, the size of the forward TensorArray is frozen by this call.
 *  As a result, the flow is used to ensure that the call to generate the gradient
 *  TensorArray only happens after all writes are executed.
 * 
 *  In the case of dynamically sized TensorArrays, gradient computation should
 *  only be performed on read operations that have themselves been chained via
 *  flow to occur only after all writes have executed. That way the final size
 *  of the forward TensorArray is known when this operation is called.
 * 
 *  **A note about the source attribute:**
 * 
 *  TensorArray gradient calls use an accumulator TensorArray object.  If
 *  multiple gradients are calculated and run in the same session, the multiple
 *  gradient nodes may accidentally flow through the same accumulator TensorArray.
 *  This double counts and generally breaks the TensorArray gradient flow.
 * 
 *  The solution is to identify which gradient call this particular
 *  TensorArray gradient is being called in.  This is performed by identifying
 *  a unique string (e.g. "gradients", "gradients_1", ...) from the input
 *  gradient Tensor's name.  This string is used as a suffix when creating
 *  the TensorArray gradient object here (the attribute {@code source}).
 * 
 *  The attribute {@code source} is added as a suffix to the forward TensorArray's
 *  name when performing the creation / lookup, so that each separate gradient
 *  calculation gets its own TensorArray accumulator.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to the forward TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 *  * source: The gradient source string, used to decide which gradient TensorArray
 *  to return.
 * 
 *  Returns:
 *  * {@code Output} grad_handle
 *  * {@code Output} flow_out */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayGrad(Pointer p) { super(p); }

  public TensorArrayGrad(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in, @StringPiece BytePointer source) { super((Pointer)null); allocate(scope, handle, flow_in, source); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in, @StringPiece BytePointer source);
  public TensorArrayGrad(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in, @StringPiece String source) { super((Pointer)null); allocate(scope, handle, flow_in, source); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in, @StringPiece String source);

  public native @ByRef Operation operation(); public native TensorArrayGrad operation(Operation setter);
  public native @ByRef Output grad_handle(); public native TensorArrayGrad grad_handle(Output setter);
  public native @ByRef Output flow_out(); public native TensorArrayGrad flow_out(Output setter);
}
