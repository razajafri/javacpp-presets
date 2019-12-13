// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cudf;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cudf.global.cudf.*;

/**---------------------------------------------------------------------------*
 * \brief A non-owning, immutable view of device data as a column of elements,
 * some of which may be null as indicated by a bitmask.
 *
 * A {@code column_view_base} can be constructed implicitly from a {@code cudf::column}, or
 *may be constructed explicitly from a pointer to pre-existing device memory.
 *
 * Unless otherwise noted, the memory layout of the {@code column_view_base}'s data
 *and bitmask is expected to adhere to the Arrow Physical Memory Layout
 * Specification: https://arrow.apache.org/docs/memory_layout.html
 *
 * Because {@code column_view_base} is non-owning, no device memory is allocated nor
 *free'd when {@code column_view_base} objects are created or destroyed.
 *
 * To enable zero-copy slicing, a {@code column_view_base} has an {@code offset} that
 *indicates the index of the first element in the column relative to the base
 *device memory allocation. By default, {@code offset()} is zero.
 *
 *---------------------------------------------------------------------------**/
@Namespace("cudf::detail") @NoOffset @Properties(inherit = org.bytedeco.cudf.presets.cudf.class)
public class column_view_base extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public column_view_base(Pointer p) { super(p); }

  /**---------------------------------------------------------------------------*
   * \brief Returns pointer to the base device memory allocation casted to
   * the specified type.
   *
   * \note If {@code offset() == 0}, then {@code head<T>() == data<T>()}
   *
   * \note It should be rare to need to access the {@code head<T>()} allocation of
   *a column, and instead, accessing the elements should be done via
   *{@code data<T>()}.
   *
   * \tparam The type to cast to
   * @return T const* Typed pointer to underlying data
   *---------------------------------------------------------------------------**/

  /**---------------------------------------------------------------------------*
   * \brief Returns the underlying data casted to the specified type, plus the
   * offset.
   *
   * \note If {@code offset() == 0}, then {@code head<T>() == data<T>()}
   *
   * \TODO Clarify behavior for variable-width types.
   *
   * \tparam T The type to cast to
   * @return T const* Typed pointer to underlying data, including the offset
   *---------------------------------------------------------------------------**/

  /**---------------------------------------------------------------------------*
   * \brief Return first element (accounting for offset) after underlying data
   * is casted to the specified type.
   *
   * \tparam T The desired type
   * @return T const* Pointer to the first element after casting
   *---------------------------------------------------------------------------**/

  /**---------------------------------------------------------------------------*
   * \brief Return one past the last element after underlying data is casted to
   * the specified type.
   *
   * \tparam T The desired type
   * @return T const* Pointer to one past the last element after casting
   *---------------------------------------------------------------------------**/

  /**---------------------------------------------------------------------------*
   * \brief Returns the number of elements in the column
   *---------------------------------------------------------------------------**/
  public native @Cast("cudf::size_type") @NoException int size();

  /**---------------------------------------------------------------------------*
   * \brief Returns true if {@code size()} returns zero, or false otherwise
   *---------------------------------------------------------------------------**/
  public native @Cast("cudf::size_type") @NoException int is_empty();

  /**---------------------------------------------------------------------------*
   * \brief Returns the element {@code data_type}
   *---------------------------------------------------------------------------**/
  public native @ByVal @NoException data_type type();

  /**---------------------------------------------------------------------------*
   * \brief Indicates if the column can contain null elements, i.e., if it has
   * an allocated bitmask.
   *
   * \note If {@code null_count() > 0}, this function must always return {@code true}.
   *
   * @return true The bitmask is allocated
   * @return false The bitmask is not allocated
   *---------------------------------------------------------------------------**/
  public native @Cast("bool") @NoException boolean nullable();

  /**---------------------------------------------------------------------------*
   * \brief Returns the count of null elements
   *
   * \note If the column was constructed with {@code UNKNOWN_NULL_COUNT}, or if at any
   * point {@code set_null_count(UNKNOWN_NULL_COUNT)} was invoked, then the
   * first invocation of {@code null_count()} will compute and store the count of null
   * elements indicated by the {@code null_mask} (if it exists).
   *---------------------------------------------------------------------------**/
  public native @Cast("cudf::size_type") int null_count();

  /**---------------------------------------------------------------------------*
   * \brief Returns the count of null elements in the range [begin, end)
   *
   * \note If {@code null_count() != 0}, every invocation of {@code null_count(begin, end)}
   * will recompute the count of null elements indicated by the {@code null_mask} in
   * the range [begin, end).
   *
   * @throws {@code cudf::logic_error} for invalid range (if {@code begin < 0},
   * {@code begin > end}, {@code begin >= size()}, or {@code end > size()}).
   *
   * @param begin [in] The starting index of the range (inclusive).
   * @param end [in] The index of the last element in the range (exlusive).
   *---------------------------------------------------------------------------**/
  public native @Cast("cudf::size_type") int null_count(@Cast("cudf::size_type") int begin, @Cast("cudf::size_type") int end);

  /**---------------------------------------------------------------------------*
   * \brief Indicates if the column contains null elements,
   * i.e., {@code null_count() > 0}
   *
   * @return true One or more elements are null
   * @return false All elements are valid
   *---------------------------------------------------------------------------**/
  public native @Cast("bool") boolean has_nulls();

  /**---------------------------------------------------------------------------*
   * \brief Indicates if the column contains null elements in the range
   * [begin, end), i.e., {@code null_count(begin, end) > 0}
   *
   * @throws {@code cudf::logic_error} for invalid range (if {@code begin < 0},
   * {@code begin > end}, {@code begin >= size()}, or {@code end > size()}).
   *
   * @param begin The starting index of the range (inclusive).
   * @param end The index of the last element in the range (exlusive).
   * @return true One or more elements are null in the range [begin, end)
   * @return false All elements are valid in the range [begin, end)
   *---------------------------------------------------------------------------**/
  public native @Cast("bool") boolean has_nulls(@Cast("cudf::size_type") int begin, @Cast("cudf::size_type") int end);

  /**---------------------------------------------------------------------------*
   * \brief Returns raw pointer to the underlying bitmask allocation.
   *
   * \note This function does *not* account for the {@code offset()}.
   *
   * \note If {@code null_count() == 0}, this may return {@code nullptr}.
   *---------------------------------------------------------------------------**/
  public native @Cast("const cudf::bitmask_type*") @NoException IntPointer null_mask();

  /**---------------------------------------------------------------------------*
   * \brief Returns the index of the first element relative to the base memory
   * allocation, i.e., what is returned from {@code head<T>()}.
   *---------------------------------------------------------------------------**/
  public native @Cast("cudf::size_type") @NoException int offset();
}