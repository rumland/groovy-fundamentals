package com.umland.pluralsight

import spock.lang.Specification
import spock.lang.Unroll

class LearnCollectionsTest extends Specification {
    def setupSpec() {
        def lc = new LearnCollections()
        def members =  lc.getBeatlesBandMemberNames()
        for (int idx = 0; idx < members.size(); ++idx) {
            def greeting = "Hola, "
            println "$greeting" + "${members[idx]}"
        }
    }

    @Unroll('#expectedName should match #actualName')
    def 'Correct set of Beatles band members'() {
        expect:
        def greeting = "Hello, "
        println "$greeting" + "$actualName"
        expectedName == actualName

        where:
        expectedName << ["John", "Paul", "George", "Ringo"]
        actualName << (new LearnCollections()).getBeatlesBandMemberNames()
    }
}
