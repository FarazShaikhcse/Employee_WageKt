class DailyWage(empWage: EmployeeWage) {
    val WAGE_PER_HOUR = 20
    var empwageamt = 0
    val attendance=Attendance(empWage)
    fun computeDailyWage(): Int {
        empwageamt = attendance.attendance() * WAGE_PER_HOUR
        println("Employee Daily wage= ${empwageamt}")
        return empwageamt
    }
}

