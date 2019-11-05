// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("google::protobuf::Map<google::protobuf::uint32,tensorflow::FunctionDef_ArgAttrs>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IntFunctionDef_ArgAttrsMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntFunctionDef_ArgAttrsMap(Pointer p) { super(p); }
    public IntFunctionDef_ArgAttrsMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef IntFunctionDef_ArgAttrsMap put(@ByRef IntFunctionDef_ArgAttrsMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef FunctionDef_ArgAttrs get(@Cast("google::protobuf::uint32") int i);
    public native IntFunctionDef_ArgAttrsMap put(@Cast("google::protobuf::uint32") int i, FunctionDef_ArgAttrs value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @Cast("google::protobuf::uint32") int first();
        public native @Name("operator*().second") @MemberGetter @ByRef @Const FunctionDef_ArgAttrs second();
    }
}

