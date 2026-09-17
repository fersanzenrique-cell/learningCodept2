/*
2. Escribe un programa que:
    A. Cree una lista inmutable llamada frutas con los elementos: "manzana", "banana" y "cereza".
    B. Imprima toda la lista completa.
    C. Imprima el último elemento de la lista.
    D. Imprima el primer elemento de la lista.
    E. Recorra la lista y, para cada fruta, imprima su nombre en una línea separad
*/

fun main()
{
    println(creaLista().contentToString())
    println(creaLista()[2])
    println(creaLista()[0])
    for (fruta in creaLista())
    {
        println(fruta)
    }
    println(creaListaDinamico().contentToString())
}

fun creaLista() : Array<String>
{
    val lista : Array<String> = Array(3){""}
    lista[0] = "manzana"
    lista[1] = "banana"
    lista[2] = "cereza"
    return lista

}

fun creaListaDinamico() : Array<String>
{
    val lista : Array<String> = Array(3){""}
    for (i in 0..2)
    {
        lista[i] = readln()
    }
    return lista

}