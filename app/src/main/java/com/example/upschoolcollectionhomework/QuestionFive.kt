package com.example.upschoolcollectionhomework

//Yukarıdaki işçiler listesini kullanarak her çalışana %35 zam yapın.
//Listeyi karıştırıp maaş değerine göre küçükten büyüğe sıralayın.
//En yüksek ve en düşük maaş alanları konsola yazdırın.
//Maaş ortalamasını hesaplayıp konsola yazdırın.

data class Workers(val name: String, val salary: Double)
fun main ()
{
    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    //Yukarıdaki işçiler listesini kullanarak her çalışana %35 zam yapın.

    val zamliMaasListe = workers.map { Workers(it.name, it.salary * 0.35)}
    println(zamliMaasListe)


    //println("${workers.map {Workers(it.name,it.salary * 0.35)}}")

    //Listeyi karıştırıp maaş değerine göre küçükten büyüğe sıralayın.

    val shufWorkers = zamliMaasListe.shuffled()
    println("Karıştırılmış hali : $shufWorkers")

    val maasSort = zamliMaasListe.sortedBy {   it.salary }

    println("Maaş Sıralaması : $maasSort")

    //En yüksek ve en düşük maaş alanları konsola yazdırın.

    println("En yüksek maaşlı -> ${zamliMaasListe.maxByOrNull { it.salary }}")

    println("En düşük maaşlı -> ${zamliMaasListe.minByOrNull { it.salary }}")

    //Maaş ortalamasını hesaplayıp konsola yazdırın.

    val maasToplam = zamliMaasListe.sumOf { it.salary}

    println(maasToplam)

    val maasOrt = maasToplam / workers.size

    println("İşçilerin maaş ortalaması : $maasOrt")



}