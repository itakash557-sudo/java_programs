public class twod{
    public static void main (String[]args)
    {
        int a[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(a); //[[I@2f92e0f4

        //if u want to print the matrix use for loop
        for (int i=0;i<a.length;i++) //outer loop 0,1,2
        {
            for (int j=0;j<a[i].length;j++)
            { //inter loops to print values in 0th row it will print 1,2,3...1st row 4,5,6
            System.out.print(a[i][j]+" ");
            }
        System.out.println(" ");
        }


        // using 2 array variable

        int b[]={1,1,1};
        int c[]={2,2,2};
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[j]+ " ");
        }
        }
    }
