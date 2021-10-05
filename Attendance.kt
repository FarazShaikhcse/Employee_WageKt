import javax.accessibility.AccessibleText

object Attendance {
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
    var fulldayhour = 0

}
fun attendance() : Int {
        val attendanceCheck = (0..2).random()
        if (attendanceCheck == Attendance.IS_FULL_TIME) {
            println("Full time Employee")
            Attendance.fulldayhour = 8
        }  else if(attendanceCheck == Attendance.IS_PART_TIME) {
            println("Part time Employee")
            Attendance.fulldayhour = 4
        }
        else
            println("Employee absent")
        return Attendance.fulldayhour
}

