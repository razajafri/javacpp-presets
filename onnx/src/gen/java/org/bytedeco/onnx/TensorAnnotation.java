// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorAnnotation extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorAnnotation(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorAnnotation(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorAnnotation position(long position) {
        return (TensorAnnotation)super.position(position);
    }

  public TensorAnnotation() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorAnnotation(@Const @ByRef TensorAnnotation from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorAnnotation from);

  public native @ByRef @Name("operator =") TensorAnnotation put(@Const @ByRef TensorAnnotation from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TensorAnnotation default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorAnnotation internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TensorAnnotation other);
  

  // implements Message ----------------------------------------------

  public native TensorAnnotation New();

  public native TensorAnnotation New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorAnnotation from);
  public native void MergeFrom(@Const @ByRef TensorAnnotation from);
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

  // repeated .onnx.StringStringEntryProto quant_parameter_tensor_names = 2;
  public native int quant_parameter_tensor_names_size();
  public native void clear_quant_parameter_tensor_names();
  @MemberGetter public static native int kQuantParameterTensorNamesFieldNumber();
  public static final int kQuantParameterTensorNamesFieldNumber = kQuantParameterTensorNamesFieldNumber();
  public native StringStringEntryProto mutable_quant_parameter_tensor_names(int index);
  public native @Const @ByRef StringStringEntryProto quant_parameter_tensor_names(int index);
  public native StringStringEntryProto add_quant_parameter_tensor_names();

  // optional string tensor_name = 1;
  public native @Cast("bool") boolean has_tensor_name();
  public native void clear_tensor_name();
  @MemberGetter public static native int kTensorNameFieldNumber();
  public static final int kTensorNameFieldNumber = kTensorNameFieldNumber();
  public native @StdString BytePointer tensor_name();
  public native void set_tensor_name(@StdString BytePointer value);
  public native void set_tensor_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tensor_name();
  public native void set_allocated_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer tensor_name);
}
