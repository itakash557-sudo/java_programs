public class arrays //Array program
{
    public static void main(String []args)
    {
        int[]akash={10,20,30,40};
        System.out.println(akash);//output:[I@2f92e0f4...because it is a address reference not variable to 10,20,30,40
        
         for(int i=0;i<akash.length;i++)
        {
            System.out.println(akash[i]);
        }
        // for (int value : akash)
        // {
        //     System.out.println(value);//foreach loop
        // }
    }
}

