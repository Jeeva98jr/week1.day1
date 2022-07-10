package week1.day1;

import java.util.Iterator;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=89;
   boolean isprime=true;
   for (int i = 2; i < num; i++) {
	   if (num%i==0) {
		isprime=false;
		break;
	}
	
}
   
  
System.out.println(isprime);
	}

}
