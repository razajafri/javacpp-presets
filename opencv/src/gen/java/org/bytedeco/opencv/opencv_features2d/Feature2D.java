// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;

import static org.bytedeco.opencv.global.opencv_features2d.*;



/************************************ Base Classes ************************************/

/** \brief Abstract base class for 2D image feature detectors and descriptor extractors
*/
// #ifdef __EMSCRIPTEN__
// #else
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class Feature2D extends Algorithm {
    static { Loader.load(); }
    /** Default native constructor. */
    public Feature2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Feature2D(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Feature2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Feature2D position(long position) {
        return (Feature2D)super.position(position);
    }


    /** \brief Detects keypoints in an image (first variant) or image set (second variant).
    <p>
    @param image Image.
    @param keypoints The detected keypoints. In the second variant of the method keypoints[i] is a set
    of keypoints detected in images[i] .
    @param mask Mask specifying where to look for keypoints (optional). It must be a 8-bit integer
    matrix with non-zero values in the region of interest.
     */
    public native void detect( @ByVal Mat image,
                                     @ByRef KeyPointVector keypoints,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask );
    public native void detect( @ByVal Mat image,
                                     @ByRef KeyPointVector keypoints );
    public native void detect( @ByVal UMat image,
                                     @ByRef KeyPointVector keypoints,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask );
    public native void detect( @ByVal UMat image,
                                     @ByRef KeyPointVector keypoints );
    public native void detect( @ByVal GpuMat image,
                                     @ByRef KeyPointVector keypoints,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask );
    public native void detect( @ByVal GpuMat image,
                                     @ByRef KeyPointVector keypoints );

    /** \overload
    @param images Image set.
    @param keypoints The detected keypoints. In the second variant of the method keypoints[i] is a set
    of keypoints detected in images[i] .
    @param masks Masks for each input image specifying where to look for keypoints (optional).
    masks[i] is a mask for images[i].
    */
    public native void detect( @ByVal MatVector images,
                             @ByRef KeyPointVectorVector keypoints,
                             @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector masks );
    public native void detect( @ByVal MatVector images,
                             @ByRef KeyPointVectorVector keypoints );
    public native void detect( @ByVal UMatVector images,
                             @ByRef KeyPointVectorVector keypoints,
                             @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector masks );
    public native void detect( @ByVal UMatVector images,
                             @ByRef KeyPointVectorVector keypoints );
    public native void detect( @ByVal GpuMatVector images,
                             @ByRef KeyPointVectorVector keypoints,
                             @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector masks );
    public native void detect( @ByVal GpuMatVector images,
                             @ByRef KeyPointVectorVector keypoints );

    /** \brief Computes the descriptors for a set of keypoints detected in an image (first variant) or image set
    (second variant).
    <p>
    @param image Image.
    @param keypoints Input collection of keypoints. Keypoints for which a descriptor cannot be
    computed are removed. Sometimes new keypoints can be added, for example: SIFT duplicates keypoint
    with several dominant orientations (for each orientation).
    @param descriptors Computed descriptors. In the second variant of the method descriptors[i] are
    descriptors computed for a keypoints[i]. Row j is the keypoints (or keypoints[i]) is the
    descriptor for keypoint j-th keypoint.
     */
    public native void compute( @ByVal Mat image,
                                      @ByRef KeyPointVector keypoints,
                                      @ByVal Mat descriptors );
    public native void compute( @ByVal UMat image,
                                      @ByRef KeyPointVector keypoints,
                                      @ByVal UMat descriptors );
    public native void compute( @ByVal GpuMat image,
                                      @ByRef KeyPointVector keypoints,
                                      @ByVal GpuMat descriptors );

    /** \overload
    <p>
    @param images Image set.
    @param keypoints Input collection of keypoints. Keypoints for which a descriptor cannot be
    computed are removed. Sometimes new keypoints can be added, for example: SIFT duplicates keypoint
    with several dominant orientations (for each orientation).
    @param descriptors Computed descriptors. In the second variant of the method descriptors[i] are
    descriptors computed for a keypoints[i]. Row j is the keypoints (or keypoints[i]) is the
    descriptor for keypoint j-th keypoint.
    */
    public native void compute( @ByVal MatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal MatVector descriptors );
    public native void compute( @ByVal UMatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal UMatVector descriptors );
    public native void compute( @ByVal GpuMatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal GpuMatVector descriptors );

    /** Detects keypoints and computes the descriptors */
    public native void detectAndCompute( @ByVal Mat image, @ByVal Mat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal Mat descriptors,
                                               @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute( @ByVal Mat image, @ByVal Mat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal Mat descriptors );
    public native void detectAndCompute( @ByVal UMat image, @ByVal UMat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal UMat descriptors,
                                               @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute( @ByVal UMat image, @ByVal UMat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal UMat descriptors );
    public native void detectAndCompute( @ByVal GpuMat image, @ByVal GpuMat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal GpuMat descriptors,
                                               @Cast("bool") boolean useProvidedKeypoints/*=false*/ );
    public native void detectAndCompute( @ByVal GpuMat image, @ByVal GpuMat mask,
                                               @ByRef KeyPointVector keypoints,
                                               @ByVal GpuMat descriptors );

    public native int descriptorSize();
    public native int descriptorType();
    public native int defaultNorm();

    public native void write( @Str BytePointer fileName );
    public native void write( @Str String fileName );

    public native void read( @Str BytePointer fileName );
    public native void read( @Str String fileName );

    public native @Override void write( @ByRef FileStorage arg0);

    // see corresponding cv::Algorithm method
    public native @Override void read( @Const @ByRef FileNode arg0);

    /** Return true if detector object is empty */
    public native @Cast("bool") @Override boolean empty();
    public native @Str @Override BytePointer getDefaultName();

    // see corresponding cv::Algorithm method
    public native void write(@Ptr FileStorage fs, @Str BytePointer name/*=cv::String()*/);
    public native void write(@Ptr FileStorage fs, @Str String name/*=cv::String()*/);
}
