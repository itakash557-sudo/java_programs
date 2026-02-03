class typeconversion{ //which means converting into one type into another type
    public static void main(String args []){
        int a=10;
        double b=a; //widening(implicit)
        Double obj=b;
        System.out.println(b);
        System.out.println(obj.getClass().getName());

        double c=10.9875;
        int d=(int)a;
        Integer i=d; //data loss
        System.out.println(d);
        System.out.println(i.getClass().getName()); //narrowing(explicit)


//java does not rounding the value it just cut the value
        int num=130;
        byte number=(byte)num;
        System.out.println(number); //-126

        
        Long too=1234567890123456789L;
        int integernum=too.intValue();
        System.out.println(integernum);
    }
}
