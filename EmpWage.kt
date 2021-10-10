class EmpWage{
    val TOTAL_WORKING_DAYS=20
    var totalWage:Int=0
    var totworkinghours=0
    var totworkingdays=0
    val dailyWage=DailyWage(this)

    fun computeEmpWage(){
    while(totworkinghours<100||totworkingdays<TOTAL_WORKING_DAYS){
        totalWage+=dailyWage.computeDailyWage()
    }
    println("Monthly wage of employee working for 20 days is ${totalWage}")
    }
}
