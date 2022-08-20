
fun main (){
    var scn -scanner (scanner.in)
    println(" enter BMW car model color and speed")
    val bn = BMW (scn.next(),scn.next() ,scn.nextfloat())
    scn.nextline()
    println ("fuel type is $ {bn.getFuelType()}")
    println(" enter tesla car model color and speed")
    val ts = Tesla (scn.next(),scn.next() ,scn.nextfloat())
    scn.nextline()
    println ("fuel type is $ {ts.getFuelType()}")
}
abstract class Car (model:string, color:string ,speed:float) {
    open fun getFuelType():string{
        return "no fuel"
    }
}
class BMW (model:string, color:string , speed:float):car(model,color , speed){
    override fun getFuelType(): string{
        return "gas"
    }
}
class Tesla (model:string, color:string , speed:float):car(model,color , speed){
    override fun getFuelType(): string{
        return "electricity"
    }
}
