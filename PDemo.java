class XDemo implements Runnable
{
public void run()
{
int i = 1;
while(i<=4)
{
System.out.println("Thread1");
try{
Thread.sleep(1000);
}
catch(InterruptedException ie){
}
i++;
}
}
}
class TDemo1 extends Thread
{
public void run()
{
int i = 1;
while(i<=4)
{
System.out.println("Thread2");
try{
Thread.sleep(1000);
}catch(InterruptedException ie)
{
}
i++;
}
}
}
class PDemo
{
public static void main(String args[])
{
XDemo r1 = new XDemo();
Thread t1 = new Thread(r1);
TDemo1 t2 = new TDemo1();
t1.start();
t2.start();
}
}

