//Program using Assignment and Logical operators

public class OperatorsDemo{
	public static void main(String args[]){
		int num1=10;
		num1+=20;//30
		System.out.println(num1);
		num1-=10;//20
		System.out.println(num1);
		num1*=2;//40
		System.out.println(num1);
		num1/=5;//8
		System.out.println(num1);
		num1%=5;//3
		System.out.println(num1);

		//Logical operators
		boolean a=true;
		boolean b=false;
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a);
		System.out.println(!b);
		int num2=30;
		int num3=40;

		System.out.println(num1<num3||num1>num2);
		
		



	}
}