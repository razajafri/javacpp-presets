// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Define structure to hold file image callbacks */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5FD_file_image_callbacks_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5FD_file_image_callbacks_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5FD_file_image_callbacks_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5FD_file_image_callbacks_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5FD_file_image_callbacks_t position(long position) {
        return (H5FD_file_image_callbacks_t)super.position(position);
    }

    public static class Image_malloc_long_int_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Image_malloc_long_int_Pointer(Pointer p) { super(p); }
        protected Image_malloc_long_int_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(@Cast("size_t") long size, @Cast("H5FD_file_image_op_t") int file_image_op, 
                                Pointer udata);
    }
    public native Image_malloc_long_int_Pointer image_malloc(); public native H5FD_file_image_callbacks_t image_malloc(Image_malloc_long_int_Pointer setter);
    public static class Image_memcpy_Pointer_Pointer_long_int_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Image_memcpy_Pointer_Pointer_long_int_Pointer(Pointer p) { super(p); }
        protected Image_memcpy_Pointer_Pointer_long_int_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer dest, @Const Pointer src, @Cast("size_t") long size,
                                @Cast("H5FD_file_image_op_t") int file_image_op, Pointer udata);
    }
    public native Image_memcpy_Pointer_Pointer_long_int_Pointer image_memcpy(); public native H5FD_file_image_callbacks_t image_memcpy(Image_memcpy_Pointer_Pointer_long_int_Pointer setter);
    public static class Image_realloc_Pointer_long_int_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Image_realloc_Pointer_long_int_Pointer(Pointer p) { super(p); }
        protected Image_realloc_Pointer_long_int_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer ptr, @Cast("size_t") long size, 
                                @Cast("H5FD_file_image_op_t") int file_image_op, Pointer udata);
    }
    public native Image_realloc_Pointer_long_int_Pointer image_realloc(); public native H5FD_file_image_callbacks_t image_realloc(Image_realloc_Pointer_long_int_Pointer setter);
    public static class Image_free_Pointer_int_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Image_free_Pointer_int_Pointer(Pointer p) { super(p); }
        protected Image_free_Pointer_int_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(Pointer ptr, @Cast("H5FD_file_image_op_t") int file_image_op, 
                              Pointer udata);
    }
    public native Image_free_Pointer_int_Pointer image_free(); public native H5FD_file_image_callbacks_t image_free(Image_free_Pointer_int_Pointer setter);
    public static class Udata_copy_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Udata_copy_Pointer(Pointer p) { super(p); }
        protected Udata_copy_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer udata);
    }
    public native Udata_copy_Pointer udata_copy(); public native H5FD_file_image_callbacks_t udata_copy(Udata_copy_Pointer setter);
    public static class Udata_free_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Udata_free_Pointer(Pointer p) { super(p); }
        protected Udata_free_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("herr_t") int call(Pointer udata);
    }
    public native Udata_free_Pointer udata_free(); public native H5FD_file_image_callbacks_t udata_free(Udata_free_Pointer setter);
    public native Pointer udata(); public native H5FD_file_image_callbacks_t udata(Pointer setter);
}
