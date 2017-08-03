package com.umland.pluralsight

class LearnRange {
    def getOneThroughTen() {
        1..10
    }

    def getAThroughG() {
        'a'..'g'
    }

    //Shows how ranges can be defined over any object that implements Comparable
    def getWeekdays() {
        DAYS.MON..DAYS.FRI
    }

    //Example of extents of range
    def getFirstWeekDay() {
        getWeekdays().from
    }

    //Example of extents of range
    def getLastWeekDay() {
        getWeekdays().to
    }
}
