// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;

// #endif

/**
 * \defgroup LLVMCLinkTimeOptimizer Link Time Optimization
 * \ingroup LLVMC
 *
 * \{
 */

  /** This provides a dummy type for pointers to the LTO object. */
  @Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class llvm_lto_t extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public llvm_lto_t() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public llvm_lto_t(Pointer p) { super(p); }
  }
