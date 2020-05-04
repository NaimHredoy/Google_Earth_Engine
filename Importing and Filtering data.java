var aoi= l8.filterBounds(area)
        .filterMetadata("CLOUD_COVER", "less_than", 3)
        .filterDate("2019-06-01","2020-01-01");
        
print(aoi);
print (aoi.size());
var median= aoi.median();
Map.addLayer(median, vision,"My map",true, 1)