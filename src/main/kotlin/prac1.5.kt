
fun main(){
    println("Khushi_21012011010")
    print("Enter a month number: ")
    val monthnum = readLine()!!.toInt()
    val result=when (monthnum)
    {
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else->"Please Enter proper number"
    }
    println(result)
}