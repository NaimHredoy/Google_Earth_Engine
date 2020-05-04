var image= L8.filterBounds(area)
        .filterMetadata("CLOUD_COVER", "less_than", 3)
        .filterDate("2019-06-01","2020-01-01")
        .first();
print (image)        
var RED= image.select("B4");
var NIR=image.select("B5");

var NDVI=image.expression(
    "(NIR-RED)/(NIR+RED)",
    {
      "NIR":NIR,
      "RED":RED
    });
    
Map.addLayer(NDVI,imageVisParam,"NDVI");