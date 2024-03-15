enum class Colors(val rgb: Int) {
    Красный(0xFF0000), Оранжевый(0xFF7F00), Жёлтый(0xFFFF00), Зелёный(0x00FF00), Голубой(0x0000FF), Синий(0x000080), Фиолетовый(0x800080);
    fun Rainbow() : List<Colors>{
        println("Цвета радуги:")
        return values().toList()
    }
    fun Vcolors(){
        var n: Int;
            println("введите какой цвет радуги хотите вывести (введите номер от 1 до 7)")
            n = readln()!!.toInt()
            if(n<1 || n> 7)
            { println("такого номера нет")
            }
            else{
                when(n){
                    1 -> println(Colors.Красный)
                    2 -> println(Colors.Оранжевый)
                    3 -> println(Colors.Жёлтый)
                    4 -> println(Colors.Зелёный)
                    5 -> println(Colors.Голубой)
                    6 -> println(Colors.Синий)
                    7 -> println(Colors.Фиолетовый)
                }
            }
    }
    fun Random():Colors {
        println("случайный цвет:")
        return values().random()
    }
}