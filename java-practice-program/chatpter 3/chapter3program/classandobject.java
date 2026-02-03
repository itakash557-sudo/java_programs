public class classandobject
{
    String name;
    String clas;
    public static void main(String[]args)
    {
        classandobject obj=new classandobject();
        obj.name="akash";
        obj.clas="IT";
        System.out.println(obj.name);//need obj name because java does not understand which name var;because one var can have many obj 
        System.out.println(obj.clas);
    }
}
