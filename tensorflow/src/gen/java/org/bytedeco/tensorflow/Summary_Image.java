// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Summary_Image extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Summary_Image(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Summary_Image(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Summary_Image position(long position) {
        return (Summary_Image)super.position(position);
    }

  public Summary_Image() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Summary_Image(@Const @ByRef Summary_Image from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef Summary_Image from);

  public native @ByRef @Name("operator =") Summary_Image put(@Const @ByRef Summary_Image from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef Summary_Image default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const Summary_Image internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(Summary_Image other);
  public native void Swap(Summary_Image other);
  

  // implements Message ----------------------------------------------

  public native Summary_Image New();

  public native Summary_Image New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef Summary_Image from);
  public native void MergeFrom(@Const @ByRef Summary_Image from);
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

  // bytes encoded_image_string = 4;
  public native void clear_encoded_image_string();
  @MemberGetter public static native int kEncodedImageStringFieldNumber();
  public static final int kEncodedImageStringFieldNumber = kEncodedImageStringFieldNumber();
  public native @StdString BytePointer encoded_image_string();
  public native void set_encoded_image_string(@StdString BytePointer value);
  public native void set_encoded_image_string(@StdString String value);
  public native void set_encoded_image_string(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_encoded_image_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_encoded_image_string();
  public native void set_allocated_encoded_image_string(@StdString @Cast({"char*", "std::string*"}) BytePointer encoded_image_string);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_encoded_image_string();
  public native void unsafe_arena_set_allocated_encoded_image_string(
        @StdString @Cast({"char*", "std::string*"}) BytePointer encoded_image_string);

  // int32 height = 1;
  public native void clear_height();
  @MemberGetter public static native int kHeightFieldNumber();
  public static final int kHeightFieldNumber = kHeightFieldNumber();
  public native @Cast("google::protobuf::int32") int height();
  public native void set_height(@Cast("google::protobuf::int32") int value);

  // int32 width = 2;
  public native void clear_width();
  @MemberGetter public static native int kWidthFieldNumber();
  public static final int kWidthFieldNumber = kWidthFieldNumber();
  public native @Cast("google::protobuf::int32") int width();
  public native void set_width(@Cast("google::protobuf::int32") int value);

  // int32 colorspace = 3;
  public native void clear_colorspace();
  @MemberGetter public static native int kColorspaceFieldNumber();
  public static final int kColorspaceFieldNumber = kColorspaceFieldNumber();
  public native @Cast("google::protobuf::int32") int colorspace();
  public native void set_colorspace(@Cast("google::protobuf::int32") int value);
}
