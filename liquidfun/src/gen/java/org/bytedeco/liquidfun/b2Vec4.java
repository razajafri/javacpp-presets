// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A 4D column vector with 4 elements. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Vec4 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Vec4(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Vec4(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Vec4 position(long position) {
        return (b2Vec4)super.position(position);
    }

	/** Default constructor does nothing (for performance). */
	public b2Vec4() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Construct using coordinates. */
	public b2Vec4(@Cast("float32") float x, @Cast("float32") float y, @Cast("float32") float z, @Cast("float32") float w) { super((Pointer)null); allocate(x, y, z, w); }
	private native void allocate(@Cast("float32") float x, @Cast("float32") float y, @Cast("float32") float z, @Cast("float32") float w);

	public native @Cast("float32") float x(); public native b2Vec4 x(float setter);
	public native @Cast("float32") float y(); public native b2Vec4 y(float setter);
	public native @Cast("float32") float z(); public native b2Vec4 z(float setter);
	public native @Cast("float32") float w(); public native b2Vec4 w(float setter);
}
