import javax.accessibility.AccessibleText

object Attendance {
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
    var fulldayhour = 0

}
fun attendance() : Int {
        val attendanceCheck = (0..2).random()
        when (attendanceCheck) {
            1 -> {
                println("Full time Employee")
                Attendance.fulldayhour = 8
                MonthlyWage.totworkingdays+=1
            }
            2 -> {
                println("Part time Employee")
                Attendance.fulldayhour = 4
                MonthlyWage.totworkingdays+=1
            }
            else -> {
                println("Employee absent")
            }
        }
        MonthlyWage.totworkinghours+=Attendance.fulldayhour

        return Attendance.fulldayhour
}