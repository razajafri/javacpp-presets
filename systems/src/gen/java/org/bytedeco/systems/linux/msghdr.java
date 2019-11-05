// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;



/* Structure describing messages sent by
   `sendmsg' and received by `recvmsg'.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class msghdr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public msghdr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public msghdr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public msghdr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public msghdr position(long position) {
        return (msghdr)super.position(position);
    }

    public native Pointer msg_name(); public native msghdr msg_name(Pointer setter);		/* Address to send to/receive from.  */
    public native @Cast("socklen_t") int msg_namelen(); public native msghdr msg_namelen(int setter);	/* Length of address data.  */

    public native iovec msg_iov(); public native msghdr msg_iov(iovec setter);	/* Vector of data to send/receive into.  */
    public native @Cast("size_t") long msg_iovlen(); public native msghdr msg_iovlen(long setter);		/* Number of elements in the vector.  */

    public native Pointer msg_control(); public native msghdr msg_control(Pointer setter);		/* Ancillary data (eg BSD filedesc passing). */
    public native @Cast("size_t") long msg_controllen(); public native msghdr msg_controllen(long setter);	/* Ancillary data buffer length.
				   !! The type should be socklen_t but the
				   definition of the kernel is incompatible
				   with this.  */

    public native int msg_flags(); public native msghdr msg_flags(int setter);		/* Flags on received message.  */
  }
