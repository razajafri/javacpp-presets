// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IShapeLayer
 * 
 *  \brief Layer type for getting shape of a tensor.
 * 
 *  This class sets the output to a one-dimensional tensor with the dimensions of the input tensor.
 * 
 *  For example, if the input is a four-dimensional tensor (of any type) with
 *  dimensions [2,3,5,7], the output tensor is a one-dimensional Int32 tensor
 *  of length 4 containing the sequence 2, 3, 5, 7.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IShapeLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IShapeLayer(Pointer p) { super(p); }

}
