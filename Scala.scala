object Main {
  def main(args:Array[String]){ 
    var a=scala.io.StdIn.readInt()
    for(i <- 2 to a by 2){
      println(f"$i^2 = ${i*i}")
    }
    }
}
