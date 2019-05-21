// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppicom;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppicom.*;


/**
 * JPEG decode job used by \ref nppiJpegDecodeJob (see that for more documentation)
 *
 * The job describes piece of computation to be done.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppicom.class)
public class NppiJpegDecodeJob extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiJpegDecodeJob() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiJpegDecodeJob(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiJpegDecodeJob(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiJpegDecodeJob position(long position) {
        return (NppiJpegDecodeJob)super.position(position);
    }

    /** This field and its contents are never written */
    public native NppiJpegFrameDescr pFrame(); public native NppiJpegDecodeJob pFrame(NppiJpegFrameDescr setter);
    /** This field is never written. {@code *pScan} is written
                                     only by ...Create... functions */
    public native NppiJpegScanDescr pScan(); public native NppiJpegDecodeJob pScan(NppiJpegScanDescr setter);
    public native @Cast("NppiJpegDecodeJobKind") int eKind(); public native NppiJpegDecodeJob eKind(int setter);
}
