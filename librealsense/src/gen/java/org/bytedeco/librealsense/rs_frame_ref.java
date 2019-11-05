// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_frame_ref extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_frame_ref(Pointer p) { super(p); }

    public native @Cast("const uint8_t*") BytePointer get_frame_data();
    public native double get_frame_timestamp();
    public native @Cast("rs_timestamp_domain") int get_frame_timestamp_domain();
    public native @Cast("unsigned long long") long get_frame_number();
    public native long get_frame_system_time();
    public native int get_frame_width();
    public native int get_frame_height();
    public native int get_frame_framerate();
    public native int get_frame_stride();
    public native int get_frame_bpp();
    public native @Cast("rs_format") int get_frame_format();
    public native @Cast("rs_stream") int get_stream_type();
    public native double get_frame_metadata(@Cast("rs_frame_metadata") int frame_metadata);
    public native @Cast("bool") boolean supports_frame_metadata(@Cast("rs_frame_metadata") int frame_metadata);
}
