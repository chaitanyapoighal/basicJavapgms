//Program using Unary operator

public class UnaryEx{
	public static void main(String args[]){
		int num1=25;
		System.out.println(num1);
		//Post Increment
		int num2=num1++;
		System.out.println(num1+" "+num2);
		//System.out.println(num2);
		//Pre Increment
		num2=++num1;
		System.out.println(num1+" "+num2);
		char ch1='a';
  		char ch2=ch1++;
		System.out.println(ch1+" "+ch2);		

}
}