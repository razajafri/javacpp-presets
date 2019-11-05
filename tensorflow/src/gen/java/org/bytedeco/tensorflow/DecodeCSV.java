// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup parsing_ops Parsing Ops
 *  \{
 <p>
 *  Convert CSV records to tensors. Each column maps to one tensor.
 * 
 *  RFC 4180 format is expected for the CSV records.
 *  (https://tools.ietf.org/html/rfc4180)
 *  Note that we allow leading and trailing spaces with int or float field.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * records: Each string is a record/row in the csv and all records should have
 *  the same format.
 *  * record_defaults: One tensor per column of the input record, with either a
 *  scalar default value for that column or an empty vector if the column is
 *  required.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * field_delim: char delimiter to separate fields in a record.
 *  * use_quote_delim: If false, treats double quotation marks as regular
 *  characters inside of the string fields (ignoring RFC 4180, Section 2,
 *  Bullet 5).
 *  * na_value: Additional string to recognize as NA/NaN.
 * 
 *  Returns:
 *  * {@code OutputList}: Each tensor will have the same shape as records. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DecodeCSV extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecodeCSV(Pointer p) { super(p); }

  /** Optional attribute setters for DecodeCSV */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** char delimiter to separate fields in a record.
     * 
     *  Defaults to "," */
    
    ///
    public native @ByVal Attrs FieldDelim(@StringPiece BytePointer x);
    public native @ByVal Attrs FieldDelim(@StringPiece String x);

    /** If false, treats double quotation marks as regular
     *  characters inside of the string fields (ignoring RFC 4180, Section 2,
     *  Bullet 5).
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs UseQuoteDelim(@Cast("bool") boolean x);

    /** Additional string to recognize as NA/NaN.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs NaValue(@StringPiece BytePointer x);
    public native @ByVal Attrs NaValue(@StringPiece String x);

    /** Defaults to [] */
    public native @ByVal Attrs SelectCols(@ArraySlice IntPointer x);
    public native @ByVal Attrs SelectCols(@ArraySlice IntBuffer x);
    public native @ByVal Attrs SelectCols(@ArraySlice int... x);

    public native @StringPiece BytePointer field_delim_(); public native Attrs field_delim_(BytePointer setter);
    public native @Cast("bool") boolean use_quote_delim_(); public native Attrs use_quote_delim_(boolean setter);
    public native @StringPiece BytePointer na_value_(); public native Attrs na_value_(BytePointer setter);
    public native @ArraySlice IntPointer select_cols_(); public native Attrs select_cols_(IntPointer setter);
  }
  public DecodeCSV(@Const @ByRef Scope scope, @ByVal Input records,
            @ByVal InputList record_defaults) { super((Pointer)null); allocate(scope, records, record_defaults); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input records,
            @ByVal InputList record_defaults);
  public DecodeCSV(@Const @ByRef Scope scope, @ByVal Input records,
            @ByVal InputList record_defaults, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, records, record_defaults, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input records,
            @ByVal InputList record_defaults, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public static native @ByVal Attrs FieldDelim(@StringPiece BytePointer x);
  public static native @ByVal Attrs FieldDelim(@StringPiece String x);
  public static native @ByVal Attrs UseQuoteDelim(@Cast("bool") boolean x);
  public static native @ByVal Attrs NaValue(@StringPiece BytePointer x);
  public static native @ByVal Attrs NaValue(@StringPiece String x);
  public static native @ByVal Attrs SelectCols(@ArraySlice IntPointer x);
  public static native @ByVal Attrs SelectCols(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs SelectCols(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native DecodeCSV operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output(); public native DecodeCSV output(OutputVector setter);
}
