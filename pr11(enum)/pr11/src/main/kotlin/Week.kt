enum class Week {
    Monday{
        override fun DayName()="Понедельник"
        override fun Numeric()="1"
        override fun WorkDays()=true
        override fun Honest()=false
    },
    Tuesday{
        override fun DayName()="Вторник"
        override fun Numeric()="2"
        override fun WorkDays()=true
        override fun Honest()=true
    },
    Wednesday{
        override fun DayName()="Среда"
        override fun Numeric()="3"
        override fun WorkDays()=true
        override fun Honest()=false
    },
    Thursday{
        override fun DayName()="Четверг"
        override fun Numeric()="4"
        override fun WorkDays()=true
        override fun Honest()=true
    },
    Friday{
        override fun DayName()="Пятница"
        override fun Numeric()="5"
        override fun WorkDays()=true
        override fun Honest()=false
    },
    Saturday{
        override fun DayName()="Суббота"
        override fun Numeric()="6"
        override fun WorkDays()=false
        override fun Honest()=true
    },
    Sunday{
        override fun DayName()="Воскресенье"
        override fun Numeric()="7"
        override fun WorkDays()=false
        override fun Honest()=false
    };
    open fun DayName()="Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье"
    open fun Numeric()="1, 2, 3, 4, 5, 6, 7"
    abstract  fun WorkDays():Boolean
    abstract fun Honest():Boolean
}