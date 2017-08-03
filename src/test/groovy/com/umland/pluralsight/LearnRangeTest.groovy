package com.umland.pluralsight

import spock.lang.Specification

class LearnRangeTest extends Specification {
    def 'Get numbers 1 through 10'() {
        given:
        def lr = new LearnRange()

        expect:
        def numbers = lr.getOneThroughTen()
        for (number in numbers) {
            println number
        }
        1..10 == numbers
    }

    def 'Get letters a through g'() {
        given:
        def lr = new LearnRange()

        expect:
        def letters = lr.getAThroughG()
        for (letter in letters) {
            println letter
        }
        'a'..'g' == letters
    }

    def 'Get weekdays'() {
        given:
        def lr = new LearnRange()

        expect:
        def weekdays = lr.getWeekdays()
        for (day in weekdays) {
            println day
        }
        DAYS.MON..DAYS.FRI == weekdays
    }

    def 'Get first weekday'() {
        given:
        def lr = new LearnRange()

        expect:
        DAYS.MON == lr.getFirstWeekDay()
    }

    def 'Get last weekday'() {
        given:
        def lr = new LearnRange()

        expect:
        DAYS.FRI == lr.getLastWeekDay()
    }
}
