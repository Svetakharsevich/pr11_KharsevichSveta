fun main() {
    println(ColorType.values().asList())
    println(Week.values().asList())
    var Monday=Week.Monday
    var ColorMonday= ColorType.PeachPuff
    println(Monday.DayName())
    println(ColorMonday.ColorName())
    println(ColorMonday.rgb)
    if(ColorMonday.DayoftheWeek()) println("День недели - ${ Monday.Numeric()} день")
    else println("Такого дня нет")
    if(Monday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorMonday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Monday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Tuesday=Week.Tuesday
    var ColorTuesday= ColorType.Plum
    println(Tuesday.DayName())
    println(ColorTuesday.ColorName())
    println(ColorTuesday.rgb)
    if(ColorTuesday.DayoftheWeek()) println("День недели - ${Tuesday.Numeric()} день")
    else println("Такого дня нет")
    if(Tuesday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorTuesday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Tuesday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Wednesday=Week.Wednesday
    var ColorWednesday= ColorType.SkyBlue
    println(Wednesday.DayName())
    println(ColorWednesday.ColorName())
    println(ColorWednesday.rgb)
    if(ColorWednesday.DayoftheWeek()) println("День недели - ${Wednesday.Numeric()} день")
    else println("Такого дня нет")
    if(Wednesday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorWednesday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Wednesday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Thursday=Week.Thursday
    var ColorThursday= ColorType.White
    println(Thursday.DayName())
    println(ColorThursday.ColorName())
    println(ColorThursday.rgb)
    if(ColorThursday.DayoftheWeek())println("День недели - ${Thursday.Numeric()} день")
    else println("Такого дня нет")
    if(Thursday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorThursday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Thursday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Friday=Week.Friday
    var ColorFriday= ColorType.Green
    println(Friday.DayName())
    println(ColorFriday.ColorName())
    println(ColorFriday.rgb)
    if(ColorFriday.DayoftheWeek()) println("День недели - ${Friday.Numeric()} день")
    else println("Такого дня нет")
    if(Friday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorFriday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Friday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Saturday=Week.Saturday
    var ColorSaturday= ColorType.Tomato
    println(Saturday.DayName())
    println(ColorSaturday.ColorName())
    println(ColorSaturday.rgb)
    if(ColorSaturday.DayoftheWeek()) println("День недели - ${Saturday.Numeric()} день")
    else println("Такого дня нет")
    if(Saturday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorSaturday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Saturday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

    var Sunday=Week.Sunday
    var ColorSunday= ColorType.HotPink
    println(Sunday.DayName())
    println(ColorSunday.ColorName())
    println(ColorSunday.rgb)
    if(ColorSunday.DayoftheWeek())  println("День недели - ${Sunday.Numeric()} день")
    else println("Такого дня нет")
    if(Sunday.WorkDays()) println("Рабочий день")
    else println("Выходной")
    if (ColorSunday.FunnyDay()) println("Сегодня празник(выходной)")
    else println("Работаем")
    if (Sunday.Honest()) println("Четный день")
    else println("Нечетный день")

    println()

}