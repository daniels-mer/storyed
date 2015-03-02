package org.daniels.mer.storyed

class Story {
    String title
    String summary
    static hasMany = [plots: Plot, chars: Character]

    static constraints = {
        plots nullable: true
    }
}
