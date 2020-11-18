#include<stdio.h>
int main()
{
    int N,i,Z;
    scanf("%d",&N);
    if(N>5 && N<2000)
    {
        for(i=2;i<=N;i=i+2)
        {
         Z = pow(i,2);
         printf("%d^2 = %d\n",i,Z);
        }
    }
    return 0;
}
