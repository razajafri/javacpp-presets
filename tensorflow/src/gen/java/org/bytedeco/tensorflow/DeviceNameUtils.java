// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// In TensorFlow a device name is a string of the following form:
//   /job:<name>/replica:<replica>/task:<task>/device:<type>:<device_num>
//
// <name> is a short identifier conforming to the regexp
//     [a-zA-Z][_a-zA-Z]*
// <type> is a supported device type (e.g. 'cpu' or 'gpu')
// <replica>, <task>, <device_num> are small non-negative integers and are
// densely allocated (except in tests).
//
// For some purposes, we also allow device patterns, which can specify
// some or none of the specific fields above, with missing components,
// or "<component>:*" indicating "any value allowed for that component.
//
// For example:
//   "/job:param_server"   - Consider any devices in the "param_server" job
//   "/device:cpu:*"       - Consider any cpu devices in any job/task/replica
//   "/job:*/replica:*/task:*/device:cpu:*"  - Consider any cpu devices in any
//                                             job/task/replica
//   "/job:w/replica:0/task:0/device:gpu:*"  - Consider any gpu devices in
//                                             replica 0, task 0, of job "w"
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceNameUtils extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeviceNameUtils() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceNameUtils(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceNameUtils(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeviceNameUtils position(long position) {
        return (DeviceNameUtils)super.position(position);
    }

  // Returns a fully qualified device name given the parameters.
  public static native @StdString BytePointer FullName(@StdString BytePointer job, int replica, int task,
                           @StdString BytePointer type, int id);
  public static native @StdString String FullName(@StdString String job, int replica, int task,
                           @StdString String type, int id);

  public static class ParsedName extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public ParsedName() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public ParsedName(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ParsedName(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public ParsedName position(long position) {
          return (ParsedName)super.position(position);
      }
  
    public native void Clear();

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ParsedName other);

    public native @Cast("bool") boolean has_job(); public native ParsedName has_job(boolean setter);
    public native @StdString BytePointer job(); public native ParsedName job(BytePointer setter);
    public native @Cast("bool") boolean has_replica(); public native ParsedName has_replica(boolean setter);
    public native int replica(); public native ParsedName replica(int setter);
    public native @Cast("bool") boolean has_task(); public native ParsedName has_task(boolean setter);
    public native int task(); public native ParsedName task(int setter);
    public native @Cast("bool") boolean has_type(); public native ParsedName has_type(boolean setter);
    public native @StdString BytePointer type(); public native ParsedName type(BytePointer setter);
    public native @Cast("bool") boolean has_id(); public native ParsedName has_id(boolean setter);
    public native int id(); public native ParsedName id(int setter);
  }
  // Parses "fullname" into "*parsed". Returns true iff succeeds.
  // Legacy names like "/cpu:0" that don't contain "device",
  // are parsed to mean their current counterparts "/device:CPU:0". More
  // specifically, the lower case "cpu" and "gpu" is capitalized and "device"
  // is added. "/tpu:0" is not treated the same way - it has use the current
  // full syntax.
  // Also, note that lower case "cpu" and "gpu" device types in current syntax
  // are not capitalized. For example, "/device:CPU:0" is different from
  // "/device:cpu:0"
  public static native @Cast("bool") boolean ParseFullName(@StringPiece BytePointer fullname, ParsedName parsed);
  public static native @Cast("bool") boolean ParseFullName(@StringPiece String fullname, ParsedName parsed);

  // Canonicalizes "fullname" into "*canonical_name". Uses a fully specified
  // basename to fill in fields that are missing. Accepts both legacy, newer
  // and local versions of the device spec. Returns the newer version of the
  // device spec. If we were unable to interpret / parse "fullname" returns
  // an error and *canonical_name is set to "".
  public static native @ByVal Status CanonicalizeDeviceName(@StringPiece BytePointer fullname,
                                         @StringPiece BytePointer basename,
                                         @StdString @Cast({"char*", "std::string*"}) BytePointer canonical_name);
  public static native @ByVal Status CanonicalizeDeviceName(@StringPiece String fullname,
                                         @StringPiece String basename,
                                         @StdString @Cast({"char*", "std::string*"}) BytePointer canonical_name);

  // Returns true if "name" specifies any non-trivial constraint on the device.
  public static native @Cast("bool") boolean HasSomeDetails(@Const @ByRef ParsedName name);

  // Returns true if more_specific is a specification of
  // less_specific, i.e. everywhere that less-specific has a
  // non-wildcard component value, more_specific has the same value
  // for that component.
  public static native @Cast("bool") boolean IsSpecification(@Const @ByRef ParsedName less_specific,
                                @Const @ByRef ParsedName more_specific);

  // Makes minimal changes to more_specific so that it becomes a
  // specification of less_specific.
  public static native void EnsureSpecification(ParsedName more_specific,
                                    @Const @ByRef ParsedName less_specific);

  // Like IsSpecification, but the second argument "name" must have a
  // non-wildcard value for all of its components.
  public static native @Cast("bool") boolean IsCompleteSpecification(@Const @ByRef ParsedName pattern,
                                        @Const @ByRef ParsedName name);

  // True iff there exists any possible complete device name that is
  // a specification of both "a" and "b".
  public static native @Cast("bool") boolean AreCompatibleDevNames(@Const @ByRef ParsedName a,
                                             @Const @ByRef ParsedName b);

  // Merges the device specifications in "*target" and "other", and
  // stores the result in "*target". Returns OK if "*target" and
  // "other" are compatible, otherwise returns an error.
  public static native @ByVal Status MergeDevNames(ParsedName target, @Const @ByRef ParsedName other);
  public static native @ByVal Status MergeDevNames(ParsedName target, @Const @ByRef ParsedName other,
                                @Cast("bool") boolean allow_soft_placement);
  // Same as MergeDevNames with allow_soft_placement=true, but instead of
  // clearing conflicting fields, overrides them with `other`'s values.
  public static native @ByVal Status MergeOverrideDevNames(ParsedName target,
                                        @Const @ByRef ParsedName other);

  // Returns true iff devices identified by 'src' and 'dst' are in the
  // same address space.
  public static native @Cast("bool") boolean IsSameAddressSpace(@StringPiece BytePointer src, @StringPiece BytePointer dst);
  public static native @Cast("bool") boolean IsSameAddressSpace(@StringPiece String src, @StringPiece String dst);
  public static native @Cast("bool") boolean IsSameAddressSpace(@Const @ByRef ParsedName src, @Const @ByRef ParsedName dst);

  // Returns true iff devices identified by 'a' and 'b' are in different
  // address space.
  public static native @Cast("bool") boolean IsDifferentAddressSpace(@Const @ByRef ParsedName a, @Const @ByRef ParsedName b);

  // Returns the an address space specification containing only the
  // job/replica/task of the given name.
  public static native @Const @ByVal ParsedName AddressSpace(@Const @ByRef ParsedName name);

  // Returns the local device given its "type" and "id".
  public static native @StdString BytePointer LocalName(@StringPiece BytePointer type, int id);
  public static native @StdString String LocalName(@StringPiece String type, int id);

  // Returns a short local device name (cpu:0, gpu:1, etc) based on
  // the given fullname.
  public static native @StdString BytePointer LocalName(@StringPiece BytePointer fullname);
  public static native @StdString String LocalName(@StringPiece String fullname);

  // If "name" is a valid local device name (cpu:0, gpu:1, etc.),
  // fills in parsed.type and parsed.id accordingly. Returns true iff
  // succeeds.
  public static native @Cast("bool") boolean ParseLocalName(@StringPiece BytePointer name, ParsedName parsed);
  public static native @Cast("bool") boolean ParseLocalName(@StringPiece String name, ParsedName parsed);

  // Splits a fully-qualified device name into a task identifier and a
  // relative device identifier. It first parses "name" using
  // ParseFullName(), then assigns *task with everything except for
  // the local device component, and assigns the relative device
  // component into *device.  This function will still return true if
  // the task component is empty, but it requires the relative device
  // component to be fully specified.
  public static native @Cast("bool") boolean SplitDeviceName(@StringPiece BytePointer name, @StdString @Cast({"char*", "std::string*"}) BytePointer task, @StdString @Cast({"char*", "std::string*"}) BytePointer device);
  public static native @Cast("bool") boolean SplitDeviceName(@StringPiece String name, @StdString @Cast({"char*", "std::string*"}) BytePointer task, @StdString @Cast({"char*", "std::string*"}) BytePointer device);

  // Get the task name from ParsedName. Return false if the task component is
  // not fully specified.
  public static native @Cast("bool") boolean GetTaskName(@Const @ByRef ParsedName pn, @StdString @Cast({"char*", "std::string*"}) BytePointer task);

  public static native @StdString BytePointer ParsedNameToString(@Const @ByRef ParsedName pn);

  // Returns canonical and legacy full names for the given parsed
  // device name 'pn'. The returned string names are often useful to
  // look up devices from a mapping.
  public static native @ByVal StringVector GetNamesForDeviceMappings(@Const @ByRef ParsedName pn);

  // Returns canonical and legacy local names for the given parsed device name
  // 'pn'. The returned string names are often useful to look up devices from a
  // mapping.
  public static native @ByVal StringVector GetLocalNamesForDeviceMappings(
        @Const @ByRef ParsedName pn);

  // Returns name of the CPU:0 device on the same host as the device
  // `device_name`.
  public static native @ByVal Status DeviceNameToCpuDeviceName(@StdString BytePointer device_name,
                                            @StdString @Cast({"char*", "std::string*"}) BytePointer host_device_name);
  public static native @ByVal Status DeviceNameToCpuDeviceName(@StdString String device_name,
                                            @StdString @Cast({"char*", "std::string*"}) BytePointer host_device_name);
}
