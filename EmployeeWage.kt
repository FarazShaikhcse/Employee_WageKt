class EmployeeWage(val company: String, val wageph: Int,val total_working_days: Int,val total_working_hours: Int) {

    var totalWage:Int=0
    var totworkinghours=0
    var totworkingdays=0
    val dailyWage=DailyWage(this)

    fun computeEmpWage(){
    while(totworkinghours<total_working_hours && totworkingdays<total_working_days){
        totalWage+=dailyWage.computeDailyWage()
    }
    println("Monthly wage of employee is ${totalWage}")

    }
}
