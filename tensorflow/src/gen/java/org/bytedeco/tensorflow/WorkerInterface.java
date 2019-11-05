// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface for talking with the TensorFlow Worker service.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WorkerInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WorkerInterface(Pointer p) { super(p); }

  public native void GetStatusAsync(@Const GetStatusRequest request,
                                GetStatusResponse response,
                                @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void CreateWorkerSessionAsync(
        @Const CreateWorkerSessionRequest request,
        CreateWorkerSessionResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void DeleteWorkerSessionAsync(
        CallOptions opts, @Const DeleteWorkerSessionRequest request,
        DeleteWorkerSessionResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void RegisterGraphAsync(@Const RegisterGraphRequest request,
                                    RegisterGraphResponse response,
                                    @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void DeregisterGraphAsync(@Const DeregisterGraphRequest request,
                                      DeregisterGraphResponse response,
                                      @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void RunGraphAsync(CallOptions opts, RunGraphRequestWrapper request,
                               MutableRunGraphResponseWrapper repsonse,
                               @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void RunGraphAsync(CallOptions opts, @Const RunGraphRequest request,
                               RunGraphResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  // Returns a request object for use in calls to
  // `RunGraphAsync()`. Ownership is transferred to the caller.
  //
  // The message returned from this method must only be used in a
  // `RunGraph()` call on the same `WorkerInterface` instance.
  public native MutableRunGraphRequestWrapper CreateRunGraphRequest();

  // Returns a response object for use in calls to
  // `RunGraphAsync()`. Ownership is transferred to the caller.
  //
  // The message returned from this method must only be used in a
  // `RunGraph()` call on the same `WorkerInterface` instance.
  public native MutableRunGraphResponseWrapper CreateRunGraphResponse();

  public native void CleanupGraphAsync(@Const CleanupGraphRequest request,
                                   CleanupGraphResponse response,
                                   @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void CleanupAllAsync(@Const CleanupAllRequest request,
                                 CleanupAllResponse response,
                                 @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void RecvTensorAsync(CallOptions opts,
                                 @Const RecvTensorRequest request,
                                 TensorResponse response,
                                 @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void LoggingAsync(@Const LoggingRequest request,
                              LoggingResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void TracingAsync(@Const TracingRequest request,
                              TracingResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void RecvBufAsync(CallOptions opts, @Const RecvBufRequest request,
                              RecvBufResponse response, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void CompleteGroupAsync(CallOptions opts,
                                    @Const CompleteGroupRequest request,
                                    CompleteGroupResponse response,
                                    @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void CompleteInstanceAsync(CallOptions ops,
                                       @Const CompleteInstanceRequest request,
                                       CompleteInstanceResponse response,
                                       @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void GetStepSequenceAsync(@Const GetStepSequenceRequest request,
                                      GetStepSequenceResponse response,
                                      @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native @ByVal Status GetStatus(@Const GetStatusRequest request,
                     GetStatusResponse response);

  public native @ByVal Status CreateWorkerSession(@Const CreateWorkerSessionRequest request,
                               CreateWorkerSessionResponse response);

  public native @ByVal Status DeleteWorkerSession(@Const DeleteWorkerSessionRequest request,
                               DeleteWorkerSessionResponse response);

  public native @ByVal Status RegisterGraph(@Const RegisterGraphRequest request,
                         RegisterGraphResponse response);

  public native @ByVal Status DeregisterGraph(@Const DeregisterGraphRequest request,
                           DeregisterGraphResponse response);

  public native @ByVal Status CleanupGraph(@Const CleanupGraphRequest request,
                        CleanupGraphResponse response);

  public native @ByVal Status CleanupAll(@Const CleanupAllRequest request,
                      CleanupAllResponse response);

  public native @ByVal Status Logging(@Const LoggingRequest request, LoggingResponse response);

  public native @ByVal Status Tracing(@Const TracingRequest request, TracingResponse response);

  public native @ByVal Status GetStepSequence(@Const GetStepSequenceRequest request,
                           GetStepSequenceResponse response);
}
