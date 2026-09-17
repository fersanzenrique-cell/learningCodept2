
fun main() {
    /*

        A. Declare y asigne variables con diferentes tipos de datos básicos:
        ◦ Enteros (Int y Long)
        ◦ Flotantes (Float y Double)
        ◦ Caracteres (Char)
        ◦ Cadenas (String)
        ◦ Booleanos (Boolean)

    */
    var int = 0
    var int1 : Int = 5
    var long1 : Long = 0
    var float1 : Float = 0f
    var double1 : Double = 6.7
    var char1 : Char = '0'
    var string1 : String = "00"
    var bool1 : Boolean = false
    /*
        B. Muestre por consola valores de variables definidas, incluyendo una cadena y un número decimal.
    */
    println(int1)
    print("\nNúmero decimal: $double1")

    /*
        C. Trabaje con variables mutables (var), mostrando cómo cambiar su valor e imprimirlo con concatenación y con interpolación de cadenas.
    */
    print("\nEl valor de string1 es $string1")
    imprimeMensaje()
    imprimeArgv(52)
    imprimeParam()
    print(add(4,2))
    print(addLite(2,5))
}
/*
    D. Defina y utilice funciones con diferentes características:
    ◦ Función sin parámetros que imprime un mensaje.
    ◦ Función que recibe un parámetro y lo imprime.
    ◦ Función con parámetro por defecto.
    ◦ Función que suma dos números y devuelve el resultado (con return).
    ◦ Versión abreviada de la función suma usando expresión única.
    E. Desde la función main, llama a todas las funciones definidas para mostrar sus resultados en consola.
*/

fun imprimeMensaje()
{
    println("Hola, imprimo un mensaje")
}

fun imprimeArgv(argv : Int)
{
    println("Hola, imprimo argv $argv")
}

fun imprimeParam(parametro: String = "hola")
{
    print(parametro)
}

fun add(a: Int, b: Int): Int {
    val c = a + b
    return c
}

fun addLite(a: Int , b: Int): Int {
    return a + b
}
