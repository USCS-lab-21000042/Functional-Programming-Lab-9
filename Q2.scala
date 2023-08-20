object  Q2 extends  App{
    val sub :(Float,Float)=>Float=(x,y)=>x-y
    var x:Float=3.toFloat/4
    var y:Float=5.toFloat/8
    var z:Float=2.toFloat/7
    print(sub(x,sub(y,z)))

}