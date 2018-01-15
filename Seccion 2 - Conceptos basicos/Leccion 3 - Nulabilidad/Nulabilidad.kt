class A {
    var puedeSerNulo: String? = null 
    var noPuedeSerNulo: String 
    
    constructor(puedeSerNulo: String?, noPuedeSerNulo: String) {
        this.puedeSerNulo = puedeSerNulo
        this.noPuedeSerNulo = noPuedeSerNulo
    }
}

fun main(args: Array<String>) {
    var objectA = A(null, "test")
    
    //- Retornará un error puesto que no puede ser null
    //objectA.noPuedeSerNulo = null
    
    println("Count: " + objectA.puedeSerNulo?.count())
    objectA.puedeSerNulo = "Hola"
    println("Count: " + objectA.puedeSerNulo?.count())
    objectA.puedeSerNulo = null
    println("Count: " + (objectA.puedeSerNulo?.count() ?: 0))
    
    //- Nos dejará compilar pero provocará un NPE
    //println("Count: " + objectA.puedeSerNulo!!.count())
    
    var objectB: A? = null
    objectB?.puedeSerNulo?.let { println("Hola objectB") }
    var objectC: A? = A("Test 1", "Test 2")
    objectC?.puedeSerNulo?.let { println("Hola objectC") }
}