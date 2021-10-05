object DailyWage {
    const val WAGE_PER_HOUR = 20
    var empwage = 0
}
fun computeDailyWage(){
    DailyWage.empwage = attendance() * DailyWage.WAGE_PER_HOUR
    println("Employee Daily wage= ${DailyWage.empwage}")
}


