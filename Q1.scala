object  Q1 extends   App{
    
    class Rational(list:List[Double]){
        var Rationallist=list

        val neg=()=>println(list.map(x => -x))
    }

    var Re1=new Rational(List(25,21.63,87.836,7363,76.83))
    var Re2=new Rational(List(87.63547,65.736,54,73,45))
    Re1.neg()
    Re2.neg()
}