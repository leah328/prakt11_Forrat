fun main(args: Array<String>) {
    try {
        var ans: String
        println("выберите класс: День или Цвет?")
        ans = readLine()!!.toString()
        if (ans == "Цвет" || ans == "День") {
            when (ans) {
                "Цвет" -> {
                    var Color: Colors = Colors.Красный
                    println(Color.Rainbow())
                    Color.Vcolors()
                    println(Color.Random())
                }

                "День" -> {
                    var Day: Days = Days.Понедельник
                    Day.Vday()
                    Day.Workdays()
                    println(Day.Random())
                }
            }
        } else {
            println("неверно введено значение")
        }
    }catch(e:Exception){println("error")}
}