fun factorial(x:Int):Int {
    if (x == 0) {
        return 1
    } else {
        return x * factorial(x - 1)
    }
}
tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}
fun main(){
    println("Khushi_21012011010")
    print("Enter Number:")
    val num=readLine()!!.toInt()
    println("factorial of $num is ${factorial(num)}")
    println("factorial of $num by using tailrec keyword is:${fact(num)}")
}
