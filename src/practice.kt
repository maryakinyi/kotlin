fun main(){
  var together=add(50,45,36.3f,34.4f)
  println(together)
  var div=remainder(23,4)
  println(div)
  var get=divide(24,8)
  println(get)
  var details=persons("Mary",21,58799901,"0wuormary@gmail.com welcome all")
  println(details)
  var text="congratulation"
 println(text[1])
  println(text[7])
  println(text[5])
}
fun add(num1:Int,num2:Int,num3:Float,num4:Float):Float{
  var sum=num1+num2 + num3 + num4
  return sum
}
fun remainder(num1: Int,num2: Int):Int{
  var div=(num1%num2)
  return div
}
fun divide(num1: Int,num2: Int):Int{
  var get=num1/num2
  return get
}
fun persons(name:String,age:Int,phoneNumber:Int,email:String):String{
  var details="I am $name and I'm $age ,my contact are $phoneNumber and $email welcome all"
  return details
  println(details)

}
fun indexing(text:String){
  var text="calculate"
  println(text)
}