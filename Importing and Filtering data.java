//Md Shah Naim Hredoy
//hridhowlader@gmail.com

//after imporint data e.g., Landsat or MODIS etc. select the area of interest as aoi and declaring it as a variable
//filtering by methadata and date

var aoi= l8.filterBounds(area)        
        .filterMetadata("CLOUD_COVER", "less_than", 3)
        .filterDate("2019-06-01","2020-01-01");

//pring all images and their size
print(aoi);
print (aoi.size());

//select the median pixel value from all images
var median= aoi.median();

//map visualization where vision is my custom band combination
Map.addLayer(median, vision,"My map",true, 1)
