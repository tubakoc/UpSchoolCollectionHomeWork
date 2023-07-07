package com.example.upschoolcollectionhomework

fun main()
{
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")

    //Yukarıdaki isimler listesini kullanarak önce harflere göre listeyi sıralayın.

    val sortName = names.sortedBy {
        it.toString()
    }

    println(sortName)

    //Kullanıcıdan, 1 adet isim isteyin.

    println("Lütfen bir isim giriniz")

    var name = readLine()
    //Bu isim names listesinde var mı yok mu kontrol edin.
    //Varsa bu ismi listede arayın, tüm harfleri büyük ve ters çevrilmiş şekilde konsola yazdırın.

    if (!sortName.contains(name))
    {
        println("Girdiğiniz isim listede bulunmamaktadır.")
    }

    else
    {
        val changeName = name?.reversed()?.uppercase()

        println("Girilen isim listede bulunmaktadır. ")

        println("Büyük harflerle ve ters çevrilmiş şekli : $changeName")
    }
}