package org.daniels.mer.storyed

class Character {
    String name
    Gender gender
    Race race
    String background
    String traits
    Story story
    String description

    Boolean important

    static hasMany = [participates: Plot]
    static belongsTo = [Story]
    static constraints = {
        name unique: true
        background nullable: true, blank: true
        gender defaultValue: Gender.OTHER
        race defaultValue: Race.HUMAN
        traits nullable: true, blank: true
        description nullable: true, blank: true
    }
}
