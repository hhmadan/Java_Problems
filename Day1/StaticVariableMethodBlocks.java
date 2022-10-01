public class StaticVariableMethodBlocks {
// static variables
    static int j = 10;
    static int k;
// static block

    static
    {
        System.out.println("Static Block Initialized...");
        k = j + 8;
    }
// static method
    static int add (int a, int b )
    {
        int s = a + b;
        return s;
    }

    public static void main (String[]args)
    {

        System.out.println("Sum of 10 and 5 is: "+ add(10,5));
    }
}
