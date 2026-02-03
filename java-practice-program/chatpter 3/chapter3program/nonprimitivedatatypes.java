public class nonprimitivedatatypes{
    public static void main(String[]args)
    {
        System.out.println("Non primitive datatypes");

        //String

        String s=new String("Akash");
        String s1="java";
        String s2="programming";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        //Array

        int[] a={1,2,3};
        int[] a1=new int[3];
        a1[0]=1;
        a1[1]=2;
        int[] a2;
        a2=new int[] {1,2,3,4,5};
        System.out.println(a); //[I@2f92e0f4
        System.out.println(a1);//[I@28a418fc
        System.out.println(a2);//[I@5305068a
        //a,a1,a2 is only reference not var to access

        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
        for(int i=0;i<a1.length;i++){
        System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }

        //Class and object
    }
}
