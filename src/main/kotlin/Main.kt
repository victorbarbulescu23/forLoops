fun main() {
    var rand = 0
    var count = 0

    for (i in 0..2000){
        rand = (20..45).random()
        if (rand > 38){
            count++
        }
    }

    println("The number of times that the random number was greater than 38 was: $count")
}