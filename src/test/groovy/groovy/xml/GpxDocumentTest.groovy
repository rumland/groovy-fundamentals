package groovy.xml

import org.spockframework.util.Assert
import spock.lang.Shared
import spock.lang.Specification


class GpxDocumentTest extends Specification {
    def @Shared gpxDoc

    def setupSpec() {
        def clazz = this.getClass()
        def simpleName = clazz.getSimpleName()
        def resourcePath = "/" + clazz.getCanonicalName().replace('.', '/').replace(simpleName, "")
        def inputStream = clazz.getResourceAsStream(resourcePath + "fells_loop.gpx")
        Assert.notNull(inputStream)
        gpxDoc = new GpxDocument(inputStream)
        Assert.notNull(gpxDoc)
    }

    def 'Can read GPX name'() {
        expect:
        gpxDoc.getName() == "Middlesex Fells Bike Loop"
    }

    def 'Can read GPX creator'() {
        expect:
        gpxDoc.getCreator() == "ExpertGPS 1.1.1 - http://www.topografix.com"
    }

    def 'Can read GPX description'() {
        expect:
        gpxDoc.getDescription()
    }

    def 'Can read GPX version'() {
        expect:
        gpxDoc.getVersion() == "1.0"
    }

    def 'Can read all route points'() {
        given:
        List<Tuple> points = gpxDoc.getAllRoutePoints()

        expect:
        Assert.notNull(points)
        points.size() == 46
    }
}
