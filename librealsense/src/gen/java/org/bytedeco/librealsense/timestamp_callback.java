// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    @Namespace("rs") @NoOffset @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class timestamp_callback extends rs_timestamp_callback {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public timestamp_callback(Pointer p) { super(p); }
    
        public timestamp_callback(@ByVal TimestampFunction on_event) { super((Pointer)null); allocate(on_event); }
        private native void allocate(@ByVal TimestampFunction on_event);

        public native void on_event(@ByVal rs_timestamp_data data);

        public native void release();
    }
