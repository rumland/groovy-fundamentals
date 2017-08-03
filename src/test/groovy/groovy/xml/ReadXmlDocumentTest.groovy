package groovy.xml

import org.spockframework.util.Assert
import spock.lang.Specification

class ReadXmlDocumentTest extends Specification {
    def 'Can read XML document'() {
        given:
        def clazz = this.getClass()
        def simpleName = clazz.getSimpleName()
        def resourcePath = "/" + clazz.getCanonicalName().replace('.', '/').replace(simpleName, "")
        def resourceAsStream = clazz.getResourceAsStream(resourcePath + "fells_loop.gpx")
        Assert.notNull(resourceAsStream)
        def readXmlDoc = new ReadXmlDocument(resourceAsStream)

        expect:
        resourceAsStream != null
        readXmlDoc != null

        println readXmlDoc.getXmlData()
    }
}
