package chapter01

fun main(args : Array<String>) {
    println("Hello World!")
    val student = Student("dongchul")
    println("Student name : ${student.name}")

    val carManufacturer = CarManufacturer("Mercedes")
    println("Car Manufacturer : ${carManufacturer.name}")
}
