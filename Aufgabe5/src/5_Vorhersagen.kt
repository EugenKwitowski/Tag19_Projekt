/*
* Schreibe hier deine Lösung hin: Die Ampel leuchtet grün, also dürfen die Autos jetzt fahren
*
* */

fun main() {
    var ampelPhase = "Grün"
    ampelPhase = ampel(ampelPhase)
    ampelPhase = ampel(ampelPhase)
    ampel(ampelPhase)
}

fun ampel(phase: String): String {
    var neuePhase: String = phase
    when (phase) {
        "Grün" -> {
            println("Die Ampel leuchtet grün, also dürfen die Autos jetzt fahren")
            neuePhase = "Gelb"
        }

        "Gelb" -> {
            println("Die Ampel leuchtet gelb, also müssen die Autos sich zum Anhalten bereit machen")
            neuePhase = "Rot"
        }

        "Rot" -> {
            println("Die Ampel leuchtet rot, also müssen die Autos warten")
            neuePhase = "Grün"
        }
    }
    return neuePhase
}