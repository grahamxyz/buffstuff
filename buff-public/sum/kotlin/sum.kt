fun main(args: Array<String>) {
    var sum = 0
    for (i in 0..args.size-1) {
        sum += args[i].toInt()
    }
    println(sum)
}
