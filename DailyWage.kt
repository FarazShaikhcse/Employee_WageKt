class DailyWage(empWage: EmpWage) {
    val WAGE_PER_HOUR = 20
    var empwage = 0
    val attendance=Attendance(empWage)
    fun computeDailyWage(): Int {
        empwage = attendance.attendance() * WAGE_PER_HOUR
        println("Employee Daily wage= ${empwage}")
        return empwage
    }
}

