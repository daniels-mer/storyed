package org.daniels.mer.storyed

class Plot {
    String short_desc
    String description

    Story story

    static belongsTo = [Story, Character]
    static hasMany = [previousPlots: Plot, involved: Character]

    static constraints = {
        short_desc unique: true, blank: false
        description nullable: true, black: true
        previousPlots nullable : true
        involved nullable : true
    }
}
