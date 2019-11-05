// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_inner_product Inner Product
 *  A primitive to compute an inner product.
 * 
 *  @see \ref c_api_inner_product in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class inner_product_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_forward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_inner_product_desc_t data(); public native desc data(mkldnn_inner_product_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc);

        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, src_desc, weights_desc, dst_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc weights_primitive_desc();
        public native @ByVal memory.primitive_desc bias_primitive_desc();
        public native @ByVal memory.primitive_desc dst_primitive_desc();
    }

    public inner_product_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at weights,
                @Const @ByRef primitive.at bias, @Const @ByRef memory dst) { super((Pointer)null); allocate(aprimitive_desc, src, weights, bias, dst); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at weights,
                @Const @ByRef primitive.at bias, @Const @ByRef memory dst);

    public inner_product_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at weights,
                @Const @ByRef memory dst) { super((Pointer)null); allocate(aprimitive_desc, src, weights, dst); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at weights,
                @Const @ByRef memory dst);
}
