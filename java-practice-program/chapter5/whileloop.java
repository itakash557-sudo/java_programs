public class whileloop
{
    public static void main(String[]args)
    {
        int a=10;
        while(a<15)      //with ; it will stop this line
        {
            System.out.println("hello");
            a++;
        }  //a++; it is in outside of a loop so the above line is gets infinity
    }
}
