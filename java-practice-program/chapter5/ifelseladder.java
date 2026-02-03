class ifelseladder{   //used for multiple condition
    public static void main(String[]args)
    {
        System.out.println("if-elseif-else ladder");
        int age=18;
        if(age<18){
            System.out.println("not eligible to vote");
        }
        else if(age==18){
            System.out.println("eligible to vote,welcome adult");
        }
        else{
            System.out.println("eligible to vote");
        }

    }
}
