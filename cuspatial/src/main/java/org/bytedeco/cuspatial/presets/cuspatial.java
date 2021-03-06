package org.bytedeco.cuspatial.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
    target = "org.bytedeco.cuspatial",
    global = "org.bytedeco.cuspatial.global.cuspatial",
    value = {
        @Platform(
            value = {
                "linux-x86_64"
            },
            include = {"<cudf/types.h>", "<cuspatial/coordinate_transform.hpp>",
                       "<cuspatial/hausdorff.hpp>", "<cuspatial/haversine.hpp>",
                       "<cuspatial/point_in_polygon.hpp>", "<cuspatial/query.hpp>",
                       "<cuspatial/shapefile_readers.hpp>", "<cuspatial/soa_readers.hpp>",
                       "<cuspatial/trajectory.hpp>", "<cuspatial/types.hpp>"},
            link = "cuspatial"
        )
    }
)
public class cuspatial implements InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "cuspatial"); }

    @Override
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("std::pair<gdf_column,gdf_column>").pointerTypes("ColumnPair").define());
    }
}
