package etl

import java.time.LocalDate
import java.time.LocalTime
import java.util.List

data class WorkDay(
        val employee: Employee,
        val date: LocalDate,
        val punches: ArrayList<LocalTime>
) {
    override fun toString(): String =  "TimeEntryVO [Empregado = " + employee + ", Data = " + date + ", Punches = " + punches + "]"
}