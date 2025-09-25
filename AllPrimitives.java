

public class AllPrimitives {
    public static void main(String[] args) {
        byte   b   = 100;                 
        short  s   = 20_000;           
        int    i   = 1_000_000;         
        long   l   = 9_000_000_000L;      
        float  f   = 3.14f;           
        double d   = 2.718281828459045;   
        char   c   = 'A';                
        boolean bool= true;              
        int sumInt = b + s + i;
        long totalLong = l + sumInt;
        double product = d * f;
        char nextChar = (char) (c + 1);
        boolean comparison = (i > s) && bool;


        int castedFromLong = (int) l;
        // small formatted output
        System.out.println("=== All Primitives Demo ===");
        System.out.println("byte b           = " + b);
        System.out.println("short s          = " + s);
        System.out.println("int i            = " + i);
        System.out.println("long l           = " + l);
        System.out.println("float f          = " + f);
        System.out.println("double d         = " + d);
        System.out.println("char c           = " + c + " (code: " + (int)c + ")");
        System.out.println("boolean bool     = " + bool);
        System.out.println();
        System.out.println("sumInt (b + s + i)         = " + sumInt);
        System.out.println("totalLong (l + sumInt)     = " + totalLong);
        System.out.println("product (d * f)            = " + product);
        System.out.println("nextChar (c + 1)           = " + nextChar + " (code: " + (int)nextChar + ")");
        System.out.println("comparison (i > s && bool) = " + comparison);
        System.out.println("castedFromLong ((int) l)   = " + castedFromLong + "  <-- shows truncation if outside int range");
    }
}
