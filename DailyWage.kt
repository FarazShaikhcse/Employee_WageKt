class DailyWage(val empWage: CompanyEmpWage) {
    val WAGE_PER_HOUR = 20
    var empwageamt = 0
    val attendance=Attendance(empWage)
    fun computeDailyWage(): Int {
        empwageamt = attendance.attendance() * WAGE_PER_HOUR
        if (empwageamt>0)
            println("Employee daily wage for day" + empWage.totworkingdays + " is= " + empwageamt)
        return empwageamt
    }
}

