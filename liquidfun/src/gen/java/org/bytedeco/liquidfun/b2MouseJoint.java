// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A mouse joint is used to make a point on a body track a
 *  specified world point. This a soft constraint with a maximum
 *  force. This allows the constraint to stretch and without
 *  applying huge forces.
 *  NOTE: this joint is not documented in the manual because it was
 *  developed to be used in the testbed. If you want to learn how to
 *  use the mouse joint, look at the testbed. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2MouseJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2MouseJoint(Pointer p) { super(p); }


	/** Implements b2Joint. */
	public native @ByVal b2Vec2 GetAnchorA();

	/** Implements b2Joint. */
	public native @ByVal b2Vec2 GetAnchorB();

	/** Implements b2Joint. */
	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);

	/** Implements b2Joint. */
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** Use this to update the target point. */
	public native void SetTarget(@Const @ByRef b2Vec2 target);
	public native @Const @ByRef b2Vec2 GetTarget();

	/** Set/get the maximum force in Newtons. */
	public native void SetMaxForce(@Cast("float32") float force);
	public native @Cast("float32") float GetMaxForce();

	/** Set/get the frequency in Hertz. */
	public native void SetFrequency(@Cast("float32") float hz);
	public native @Cast("float32") float GetFrequency();

	/** Set/get the damping ratio (dimensionless). */
	public native void SetDampingRatio(@Cast("float32") float ratio);
	public native @Cast("float32") float GetDampingRatio();

	/** The mouse joint does not support dumping. */
	public native void Dump();

	/** Implement b2Joint::ShiftOrigin */
	public native void ShiftOrigin(@Const @ByRef b2Vec2 newOrigin);
}
