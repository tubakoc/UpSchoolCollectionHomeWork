package com.example.upschoolcollectionhomework

data class Student(val name: String, val age: Int, val school: String)


fun main()
{

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )
    //İlk olarak en büyük ve en küçük yaşa sahip olan öğrencinin ismini ve kaçıncı indexte olduğunu konsola yazdırın.

    val yasSirali = students.sortedBy {
        it.age
    }
    val buyukYas = students.maxByOrNull { it.age }

    val kucukYas = students.minByOrNull { it.age }


    println("En küçük yaşa sahip öğrencinin bilgileri :${yasSirali.first()} ")

    println("En büyük yaşa sahip öğrencinin bilgileri :${yasSirali.last()} ")


    //Listede school değeri Üniversite A olanları filtreleyin.

    val uniA = students.filter {
        it.school == "Üniversite A"}


    println(" Universite A da bulunan öğrenciler -> $uniA")


    
    //Filtreleme işleminden dönen listeyi yaşları 25’ten büyükler ve küçükler olarak alt alta konsola yazdırın.

/*
    uniA.forEachIndexed { index, student ->
        println("forEachIndexed -> $index - ${student.age <= 25}")
    }*/
   println( " Universite A da okuyup 25 yaşından büyükler : ${uniA.filter { it.age > 25
   }}")

    println( " Universite A da okuyup 25 yaşından küçükler : ${uniA.filter { it.age < 25
    }}")
}
