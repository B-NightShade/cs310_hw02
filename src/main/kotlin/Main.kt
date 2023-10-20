import kotlin.random.Random

fun main(args: Array<String>) {
    var primeFound = false

    do{
        var createdNumber = Random.nextInt(2,(10000000 + 1))
        var factors: Array<Int> = arrayOf()
        factors = factors.plus(1)
        for(i in 2..createdNumber){
            if(createdNumber % i == 0){
                factors = factors.plus(i)
            }
        }
        

        //check prime
        if (factors.size == 2){
            primeFound = true
            print("$createdNumber is prime. factors = ")
            for(x in factors){
                print("$x ")
            }
            println()
        }else{
            print("$createdNumber is NOT prime. factors = ")
            for(x in factors){
                print("$x ")
            }
            println()
        }
    }while(!primeFound)

}