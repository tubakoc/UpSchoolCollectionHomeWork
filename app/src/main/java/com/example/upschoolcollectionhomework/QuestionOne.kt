package com.example.upschoolcollectionhomework

data class Person(val name : String)
fun main()
{
    //5 isim içeren bir ArrayList oluşturun.

    val names = arrayListOf(
        Person("Fatma"),
        Person("Evin"),
        Person("Elif"),
        Person("İrem"),
        Person("Hicran")
    )
    //Kullanıcıdan, aralarına virgül koyarak 3 isim girmesini isteyin.

    println("Lütfen aralarına virgül atarak üç isim giriniz")

    var newNames = readLine()

    //Bu girilen 3 isimlik String’i aradaki virgülleri kullanarak parçalayın ve listeye dönüştürün
    //Bu listenin bol olup olmadığını kontrol edin.
    //Boş değilse oluşturduğunuz 5 isimlik listeye ekleyin ve son halini konsola yazdırın.

    if (!newNames.isNullOrEmpty())
    {
        val newListNames = newNames?.split(",")?.map { it.trim() }

        val newListPerson = newListNames.map {
            Person(it)
        }
        names.addAll(newListPerson)

        names.forEach {
            println(it.name)
        }
    }
    else
    {
        println("Liste boş.")
    }
}