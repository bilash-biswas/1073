import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var a=input.nextInt();
    for(i in 2..a step 2)
    {
        System.out.printf("%d^2 = %d\n",i,i*i);
    }
}

