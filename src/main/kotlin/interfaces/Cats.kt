package interfaces

interface Cats : Climber {
    override fun climb() {
        println(" climbs ${climberOf}")
    }
}