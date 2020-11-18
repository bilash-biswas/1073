#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
    int N,i,Z;
    cin>>N;
    if(N>5 && N<2000)
    {
        for(i=2;i<=N;i=i+2)
        {
         Z = pow(i,2);
         cout<<i<<"^2 = "<<Z<<endl;
        }
    }
    return 0;
}
