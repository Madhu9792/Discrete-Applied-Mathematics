package interfaces;

public class CountingProblem1 {

	public static void main(String[] args) {
		  int d1,d2,d3,d4,d5,d6; 
		  int sum=0; 
		  int n=0; 
		  
		  for (int j=100000; j<1000000; j++) 
		  { 
		      n=j;      // The six digits of n are d1,d2,d3,d4,d5,d6 
		      d1=n/100000; 
		      n=n-d1*100000; 
		      d2=n/10000; 
		      n=n-d2*10000; 
		      d3=n/1000; 
		      n=n-d3*1000; 
		      d4=n/100; 
		      n=n-d4*100; 
		      d5=n/10; 
		      d6=n%10; 
		      if ((d1!=d2) & (d2!=d3) & (d1!=d3) & (d4!=d5) & (d6%2==1)) 
		      { 
		        sum=sum+1; 
		   }  
		   } 
		   System.out.println("The required answer is "+ sum + "."); 

	}

}
