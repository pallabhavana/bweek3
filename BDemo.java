class BoxingExample1{
int a = 5;
void Boxing()
{
Integer a1 = new Integer();
a1 = a;
System.out.println(a1);
}
}
class BoxingExample2{
void unBoxing()
{
Integer i = new Integer(30);
int b = i;
System.out.println(b);
}
}
class BDemo{
public  static void main(String args[])
{
BoxingExample1 b1 = new BoxingExample1();
BoxingExample2 b2 = new BoxingExample2();
b1.Boxing();
b2.unBoxing();
}
}