// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProtoRunGraphRequest extends RunGraphRequestWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProtoRunGraphRequest(Pointer p) { super(p); }

  public ProtoRunGraphRequest(@Const RunGraphRequest request) { super((Pointer)null); allocate(request); }
  private native void allocate(@Const RunGraphRequest request);

  // RunGraphRequestWrapper methods.
  public native @StdString BytePointer session_handle();
  public native @Cast("bool") boolean create_worker_session_called();
  public native @StdString BytePointer graph_handle();
  public native @Cast("tensorflow::int64") long step_id();
  public native @Const @ByRef ExecutorOpts exec_opts();
  public native @Cast("size_t") long num_sends();
  public native @StdString BytePointer send_key(@Cast("size_t") long i);
  public native @ByVal Status SendValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @Cast("size_t") long num_recvs();
  public native @StdString BytePointer recv_key(@Cast("size_t") long i);
  public native @Cast("bool") boolean is_partial();
  public native @Cast("bool") boolean is_last_partial_run();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native @Cast("tensorflow::int64") long request_id();
  public native @Const @ByRef RunGraphRequest ToProto();
}
