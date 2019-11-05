// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Overloads for Eigen::half and bfloat16 that are 16 bits in size but are
// stored in an int32 field.
@Name("tensorflow::tensor::internal::CopyHelper<Eigen::half>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CopyHelper extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CopyHelper() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CopyHelper(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CopyHelper(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CopyHelper position(long position) {
        return (CopyHelper)super.position(position);
    }

}
