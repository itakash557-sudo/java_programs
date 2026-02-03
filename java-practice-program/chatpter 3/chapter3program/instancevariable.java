public class instancevariable{
    String name;
    int id;
    public static void main(String[]args){
    instancevariable obj1=new instancevariable();
    instancevariable obj2=new instancevariable();
    // System.out.println(name); //u will get a error 
    obj1.name="akash";
    obj1.id=02;
    System.out.println(obj1.name);
    System.out.println(obj1.id);
    System.out.println(obj2.name);
    System.out.println(obj2.id);

    }
}