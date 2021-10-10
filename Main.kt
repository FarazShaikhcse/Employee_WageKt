import java.util.*
class EmpWageBuilder : WageBuilder{
        private var numOfCompany = 0
        override val companyEmpWage: Array<CompanyEmpWage?> = arrayOfNulls(5)
        
        override fun addCompanyEmpWage(
                company: String,
                wagePerHour: Int,
                maxHoursPerMonth: Int,
                maxDaysPerMonth: Int
        ) {
                companyEmpWage[numOfCompany] = CompanyEmpWage(company, wagePerHour, maxHoursPerMonth, maxDaysPerMonth)
                companyEmpWage[numOfCompany]!!.computeEmpWage()
                numOfCompany += 1

        }
}
fun main() {
        println("Welcome to employee wage computation")
        val empWageBuilder = EmpWageBuilder()
        val n: Int
        val scanner = Scanner(System.`in`)
        println("Enter the no of companies")
        n = scanner.nextInt()
        val employeeWage: Array<CompanyEmpWage?> = arrayOfNulls<CompanyEmpWage>(n)
        for (i in 0 until n) {
                println("Enter the company name:")
                val name: String = scanner.next()
                println("Enter the wage per hour:")
                val wage: Int = scanner.nextInt()
                println("Enter the number of working days:")
                val days: Int = scanner.nextInt()
                println("Enter the number of working hours per month:")
                val hours: Int = scanner.nextInt()
                empWageBuilder.addCompanyEmpWage(name, wage, hours, days);
        }


}