package groovy.xml

class GpxDocument {
    private def data

    GpxDocument(InputStream inputStream) {
        def readXmlDocument = new ReadXmlDocument(inputStream)
        data = readXmlDocument.getXmlData()
    }

    def getName() {
        data.name
    }

    def getCreator() {
        data.@creator
    }

    def getDescription() {
        data.desc
    }

    def getVersion() {
        data.@version
    }

    List<Tuple> getAllRoutePoints() {
        List<Tuple> latLongtime = new ArrayList<>()
        data.rte.rtept.each {
            latLongtime.add(new Tuple(it.@lat, it.@lon, it.time))
        }

        return latLongtime
    }
}
