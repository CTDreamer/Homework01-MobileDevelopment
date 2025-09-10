/*
    Question 01: At the end of a course, we want to know which student has achieved the best average grade and how many students have failed.
    It is known that this year there are 20 students and each has 3 subjects. Develop an algorithm that can provide the name and average
    of the best student, as well as the number of students who have failed. Note: a grade of 12 is required to pass.
*/

class Student(var name: String, var grade1: Int, var grade2: Int, var grade3: Int ){
}

fun main() {
    val students = arrayOf(
        Student("Gianmarco",10,8,11),
        Student("Piero",20,17,17),
        Student("Cristhian",18,19,20)
    )
    var bestAverage = 0.0
    var bestStudentName = ""
    var suspended = 0

    for(i in 0 until students.size){
        val average = (students[i].grade1 + students[i].grade2 + students[i].grade3).toFloat()/3.0

        if(average > bestAverage){
            bestAverage = average
            bestStudentName = students[i].name
        }

        if(average < 12){
            suspended++
        }
    }

    println("The best student in FISI is: $bestStudentName with an average of $bestAverage")
    println("The quantity of suspended in FISI is: $suspended")
}