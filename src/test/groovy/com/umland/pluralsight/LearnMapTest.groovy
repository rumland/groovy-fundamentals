package com.umland.pluralsight

import spock.lang.Specification

class LearnMapTest extends Specification {
    def 'Delete entry from map'() {
        given:
        def m = [prop1: "prop1v", prop2: "prop2v", prop3: "prop3v"]

        when: 'A property is deleted'
        m.remove('prop1')

        then: 'Property should not be in map'
        m == [prop2: "prop2v", prop3: "prop3v"]
    }
}
