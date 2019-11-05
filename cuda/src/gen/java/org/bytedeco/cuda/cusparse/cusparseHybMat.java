// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cusparse;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cusparse.*;


@Deprecated @Opaque @Properties(inherit = org.bytedeco.cuda.presets.cusparse.class)
public class cusparseHybMat extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cusparseHybMat() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cusparseHybMat(Pointer p) { super(p); }
}
