// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**
 * \brief Options for the ORC writer.
 */
@Namespace("cudf::experimental::io::detail::orc") @NoOffset @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class writer_options extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public writer_options(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public writer_options(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public writer_options position(long position) {
        return (writer_options)super.position(position);
    }

  public native @ByRef compression_type compression(); public native writer_options compression(compression_type setter);

  public writer_options() { super((Pointer)null); allocate(); }
  private native void allocate();
  public writer_options(@Const @ByRef writer_options arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef writer_options arg0);

  /**
   * \brief Constructor to populate writer options.
   *
   * @param format Compression format to use
   */
  public writer_options(@ByVal compression_type format) { super((Pointer)null); allocate(format); }
  private native void allocate(@ByVal compression_type format);
}
