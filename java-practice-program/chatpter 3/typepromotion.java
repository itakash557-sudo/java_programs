class typepromotion{
    public static void main (String args[])
    {
        byte a=1;
        byte b=20;
        byte c = (byte)(a * b); //without byte u will get a error
        System.out.println(c);
    }
}
