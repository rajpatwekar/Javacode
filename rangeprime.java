
class PrimeRange

{ 
   public static void main(String[] args)
  {
    int a=1, b=30;
    for ( int i = a;i <= b; i++)
     if(isPrime (i))
      System.out.println (i);
  }
  static boolean isPrime( int n) 
    {
      int count = 0;
      if ( n<2)
return false;
for (int i =2;i<n;i++)
{
if (n%i==0)
return false;
}
return true;
}
}