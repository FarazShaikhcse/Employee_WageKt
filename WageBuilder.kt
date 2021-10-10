interface WageBuilder {
    val companyEmpWage: Array<CompanyEmpWage?>
    fun addCompanyEmpWage(company: String, wagePerHour: Int, maxHoursPerMonth: Int, maxDaysPerMonth: Int)
}