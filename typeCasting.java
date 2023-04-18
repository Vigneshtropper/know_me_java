package basic_Java;

public class typeCasting {

	public static void main(String[] args) {
		// converting attribute to one other 
	 // implicit type casting 
		int a= 10 ;
	   double b = a;
	   float c = a;
	   long l = a;
	   
	   // Explicit type casting
	    int x =(int) b ;
	    int y = (int)c;
	    int z  = (int)l;
	    
	  String s = "raw";
	  //int aa = (int)s; {not possible }
	 
	  Boolean bl  = true;
	  //int aa = (int )bl;{not possible}
	  
	  /** trunkation****/
	  
	  int n1 = 45;
	  int n2 = 5;
	  float  fl = n1/n2;//storing int in float  
	  System.out.print(fl);//o/p is in float
	   

	}

}
