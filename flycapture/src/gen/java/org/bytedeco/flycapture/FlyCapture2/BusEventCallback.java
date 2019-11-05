// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * Bus event callback function prototype. Defines the syntax of the
     * callback function that is passed into RegisterCallback() and
     * UnregisterCallback(). It is recommended that minimal handling be
     * performed in this callback as it will block internal processing
     * of bus events until it returns.
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class BusEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    BusEventCallback(Pointer p) { super(p); }
        protected BusEventCallback() { allocate(); }
        private native void allocate();
        public native void call( Pointer pParameter, @Cast("unsigned int") int serialNumber );
    }
