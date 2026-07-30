class addition{
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("the sum is"+c);
    }
    void add(float a, float b)
    {
        float d;
        d=a+b;
        System.out.println("the sum is"+d);
    }
}
class sum
{
    public static void main(String args[])
    {
        addition obj1 = new addition();
        obj1.add(10,20);
        obj1.add(34.6f,56.8f);

    }
}