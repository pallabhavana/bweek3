class GenericMethodTest{
public static < E > void printArray( E [] inputArray)
{
for(E element:inputArray){
System.out.println(element);
}
}
public static void main(String args[])
{
Integer[]inputArray = {1,2,3,4,5};
System.out.println("Array elements are:");
PrintArray(inputArray);
}
}