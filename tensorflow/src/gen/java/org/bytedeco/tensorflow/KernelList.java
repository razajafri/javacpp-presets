// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class KernelList extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KernelList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KernelList position(long position) {
        return (KernelList)super.position(position);
    }

  public KernelList() { super((Pointer)null); allocate(); }
  private native void allocate();

  public KernelList(@Const @ByRef KernelList from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef KernelList from);

  public native @ByRef @Name("operator =") KernelList put(@Const @ByRef KernelList from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef KernelList default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const KernelList internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(KernelList other);
  public native void Swap(KernelList other);
  

  // implements Message ----------------------------------------------

  public native KernelList New();

  public native KernelList New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef KernelList from);
  public native void MergeFrom(@Const @ByRef KernelList from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.KernelDef kernel = 1;
  public native int kernel_size();
  public native void clear_kernel();
  @MemberGetter public static native int kKernelFieldNumber();
  public static final int kKernelFieldNumber = kKernelFieldNumber();
  public native KernelDef mutable_kernel(int index);
  public native @Const @ByRef KernelDef kernel(int index);
  public native KernelDef add_kernel();
}
