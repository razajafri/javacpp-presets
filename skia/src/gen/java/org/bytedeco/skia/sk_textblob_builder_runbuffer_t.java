// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_textblob_builder_runbuffer_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_textblob_builder_runbuffer_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_textblob_builder_runbuffer_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_textblob_builder_runbuffer_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_textblob_builder_runbuffer_t position(long position) {
        return (sk_textblob_builder_runbuffer_t)super.position(position);
    }

    public native Pointer glyphs(); public native sk_textblob_builder_runbuffer_t glyphs(Pointer setter);
    public native Pointer pos(); public native sk_textblob_builder_runbuffer_t pos(Pointer setter);
    public native Pointer utf8text(); public native sk_textblob_builder_runbuffer_t utf8text(Pointer setter);
    public native Pointer clusters(); public native sk_textblob_builder_runbuffer_t clusters(Pointer setter);
}
