class CastingTest{
		  public static void main(String[] args){
		  int i =100;
		  long l=i;
		   System.out.println("automatic int to long "+l);
		  //automatically converts the long type into float type  byte -> short -> char -> int -> long -> float -> double
		  float z = l;  
		 System.out.println("automatic int to float "+z);
		  double dd = z;
		  System.out.println("automatic int to double "+dd);
		  
		  
		   double myDouble = 9.78;
		   float f = (float) myDouble; // Manual casting: double to int
		   System.out.println("f  "+f);      // Outputs 9
			int myInt = (int) myDouble; // Manual casting: double to int
			
			

			System.out.println(myDouble);   // Outputs 9.78  C:\Users\Admin\Documents\java_coding\basic_coding
			System.out.println(myInt);      // Outputs 9
			short shortd = (short) myInt; // Manual casting:  to int to short
			System.out.println(shortd);      // Outputs 9
		  }
}