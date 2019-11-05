// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::int64,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LongVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongVector(Pointer p) { super(p); }
    public LongVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef LongVector put(@ByRef LongVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @Cast("tensorflow::int64") long get(@Cast("size_t") long i);
    public native LongVector put(@Cast("size_t") long i, long value);
}

