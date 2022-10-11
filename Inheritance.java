package pgm_task2;

import java.util.Scanner;

public class Inheritance {

	
	public static void main(String[] args) {
		System.out.println("1. For Single Level Inheritance Type 1");
		System.out.println("2. For Multi Level Inheritance Type 2");
		System.out.println("3. For Hierarchical Inheritance Type 3");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		

		
	    switch (x) {
	      case 1: 
	    	  SingleLevel SL=new SingleLevel();
	    	  SL.single(); 
	        break;
	        
	      case 2:
	    	  Multilevel ML=new Multilevel();
	    	  ML.multiL();
	        break;
	        
	      case 3:
	    	  
	    	  Hierarchical Hie=new Hierarchical();
	    	  Hie.hierarchicaL();
	        break;
	        
	      default:
	        System.out.println("Looking forward to the Range betwwen 1-3");
	    }  
	}

}



class Sample1
{
	void fo()
	{
		System.out.println("fofofof....");
	}
}

class SingleLevel extends Sample1
{
	void single()
	{
		System.out.println("single level : A sub class is inheriting the property from it super class is called single level inheritance.");
	}
}

class Multilevel extends SingleLevel
{
	void multiL()
	{
		System.out.println("Multi Level inheritanc : A sub class is inheriting the property from it super class,inturn this super class is inheriting the property from it's super class is called Multilevel inheritance .");
	}
}

class Hierarchical extends Sample1
{
	void hierarchicaL()
	{
		System.out.println("Heirarchical inheritance : multiple sub class is inheriting the property from onle one super class is called hierarchical inheritance.");
	}
}
