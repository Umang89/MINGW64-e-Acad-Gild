//---------------Assignment 4

//------- Assume that the integer variable x is 5 and the integer variable y is 10. Give the values of the following expressions:
// x + y * 2
// x - y + 2
// (x+y) * 2
// y % x
 

public class Expression {

	public static void main (String arg[])
	{
	
		int x=5,y=10,result;
		
		result=x+y*2  ;     ///// Result 25
		
		System.out.println(result);
		
		result=x-y+2  ;    ///// Result -3
		
		System.out.println(result);
		
		result=(x+y)*2 ;   ///// Result 30
		
		System.out.println(result);
		
		result=y%x  ;	  /////  Result 0
		
		System.out.println(result);
	
	}
}	