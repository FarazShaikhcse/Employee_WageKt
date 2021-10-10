import java.util.*

fun main() {
        println("Welcome to employee wage computation")
        val n: Int
        val scanner = Scanner(System.`in`)
        println("Enter the no of companies")
        n = scanner.nextInt()
        val employeeWage: Array<EmployeeWage?> = arrayOfNulls<EmployeeWage>(n)
        for (i in 0 until n) {
                println("Enter the company name:")
                val name: String = scanner.next()
                println("Enter the wage per hour:")
                val wage: Int = scanner.nextInt()
                println("Enter the number of working days:")
                val days: Int = scanner.nextInt()
                println("Enter the number of working hours per month:")
                val hours: Int = scanner.nextInt()
                employeeWage[i] = EmployeeWage(name, wage, days, hours)
                employeeWage[i]!!.computeEmpWage()
        }
        for (i in 0 until n) {
                println("Company details:")
                System.out.println("Name: " + (employeeWage[i]!!.company))
                System.out.println("Wage per hour: " + (employeeWage[i]!!.wageph))
                System.out.println("Number of working days: " + employeeWage[i]!!.totworkingdays)
                System.out.println("Number of working hours per month: " + employeeWage[i]!!.totworkinghours)
                System.out.println("Total wage of employee of the company " + employeeWage[i]!!.company.toString() + " is " + employeeWage[i]!!.totalWage)
        }

}