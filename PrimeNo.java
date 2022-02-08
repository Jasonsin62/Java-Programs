import java.util.*;
import java.util.Scanner;


class PrimeNo{ 
	static void checkPrime(int number){ 
		 
		 int flag=0;
		 if (number==0||number==1){
			 System.out.println(number+" is not 01 a Prime number");
		 }
		 else {
			 for(int i=2;i<number;i++){
				 if(number%i==0){
					System.out.println(number+" is not a Prime number ");
					flag=1;
					break;
					
				 }
		        }if(flag==0){
					System.out.println(number+" is a flag Prime number ");
				}
       }
				 
}
     
 public static void main(String args[]){
/*
	Scanner s=new Scanner(System.in);
	System.out.println("Please Enter a number ");
	int number= s.nextInt();
	checkPrime(number);*/
	
	/*checkPrime(1); 
	checkPrime(4); 
	checkPrime(7);
	checkPrime(13);
	*/
	int number=Integer.parseInt(args[1]);
	checkPrime(number);
    	}
 
}
