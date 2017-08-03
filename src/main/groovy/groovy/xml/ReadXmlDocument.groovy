package groovy.xml

class ReadXmlDocument {
    private InputStream inputStream
    private XmlSlurper slurper

    ReadXmlDocument(InputStream inputStream) {
        slurper = new XmlSlurper()
        this.inputStream = inputStream
    }

    def getXmlData() {
        slurper.parse(inputStream)
    }
}
