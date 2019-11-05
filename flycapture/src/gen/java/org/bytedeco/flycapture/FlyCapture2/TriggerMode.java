// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** A camera trigger. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class TriggerMode extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TriggerMode(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public TriggerMode(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public TriggerMode position(long position) {
            return (TriggerMode)super.position(position);
        }
    
        /** Flag controlling on/off. */
        public native @Cast("bool") boolean onOff(); public native TriggerMode onOff(boolean setter);
        /** Polarity value. */
        public native @Cast("unsigned int") int polarity(); public native TriggerMode polarity(int setter);
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native TriggerMode source(int setter);
        /** Mode value. */
        public native @Cast("unsigned int") int mode(); public native TriggerMode mode(int setter);
        /** Parameter value. */
        public native @Cast("unsigned int") int parameter(); public native TriggerMode parameter(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TriggerMode reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TriggerMode() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
