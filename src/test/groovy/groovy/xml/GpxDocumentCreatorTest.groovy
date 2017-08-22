package groovy.xml

import org.spockframework.util.Assert
import spock.lang.Shared
import spock.lang.Specification


class GpxDocumentCreatorTest extends Specification {
    def @Shared gpxDocCreator

    def setupSpec() {
        def clazz = this.getClass()
        def simpleName = clazz.getSimpleName()
        def resourcePath = "/" + clazz.getCanonicalName().replace('.', '/').replace(simpleName, "")
        def inputStream = clazz.getResourceAsStream(resourcePath + "fells_loop.gpx")
        Assert.notNull(inputStream)
        def gpxDoc = new GpxDocument(inputStream)
        Assert.notNull(gpxDoc)
        gpxDocCreator = new GpxDocumentCreator(gpxDoc)
    }

    def 'Can write truncated route to file'() {
        given:
        def tempFile = File.createTempFile("prefix", "suffix")
        gpxDocCreator.writeOnlyRouteToFile(tempFile)

        expect:
        tempFile.exists()
        tempFile.size() != 0
        1 == 1

        cleanup:
        tempFile.delete()
    }
}
