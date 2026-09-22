/*
    4. Haz un programa que:
     Condicional simple con if:
    Declara una variable numérica y verifica si es mayor que 5 para imprimir un mensaje.
    Luego, con una variable String, comprueba si coincide con un valor dado y muestra mensajes diferentes según el resultado.
*/
fun main()
{
    val num = readln().toInt()
    if (num > 5)
    {
        println("El numero es mayor que 5")
    }
    val palabra = readln()
    val palabra2 = "hola"
    println(if (palabra==palabra2) "Coincide" else "No coincide")
    if (palabra == palabra2)
    {
        println("La palabra es igual a la otra")
    }
    else
    {
        println("La palabra no es igual a la otra")
    }


/*
     Condicional múltiple con if-else if:
    Según el valor de una variable que representa un animal, imprime un mensaje específico para "perro", "gato" o "pájaro",
    y un mensaje genérico para cualquier otro caso.
*/
    val x = readln().toInt()
    when (x) {
        1 -> println("perro")
        2 -> println("gato")
        3 -> println("pajaro")
        else -> println("Mensaje generico")
    }
/*
     Asignación condicional con expresión if:
    Asigna a una variable un valor basado en una condición simple evaluada con una expresión if
    (por ejemplo, ataque si la vida del enemigo es menor o igual a cierto valor).
    */
    val y = readln().toInt()
    if (y >= 100)
    {
        println("Estoy muerto")
    } else {
        println("Estoy vivo")
    }
    /*
     Condicional con booleanos:
    Declara una variable booleana y usa condiciones para imprimir mensajes diferentes si la variable es verdadera o falsa (usando negación).
    */
    val boolean2 = false
    if (!boolean2) {
        println("true")
    }
    else {
        println("false")
    }
    /*
     Uso de when para casos múltiples:
    Usa una expresión when para asignar el nombre del día de la semana a partir de un número, incluyendo rangos y múltiples valores para un mismo resultado.
    Imprime el día correspondiente. Realiza una variante con un caso else distinto.
    Además, evalúa una puntuación numérica en rangos y muestra la evaluación correspondiente.
*/

}
/*
     Detección de tipos con when en función:
    Crea una función que reciba un parámetro de cualquier tipo (Any) y use when para detectar si es String, Int, Boolean u otro,
     imprimiendo un mensaje según corresponda.
     Funciones con when que retornan valores:
    Implementa dos funciones que reciban una puntuación y devuelvan un texto evaluativo según rangos numéricos usando when.
    Una debe usar return explícito y la otra debe usar la expresión when directamente como valor de retorno.
 */