// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/** An instance of a filter */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterContext position(long position) {
        return (AVFilterContext)super.position(position);
    }

    /** needed for av_log() and filters common options */
    public native @Const AVClass av_class(); public native AVFilterContext av_class(AVClass setter);

    /** the AVFilter of which this is an instance */
    public native @Const AVFilter filter(); public native AVFilterContext filter(AVFilter setter);

    /** name of this filter instance */
    public native @Cast("char*") BytePointer name(); public native AVFilterContext name(BytePointer setter);

    /** array of input pads */
    public native AVFilterPad input_pads(); public native AVFilterContext input_pads(AVFilterPad setter);
    /** array of pointers to input links */
    public native AVFilterLink inputs(int i); public native AVFilterContext inputs(int i, AVFilterLink setter);
    public native @Cast("AVFilterLink**") PointerPointer inputs(); public native AVFilterContext inputs(PointerPointer setter);
    /** number of input pads */
    public native @Cast("unsigned") int nb_inputs(); public native AVFilterContext nb_inputs(int setter);

    /** array of output pads */
    public native AVFilterPad output_pads(); public native AVFilterContext output_pads(AVFilterPad setter);
    /** array of pointers to output links */
    public native AVFilterLink outputs(int i); public native AVFilterContext outputs(int i, AVFilterLink setter);
    public native @Cast("AVFilterLink**") PointerPointer outputs(); public native AVFilterContext outputs(PointerPointer setter);
    /** number of output pads */
    public native @Cast("unsigned") int nb_outputs(); public native AVFilterContext nb_outputs(int setter);

    /** private data for use by the filter */
    public native Pointer priv(); public native AVFilterContext priv(Pointer setter);

    /** filtergraph this filter belongs to */
    public native AVFilterGraph graph(); public native AVFilterContext graph(AVFilterGraph setter);

    /**
     * Type of multithreading being allowed/used. A combination of
     * AVFILTER_THREAD_* flags.
     *
     * May be set by the caller before initializing the filter to forbid some
     * or all kinds of multithreading for this filter. The default is allowing
     * everything.
     *
     * When the filter is initialized, this field is combined using bit AND with
     * AVFilterGraph.thread_type to get the final mask used for determining
     * allowed threading types. I.e. a threading type needs to be set in both
     * to be allowed.
     *
     * After the filter is initialized, libavfilter sets this field to the
     * threading type that is actually used (0 for no multithreading).
     */
    public native int thread_type(); public native AVFilterContext thread_type(int setter);

    /**
     * An opaque struct for libavfilter internal use.
     */
    public native AVFilterInternal internal(); public native AVFilterContext internal(AVFilterInternal setter);

    public native @Cast("AVFilterCommand*") Pointer command_queue(); public native AVFilterContext command_queue(Pointer setter);

    /** enable expression string */
    public native @Cast("char*") BytePointer enable_str(); public native AVFilterContext enable_str(BytePointer setter);
    /** parsed expression (AVExpr*) */
    public native Pointer enable(); public native AVFilterContext enable(Pointer setter);
    /** variable values for the enable expression */
    public native DoublePointer var_values(); public native AVFilterContext var_values(DoublePointer setter);
    /** the enabled state from the last expression evaluation */
    public native int is_disabled(); public native AVFilterContext is_disabled(int setter);

    /**
     * For filters which will create hardware frames, sets the device the
     * filter should create them in.  All other filters will ignore this field:
     * in particular, a filter which consumes or processes hardware frames will
     * instead use the hw_frames_ctx field in AVFilterLink to carry the
     * hardware context information.
     */
    public native AVBufferRef hw_device_ctx(); public native AVFilterContext hw_device_ctx(AVBufferRef setter);

    /**
     * Max number of threads allowed in this filter instance.
     * If <= 0, its value is ignored.
     * Overrides global number of threads set per filter graph.
     */
    public native int nb_threads(); public native AVFilterContext nb_threads(int setter);

    /**
     * Ready status of the filter.
     * A non-0 value means that the filter needs activating;
     * a higher value suggests a more urgent activation.
     */
    public native @Cast("unsigned") int ready(); public native AVFilterContext ready(int setter);

    /**
     * Sets the number of extra hardware frames which the filter will
     * allocate on its output links for use in following filters or by
     * the caller.
     *
     * Some hardware filters require all frames that they will use for
     * output to be defined in advance before filtering starts.  For such
     * filters, any hardware frame pools used for output must therefore be
     * of fixed size.  The extra frames set here are on top of any number
     * that the filter needs internally in order to operate normally.
     *
     * This field must be set before the graph containing this filter is
     * configured.
     */
    public native int extra_hw_frames(); public native AVFilterContext extra_hw_frames(int setter);
}
