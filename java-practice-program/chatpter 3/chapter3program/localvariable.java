class localvariable
{
    void localvar()
    {
        int a=10;
        System.out.println("local variable:"+a);
    }
    public static void main(String[]args)
    {
        localvariable obj=new localvariable();
        obj.localvar();
    }   
}
