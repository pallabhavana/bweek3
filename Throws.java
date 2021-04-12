class Throws{
void checkAge(int age)throws ArithmeticException{
if (age<18){
throw new ArithmeticException("Lessthan 18");
}
else
{
System.out.println("valid age");
}
}
 public static void main(String [] args)
{
Throws r1 = new Throws();
r1.checkAge(19);
}
}
