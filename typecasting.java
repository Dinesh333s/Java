import java.lang.*;
class typecasting
{
public static void main(String args[])
{
  //widening casting
  int a = 10;
  double b = a;

  //narrowing casting
  double c = 23.334;
  int d = (int)c;

  System.out.println("a: "+a);
  System.out.println("b: "+b);
  System.out.println("c: "+c);
  System.out.println("d: "+d);

}
}
