/*
    3. Haz un programa que:
    • Crea un array con los días de la semana, y recórrelo e imprímelo por pantalla.
    • Crea un array con tres colores, recórrelo e imprime por pantalla la posición de cada color y el propio color.
    • Crea un array con los días de la semana.
 */
fun main()
{
    val lista = Array<String>(7){""}
    lista[0] = "Lunes"
    lista[1] = "Martes"
    lista[2] = "Miercoles"
    lista[3] = "Jueves"
    lista[4] = "Viernes"
    lista[5] = "Sabado"
    lista[6] = "Domingo"
    println(lista.contentToString())
    val listaColores = Array<String>(3){""}
    listaColores[0] = "Azul"
    listaColores[1] = "Rojo"
    listaColores[2] = "Verde"
    for ((i, element) in listaColores.withIndex())
    {
        println("$i $element")
    }
}