using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            a = Convert.ToInt32(Console.ReadLine());
            for(int i=2;i<=a;i+=2)
            {
                Console.WriteLine(i+"^2 = "+i*i);
            }
            Console.ReadLine();
        }
    }
}
