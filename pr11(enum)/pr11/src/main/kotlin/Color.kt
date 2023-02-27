enum class ColorType {
    PeachPuff{
      override fun ColorName()="Персиковый"
      override val rgb="#FFDAB9"
        override fun DayoftheWeek()=true
        override fun Numeric()=1
        override fun FunnyDay()=false
  },
    Plum{
        override fun ColorName()="Сиреневый"
        override val rgb="#DDA0DD"
        override fun DayoftheWeek()=true
        override fun Numeric()=2
        override fun FunnyDay()=false
    },
    SkyBlue{
        override fun ColorName()="Небесно-голубой"
        override val rgb="#87CEEB"
        override fun DayoftheWeek()=true
        override fun Numeric()=3
        override fun FunnyDay()=false
    },
    White{
        override fun ColorName()="Белый"
        override val rgb="#FFFFFF"
        override fun DayoftheWeek()=true
        override fun Numeric()=4
        override fun FunnyDay()=false
    },
    Green{
        override fun ColorName()="Зеленый"
        override val rgb="#008000"
        override fun DayoftheWeek()=true
        override fun Numeric()=5
        override fun FunnyDay()=false
    },
    Tomato{
        override fun ColorName()="Томатный"
        override val rgb="#FF6347"
        override fun DayoftheWeek()=true
        override fun Numeric()=6
        override fun FunnyDay()=true
    },
    HotPink{
        override fun ColorName()="Розовый"
        override val rgb="#FF69B4"
        override fun DayoftheWeek()=true
        override fun Numeric()=7
        override fun FunnyDay()=true
    };
    abstract fun Numeric():Int
    abstract fun FunnyDay():Boolean
    abstract val rgb:String
    abstract fun ColorName(): String
    abstract fun DayoftheWeek():Boolean
}