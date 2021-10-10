object MonthlyWage{
    const val TOTAL_WORKING_DAYS=20
    var totalWage:Int=0
    var totworkinghours=0
    var totworkingdays=0
}

fun computeMonthlyWage(){
    while(MonthlyWage.totworkinghours<100||MonthlyWage.totworkingdays<MonthlyWage.TOTAL_WORKING_DAYS){
        MonthlyWage.totalWage+=computeDailyWage()
    }
    println("Monthly wage of employee working for 20 days is ${MonthlyWage.totalWage}")
}
