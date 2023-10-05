/**
 * This lab has 3 separate problems in 3 separate methods
 * LEAVE THE MAIN METHOD ALONE 
 * The main method calls 3 methods - problem1, problem2, and problem3
 * FOLLOW THE INSTRUCTIONS IN THE METHOD COMMENTS to implement the methods
 * feel free to debug or to use prints to look at variable values while you work
 */
public class R5 {
    public static void main( String[] args ) {
        //DO NOT ALTER THIS METHOD
        //comment out the test method for the methods you currently are not working on
        testProblem1();
        testProblem2();
        testProblem3();
    }

    //WRITE THIS METHOD
    /*
     * method:      problem1 
     * problem:     this method should compare an original price and a current price. 
     *              return a single (case sensitive) message:
     *              if the current price is discounted 50% or more of the original price, return “Great deal”. 
     *              otherwise, if the current price discounted 20%-49% of the original price, return “Good deal”. 
     *              if the current price is no more than the original price, return “Ok deal”. 
     *              if none of these apply, return “Bad deal”
     *              
     * @param       double originalPrice
     * @param       double currentPrice
     * @returns     String - the deal message
     */
    public static String problem1( double originalPrice, double currentPrice ) {
        return "";
    }
    
    //WRITE THIS METHOD
    /*
     * method:      problem2 
     * 
     * problem:     write a tax calculator
     *              for marital status "single" and income exactly or less than $32,000, tax is 10% 
     *              for marital status "single" and income more than $32,000, tax is $3,200 on the first $32,000 and 25% on the rest
     *              for married couples, tax is 10% if the combined income is $64,000 or less and 
     *              for married couples, income more than $6,4000, tax is $6,400 on the first and 25% on the remaining income
     *              
     * @param       String maritalStatus
     * @param       double income
     * @returns     double - the tax
     */
    public static double problem2( String maritalStatus, double income ) {
        double tax = 0.0;

        
        return tax;
    }
    
    //WRITE THIS METHOD
    /*
     * method:      problem3 
     * problem:     given two numbers x and y, replace the "true" condition in the if with a condition that will 
     *              satisfy the output
     *              
     * @param       int x
     * @param       int y
     * @returns     String result
     */
    public static String problem3( int x, int y ) {
        String result;
        if ( true )
            result = "Exactly one of " + x + " and " + y + " is even";
        else
            result = "Neither or both of " + x + " and " + y + " are even";
        return result;
    }
    
    
    public static void testProblem1() {
        //DO NOT ALTER THIS METHOD
        assert "Great deal".equals( problem1( 105.99, 42.99 ) ) : "problem1 not correct yet, must return Great deal but returns " + problem1( 105.99, 42.99 );
        assert "Good deal".equals( problem1( 223.89, 120.00 ) ) : "problem1 not correct yet, must return Good deal but returns " + problem1( 223.89, 120.00 );
        assert "Ok deal".equals( problem1( 13.79, 12.00 ) ) : "problem1 not correct yet, must return Ok deal but returns " + problem1( 13.79, 12.00 );
        assert "Bad deal".equals( problem1( 99.99, 101.99 ) ) : "problem1 not correct yet, must return Ok deal but returns " + problem1( 99.99, 101.99 );
        
        System.out.println( "problem1 pass" );
    }
    
    public static void testProblem2() {
        assert Math.abs( problem2( "single", 32000 ) - 3200 ) < 0.1 : "problem2 not correct yet, must return 3200 for singles but returns " + problem2( "single" , 32000 );
        assert Math.abs( problem2( "single", 37555 ) - 4588.75 ) < 0.1 : "problem2 not correct yet, must return 4588.75 for singles but returns " + problem2( "single" , 37555 );
        assert Math.abs( problem2( "single", 73000 ) - 13450 ) < 0.1 : "problem2 not correct yet, must return 13450 for singles but returns " + problem2( "single" , 73000 );
        assert Math.abs( problem2( "married", 12012.9 ) - 1201.29 ) < 0.1 : "problem2 not correct yet, must return 1201.29 for non-singles but returns " + problem2( "single" , 12012.9 ); 
        
        System.out.println( "problem2 pass" );
    }
        
    public static void testProblem3() {  
        //DO NOT ALTER THIS METHOD
        assert problem3( 3, 4 ).equals( "Exactly one of 3 and 4 is even" ) : "problem3 not correct yet, must return \"Exactly one of 3 and 4 is even\" but returns " + problem3( 3, 4 );
        assert problem3( 14, 111 ).equals( "Exactly one of 14 and 111 is even" ) : "problem3 not correct yet, must return \"Exactly one of 14 and 111 is even\" but returns " + problem3( 14, 111 );
        assert problem3( 8, 10 ).equals( "Neither or both of 8 and 10 are even" ) : "problem3 not correct yet, must return \"Neither or both of 8 and 10 are even\" but returns " + problem3( 8, 10 );
        assert problem3( 19, 33 ).equals( "Neither or both of 19 and 33 are even" ) : "problem3 not correct yet, must return \"Neither or both of 19 and 33 are even\" but returns " + problem3( 19, 33 );
        
        System.out.println( "problem3 pass" );
    }
}
