// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback2<bool,const STRING&,const STRING&>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class StringCompareCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StringCompareCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringCompareCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringCompareCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StringCompareCallback position(long position) {
        return (StringCompareCallback)super.position(position);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(@Const @ByRef STRING arg0, @Const @ByRef STRING arg1);
}
