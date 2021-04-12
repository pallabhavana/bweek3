import java.util.*;
class MultiplicationTable extends Thread
{
public void run()
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
try{
Thread.sleep(1000);
}catch(InterruptedException ie)
{}
}
}
public static void main(String args[])
{
MultiplicationTable t1 = new MultiplicationTable();
t1.start();
}
}