#include <stdio.h>
void sort012(int a[], int n)
{
    int zeroCount=0, oneCount=0, twoCount=2;
    for(int i=0; i<n; i++)
    {
        if(a[i]==0)
            zeroCount++;
        else if(a[i]==1)
            oneCount++;
        else
            twoCount++;
    }
    for(int i=0; i<n; i++)
    {
        if(zeroCount>0){
            a[i]=0;
            zeroCount--;
        }
        else if(oneCount>0){
            a[i]=1;
            oneCount--;
        }
        else{
            a[i]=2;
            twoCount--;
        }
    }
}
