
object EmployeeWage {
    const val IS_FULL_TIME = 1
    fun attendance(): Int {
        val check = (Math.floor(Math.random() * 10) % 2).toInt()
        if (check == IS_FULL_TIME) {
            println("Present")
            return IS_FULL_TIME
        } else {
            println("Absent")
            return 0
        }
    }
}