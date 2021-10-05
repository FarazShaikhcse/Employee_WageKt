
object EmployeeWage {
    const val IS_FULL_TIME = 1
    const val wageperhour = 20
    var fulldayhour = 0
    var empwage = 0
    fun attendance(): Int {
        val attendanceCheck = Math.floor(Math.random() * 10) % 2
        if (attendanceCheck == IS_FULL_TIME.toDouble()) {
            println("Employee is present")
            fulldayhour = 8
        } else println("Employee is absent")
        empwage = fulldayhour * wageperhour

        println("Employee wage= $empwage")
        return empwage
    }
}