package com.dhanush.javafullstack;

import java.util.Scanner;

class Cal{
	int a;
	int b;
	int result1,result2,result3,result4;
	public void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		a=sc.nextInt();
		System.out.println("Enter the second Number");
		b=sc.nextInt();
	}
		public void add() {
			result1=a+b;
		}
		public void sub() {
			result2=a-b;
		}
		public void div() {
			result3=a/b;
		}
		public void mul() {
			result4=a*b;
		}
		public void addDisp() {
			System.out.println("ADDITION of "+a+" and "+b+" is-> "+ result1);
		}
		public void subDisp() {
			System.out.println("SBTRACTION of "+a+" and "+b+" is-> "+ result2);
		}
		public void mulDisp() {
			System.out.println("MULTIPLICATION of "+a+" and "+b+" is-> "+ result3);
		}
		public void divDisp() {
			System.out.println("DIVISION of "+a+" and "+b+" is-> "+ result4);
		}
}
 class SimpleCalculatorApp	{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey How many opearions you want to perform please tell me!!");
		int i=sc.nextInt();
		if(i==0) {
			System.out.println("opps! Sorry You cannot perform any operation!!");
		}
		while(i!=0) {
			Cal c=new Cal();
			c.acceptInput();
			System.out.println("ADDITION       ENTER + SYMBOL");
			System.out.println("SUBTRACTION    ENTER - SYMBOL");
			System.out.println("MULTIPLICATION ENTER * SYMBOL");
			System.out.println("DIVISION       ENTER / SYMBOL");
			System.out.println("Now Enter Arithimetic Symbol to perform an operation");
			String symbol=sc.next();
			switch(symbol) {
			case "+":
				c.add();
				c.addDisp();
				break;
			case "-":
				c.sub();
				c.subDisp();
				break;
			case "*":
				c.mul();
				c.mulDisp();
				break;
			case "/":

				try {
					c.div();
					c.divDisp();
				}
				catch(Exception e) {
					System.out.println("Sorry Dhanush We cant divid by 0");
					System.out.println("The reason "+ e);
				}
				break;
			default:
				System.out.println("OPPS! SORRY, It's OUT OF SYMBOL");
			
			}
			i--;
			System.out.println("-------------------------------------");
		}

	}

}
