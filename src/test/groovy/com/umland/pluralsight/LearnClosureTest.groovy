package com.umland.pluralsight

import spock.lang.Specification


class LearnClosureTest extends Specification {
    def 'Default message displayed'() {
        given:
        def lc = new LearnClosure()

        expect:
        null == lc.displayMessage()
    }

    def 'Default message displayed many times'() {
        given:
        def lc = new LearnClosure()

        expect:
        [1, 2, 3] == lc.displayMessageManyTimes(3)
    }

    def 'Default message displayed many even times'() {
        given:
        def lc = new LearnClosure()

        expect:
        [2, 4, 6, 8] == lc.displayMessageManyEvenTimes(8)
    }
}
