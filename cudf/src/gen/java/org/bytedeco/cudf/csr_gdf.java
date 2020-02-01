// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;

//
// Compressed Saprse Row - see https://en.wikipedia.org/wiki/Sparse_matrix
//
@Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class csr_gdf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public csr_gdf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public csr_gdf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public csr_gdf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public csr_gdf position(long position) {
        return (csr_gdf)super.position(position);
    }

	public native Pointer A(); public native csr_gdf A(Pointer setter);			// on-device:	single array (length nnz) that holds all the valid data fields (based on valid bitmap)
	public native size_type IA(); public native csr_gdf IA(size_type setter);			// on-device:	compressed row indexes (size rows + 1)
	public native @Cast("int64_t*") LongPointer JA(); public native csr_gdf JA(LongPointer setter);			// on-device:	column index (size of nnz)
    public native @Cast("gdf_dtype") int dtype(); public native csr_gdf dtype(int setter);		// on-host:		the data type
	public native @Cast("int64_t") long nnz(); public native csr_gdf nnz(long setter);		// on-host:		the number of valid fields (nnz = number non-zero)
	public native @ByRef size_type rows(); public native csr_gdf rows(size_type setter);		// on-host:		the number of rows
	public native @ByRef size_type cols(); public native csr_gdf cols(size_type setter);		// on-host:		the number of columns
}
