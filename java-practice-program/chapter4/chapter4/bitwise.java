public class bitwise{
    public static void main (String[]args) 
    {
        int a=4; //0100
        int b=6; //0110

        System.out.println(a & b); //0100
        System.out.println(a|b); //0110
        System.out.println(~b); //-7 formula= -(x+1)
        System.out.println(a^b); //0010
        //a << n  =  a × (2^n) leftshift formula
        System.out.println(a<<b); //4<<6 o/p:100000000 (bit shift from left to right)
        //a >> n  =  a ÷ (2^n) rightshift formula
        System.out.println(a>>b); //4>>6 o/p:0
        System.out.println(a>>>b); //unsigned right shift (it produce a large int value)

        
        //Why this output comes?
        // Step 1: Binary of -8 (32-bit int)

        // Java uses 2’s complement for negative numbers.

        // 8  = 00000000 00000000 00000000 00001000
        // -8 = 11111111 11111111 11111111 11111000

        // Step 2: Apply >>> 1 (Unsigned Right Shift)

        // 👉 >>> shifts bits to the right
        // 👉 Leftmost bits are filled with 0 (IMPORTANT)

        // Before:
        // 11111111 11111111 11111111 11111000

        // After >>> 1:
        // 01111111 11111111 11111111 11111100

        // Step 3: Convert to Decimal
        // 01111111 11111111 11111111 11111100
        // = 2147483644
    }
}
