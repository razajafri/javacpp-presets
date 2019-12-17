import org.bytedeco.cuspatial.*;
import org.bytedeco.javacpp.*;
import static org.bytedeco.cuspatial.global.cuspatial.*;

// original/native test code:
// https://github.com/rapidsai/cuspatial/blob/branch-0.12/cpp/tests/spatial/coordinate_transform_toy.cu


public class cuSpatialTest {

    public static void main(String[] args) {

        gdf_scalar x0 = new gdf_scalar();
        x0.data().fp64(-90.66511046);
        x0.dtype(GDF_FLOAT64);
        x0.is_valid(true);

        gdf_scalar y0 = new gdf_scalar();
        y0.data().fp64(42.49197018);
        y0.dtype(GDF_FLOAT64);
        y0.is_valid(true);

        double point_lon[] = { -90.664973, -90.665393, -90.664976, -90.664537 };
        DoublePointer point_lon_dp = new DoublePointer(point_lon);
        gdf_column point_lon_col = new gdf_column();
        point_lon_col.data(point_lon_dp);
        point_lon_col.size(point_lon.length);
        point_lon_col.dtype(GDF_FLOAT64);
        point_lon_col.null_count(0);
        byte point_lon_valid[] = { 0xF };
        BytePointer point_lon_bp = new BytePointer(point_lon_valid);
        point_lon_col.valid(point_lon_bp);
        

        double point_lat[] = { 42.493894, 42.491520, 42.491420, 42.493823 };
        DoublePointer point_lat_dp = new DoublePointer(point_lat);
        gdf_column point_lat_col = new gdf_column();
        point_lat_col.data(point_lat_dp);
        point_lat_col.size(point_lat.length);
        point_lat_col.dtype(GDF_FLOAT64);
        point_lat_col.null_count(0);
        byte point_lat_valid[] = { 0xF };
        BytePointer point_lat_bp = new BytePointer(point_lat_valid);
        point_lat_col.valid(point_lat_bp);

        System.out.println(point_lat_col);
        ColumnPair cp = lonlat_to_coord(x0, y0, point_lon_col, point_lat_col);

        System.out.println("PRINT TEST RESULT HERE!");
    }
}
