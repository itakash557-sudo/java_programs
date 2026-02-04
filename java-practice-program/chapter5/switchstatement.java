public class switchstatement{
    public static void main (String []args)
    {   //switchh accept byte datatype
        byte a=120;
        switch(a){
            case 100:
            {
                System.out.println("full mark");
                break;
            }
            case 110:
            {
                System.out.println("good for extra content");
                break;
            }
            case 120:
            {
                System.out.println("excellent for good handwritting");
                break;
            }
            default:
            {
                System.out.println("no marks");
                break;
            }
            
        }

        //switch accept short

        short b=30_000;
        switch(b){
            case 10_000:
            {
                System.out.println("low salary");
                break;
            }
            case 20_000:
            {
                System.out.println("Average salary");
                break;
            }
            case 31_000:
            {
                System.out.println("High salary");
                break;
            }
            default:
            {
                System.out.println("very more Salary");
                break;
            }
            
        }


        //switch also accept the integer and char
        //now am using char

        char c='A';
        switch(c){
            case 'a':
            {
                System.out.println("small a");
                break;
            }
            case 'b':
            {
                System.out.println("small b");
                break;
            }
            case 'c':
            {
                System.out.println("small c");
                break;
            }
            default:
            {
                System.out.println("other char");
                break;
            }
            
        }        
        //it also works with String  introduced in java 7+ version

        String d="Akash";
        switch(d){
            case "akash":
            {
                System.out.println("akash in small case");
                break;
            }
            case "developer":
            {
                System.out.println("here is a developer");
                break;
            }
            case "Akash":
            {
                System.out.println("Akash is here");
                break;
            }
            default:
            {
                System.out.println("other name");
                break;
            }
            
        }

        //we can also use with wrapper classes introdused in java 5+
        int e=10;
        Integer f=e; //converting into wrapper class

        switch(f){
            case 10:
            {
                System.out.println("value 10");
                break;
            }
            case 11:
            {
                System.out.println("value 11");
                break;
            }
            case 12:
            {
                System.out.println("value 12");
                break;
            }
            default:
            {
                System.out.println("other value");
                break;
            }
            
        }
    }
}