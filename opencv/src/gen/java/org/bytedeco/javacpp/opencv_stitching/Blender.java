// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_objdetect.opencv_objdetect.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_ml.*;
import static org.bytedeco.javacpp.opencv_ml.opencv_ml.*;
import org.bytedeco.javacpp.opencv_shape.*;
import static org.bytedeco.javacpp.opencv_shape.opencv_shape.*;
import org.bytedeco.javacpp.opencv_xfeatures2d.*;
import static org.bytedeco.javacpp.opencv_xfeatures2d.opencv_xfeatures2d.*;

import static org.bytedeco.javacpp.opencv_stitching.opencv_stitching.*;


/** \addtogroup stitching_blend
 *  \{
<p>
/** \brief Base class for all blenders.
<p>
Simple blender which puts one image over another
*/
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.javacpp.opencv_stitching.opencv_stitching_presets.class)
public class Blender extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Blender() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Blender(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Blender(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Blender position(long position) {
        return (Blender)super.position(position);
    }


    /** enum cv::detail::Blender:: */
    public static final int NO = 0, FEATHER = 1, MULTI_BAND = 2;
    public static native @Ptr Blender createDefault(int type, @Cast("bool") boolean try_gpu/*=false*/);
    public static native @Ptr Blender createDefault(int type);

    /** \brief Prepares the blender for blending.
    <p>
    @param corners Source images top-left corners
    @param sizes Source image sizes
     */
    public native void prepare(@Const @ByRef PointVector corners, @Const @ByRef SizeVector sizes);
    /** \overload */
    public native void prepare(@ByVal Rect dst_roi);
    /** \brief Processes the image.
    <p>
    @param img Source image
    @param mask Source image mask
    @param tl Source image top-left corners
     */
    public native void feed(@ByVal Mat img, @ByVal Mat mask, @ByVal Point tl);
    public native void feed(@ByVal UMat img, @ByVal UMat mask, @ByVal Point tl);
    public native void feed(@ByVal GpuMat img, @ByVal GpuMat mask, @ByVal Point tl);
    /** \brief Blends and returns the final pano.
    <p>
    @param dst Final pano
    @param dst_mask Final pano mask
     */
    public native void blend(@ByVal Mat dst,@ByVal Mat dst_mask);
    public native void blend(@ByVal UMat dst,@ByVal UMat dst_mask);
    public native void blend(@ByVal GpuMat dst,@ByVal GpuMat dst_mask);
}