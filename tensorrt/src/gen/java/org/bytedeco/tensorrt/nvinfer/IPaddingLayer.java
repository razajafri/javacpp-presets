// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPaddingLayer
 * 
 *  \brief Layer that represents a padding operation.
 * 
 *  The padding layer adds zero-padding at the start and end of the input tensor. It only supports padding along the two
 *  innermost dimensions. Applying negative padding results in cropping of the input.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPaddingLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPaddingLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the padding that is applied at the start of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount
     * 
     *  @see getPrePadding
     *  */
    
    
    //!
    //!
    //!
    public native void setPrePadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding that is applied at the start of the tensor.
     * 
     *  @see setPrePadding
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal DimsHW getPrePadding();

    /**
     *  \brief Set the padding that is applied at the end of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount
     * 
     *  @see getPostPadding
     *  */
    
    
    //!
    //!
    //!
    public native void setPostPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding that is applied at the end of the tensor.
     * 
     *  @see setPostPadding
     *  */
    public native @ByVal DimsHW getPostPadding();
}
