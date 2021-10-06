object MonthlyWage{
    const val TOTAL_WORKING_DAYS=20
    var totalWage:Int=0
}

fun computeMonthlyWage(){
    for(i in 1..MonthlyWage.TOTAL_WORKING_DAYS){
        MonthlyWage.totalWage+=computeDailyWage()
    }
    println("Monthly wage of employee working for 20 days is ${MonthlyWage.totalWage}")
}
