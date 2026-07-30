public class CallByValueExample
{
public static void main(String[] args)

{
int num = 10;
System.out.println("Before calling method:"+num); modifyValue(num);
System.out.println("After calling method:"+num);
}
public static void modifyValue(int value)
{
value=20;
System.out.println("Inside method:"+value);
}
}

