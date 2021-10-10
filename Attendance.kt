class Attendance(val empWage: CompanyEmpWage) {
    val IS_FULL_TIME = 1
    val IS_PART_TIME = 2
    var fulldayhour = 0

    fun attendance(): Int {
        val attendanceCheck = (0..2).random()
        when (attendanceCheck) {
            1 -> {
                fulldayhour = 8
                empWage.totworkingdays += 1
            }
            2 -> {
                fulldayhour = 4
                empWage.totworkingdays += 1
            }
            else -> {
                fulldayhour = 0
            }

        }
        empWage.totworkinghours += fulldayhour

        return fulldayhour
    }
}