package week1.day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int firstnum=0;
      int secondnum=1;
      int thirdnum;
      int n=10;
      System.out.println(firstnum);
      System.out.println(secondnum);
      
    for (int i = 2; i <= n; i++) {
		thirdnum=firstnum+secondnum;
		System.out.println(thirdnum);
		firstnum=secondnum;
		secondnum=thirdnum;
	}
    		  
	}

}
