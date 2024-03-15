enum class Days {
    Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье;
    fun Vday(){
        var n: Int
            println("введите номер дня недели")
            n = readLine()!!.toInt()
            if(n<1||n>7){println("такого дня нет")}
        else{
                when (n){
                    1-> println(Days.Понедельник)
                    2-> println(Days.Вторник)
                    3-> println(Days.Среда)
                    4-> println(Days.Четверг)
                    5-> println(Days.Пятница)
                    6-> println(Days.Суббота)
                    7-> println(Days.Воскресенье)
                }
        }
    }
    fun Workdays(){
        var n: Int
            println("введите номер дня недели, чтобы узнать рабочий он или нет")
            n = readln()!!.toInt()
            if(n<1 || n>7){
                println("такого дня нет")
        }else{
                when(n){
                    1->println("${Days.Понедельник} - Рабочий день")
                    2->println("${Days.Вторник} - Рабочий день")
                    3->println("${Days.Среда} - Рабочий день")
                    4->println("${Days.Четверг} - Рабочий день")
                    5->println("${Days.Пятница} - Рабочий день")
                    6->println("${Days.Суббота} - Выходной день")
                    7->println("${Days.Воскресенье} - Выходной день")
                }
        }

    }
    fun Random() : Days{
        println("случайный день недели:")
        return values().random()
    }
}