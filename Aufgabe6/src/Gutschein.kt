import java.beans.Introspector

fun main() {
    gutschein("Saskia", 100)
    gutschein("Markus", 20)
    gutschein("Dodo", 80)
    gutschein("Milo", 1000)
}

fun gutschein(name: String, payMoney: Int) {
    // if (payMoney in 0..50)
    if (payMoney > 50 && payMoney <= 100) {
        println("$name hat für $payMoney bezahlt und bekommt ein Gutschein füt 10 €")
    } else if (payMoney > 100) {
        println("$name hat für $payMoney bezahlt und bekommt ein Gutschein füt 20 €")
    } else {
        println("$name hat für $payMoney bezahlt und bekommt kein Gutschein.")
    }
}


