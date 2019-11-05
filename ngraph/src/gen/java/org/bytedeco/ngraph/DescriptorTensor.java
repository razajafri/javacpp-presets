// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        /** \brief Compile-time descriptor of a first-class value that is a tensor. */
        @Name("ngraph::descriptor::Tensor") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class DescriptorTensor extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public DescriptorTensor(Pointer p) { super(p); }
        

            public native @StdString BytePointer get_name();
            public native void set_tensor_type(@Const @ByRef Type element_type, @Const @ByRef PartialShape pshape);

            public native @Const @ByRef Type get_element_type();
            public native @Const @ByRef Shape get_shape();
            public native @Const @ByRef PartialShape get_partial_shape();
            public native @SharedPtr TensorLayout get_tensor_layout();

            

            public native void set_pool_offset(@Cast("size_t") long arg0);
            public native @Cast("size_t") long get_pool_offset();

            public native @Cast("size_t") long size();
        }
