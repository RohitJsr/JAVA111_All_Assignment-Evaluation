package com.masaiQ4;

public class Test implements Intr {
	
	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		 int i,m=0,flag=0;      
		  m=p/2;      
		  if(p==0||p==1){  
		   System.out.println(p+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(p%i==0){      
		     System.out.println(p+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(p+" is prime number"); }  
		  }//end of else  
		return null;
	}
}
