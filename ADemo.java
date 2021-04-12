import java.util.*;
class AgeException extends Exception{
private int age;
AgeException(int age)
{
this.age=age;
}
public String toString()
{
	return "invaid age"+age;
}
}
class ADemo
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int age;
try{
age=sc.nextInt();
if(age<18){
	throw new AgeException(age);
 }
	System.out.println("valid age:"+age);
}
catch(Exception ae)
{
System.out.println(ae.toString());
}
}
}