// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;


/**
 * \brief Settings to use for {@code read_orc()}
 */
@Namespace("cudf::experimental::io") @NoOffset @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class read_orc_args extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public read_orc_args(Pointer p) { super(p); }

  public native @ByRef source_info source(); public native read_orc_args source(source_info setter);

  /** Names of column to read; empty is all */
  public native @StdString @StdVector BytePointer columns(); public native read_orc_args columns(BytePointer setter);

  /** Stripe to read; -1 is all */
  public native @ByRef size_type stripe(); public native read_orc_args stripe(size_type setter);
  /** Rows to skip from the start; -1 is none */
  public native @ByRef size_type skip_rows(); public native read_orc_args skip_rows(size_type setter);
  /** Rows to read; -1 is all */
  public native @ByRef size_type num_rows(); public native read_orc_args num_rows(size_type setter);

  /** Whether to use row index to speed-up reading */
  public native @Cast("bool") boolean use_index(); public native read_orc_args use_index(boolean setter);

  /** Whether to use numpy-compatible dtypes */
  public native @Cast("bool") boolean use_np_dtypes(); public native read_orc_args use_np_dtypes(boolean setter);
  /** Cast timestamp columns to a specific type */
  public native @ByRef data_type timestamp_type(); public native read_orc_args timestamp_type(data_type setter);

  /** Whether to convert decimals to float64 */
  public native @Cast("bool") boolean decimals_as_float(); public native read_orc_args decimals_as_float(boolean setter);
  /** For decimals as int, optional forced decimal scale;
   *  -1 is auto (column scale), >=0: number of fractional digits */
  public native int forced_decimals_scale(); public native read_orc_args forced_decimals_scale(int setter);

  public read_orc_args(@Const @ByRef source_info src) { super((Pointer)null); allocate(src); }
  private native void allocate(@Const @ByRef source_info src);
}
