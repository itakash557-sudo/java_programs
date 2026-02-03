public class operator{
    public static void main(String[]args)
    {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int f='a'; //char internally wrks as a numeric

        //arithmatic operator
        System.out.println(a+b); //addition
        System.out.println(f+1); //97+1=98
        System.out.println(a-b); //subtraction
        System.out.println(a*b); //multiplication
        System.out.println(a/b); //division
        System.out.println(a%b); //modulus
        //relational or comparative operator
        System.out.println(a==b); //checks equal or not
        System.out.println(a>b); //greater 
        System.out.println(a<b); //lesser
        System.out.println(a>=b); //greater equal
        System.out.println(a<=b); //lesser equal
        System.out.println(a!=b); //not equal
        //logical operator
        if (a==b &&  b==c) { //both true 
            System.out.println("yes");
        }
        else if (a==b || b==c) { //atleast one true
            System.out.println("no");
        }
        else if (a!=10){ //opposite of result
            System.out.println("not");
        }
        else {
            System.out.println("else part");
        }
        //assignment operator
        int e=100;
        d+=20;
        System.out.println(d);
        //ternary or conditional operator (short form of if else)
        String var;
        var=(a!=10)?"crt":"wrong";
        System.out.println(var);
    }
}


