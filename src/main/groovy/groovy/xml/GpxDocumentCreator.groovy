package groovy.xml


class GpxDocumentCreator {
    private GpxDocument gpxDocument

    GpxDocumentCreator(GpxDocument gpxDocument) {
        this.gpxDocument = gpxDocument
    }

    def writeOnlyRouteToFile(File file) {
        List<Tuple> points = gpxDocument.getAllRoutePoints()
        def builder = new StreamingMarkupBuilder()
        def xml = builder.bind {
            route {
                mkp.comment("truncated route")
                points.each { point ->
                    routepoint(timestamp: point[2].toString()) {
                        latitude(point[0])
                        longitude(point[1])
                    }
                }
            }
        }

        file.write(xml.toString())
    }
}
