public class nestedswitch
{
    public static void main (String[]args)
    {
        int options=1;
        int option=2;
        switch(options)
        {
            case 1:{
                switch(option)
                {
                    case 1:{
                        System.out.println("exit");
                        break;
                    }
                    case 2:{
                        System.out.println("welcome");
                        break;
                    }
                    default:{
                        System.out.println("no");
                    }
                }
            break;
            }
            case 2:{
                System.out.println("exit");
                break;
            }
            default:
                {
                    System.out.println("not valid");
                    break;
                }
        }
    }
}