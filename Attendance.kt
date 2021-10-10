class Attendance(val empWage: EmpWage) {
    val IS_FULL_TIME = 1
    val IS_PART_TIME = 2
    var fulldayhour = 0


    fun attendance(): Int {
        val attendanceCheck = (0..2).random()
        when (attendanceCheck) {
            1 -> {
                println("Full time Employee")
                fulldayhour = 8
                empWage.totworkingdays += 1
            }
            2 -> {
                println("Part time Employee")
                fulldayhour = 4
                empWage.totworkingdays += 1
            }
            else -> {
                println("Employee absent")
            }
        }
        empWage.totworkinghours += fulldayhour

        return fulldayhour
    }
}