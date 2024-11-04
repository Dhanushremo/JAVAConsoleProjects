package com.dhanush.javafullstack;

import java.util.Scanner;

class Quiz {
	Scanner sc=new Scanner(System.in);
	String[] options;
	int point = 0;
	boolean op1, op2, op3, op4, op5, op6, op7, op8, op9,op10;

	public void q1() {
		System.out.println("Q1)Who is the AP CM");
	}
	public void o1() {
		options = new String[]{"1)JAGAN", "2)CHANDRABABUNAIDU", "3)YSR", "4)Dhanush", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op1 = false;
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			op1 = true;
			point++;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->JAGAN","2->CHANDHRABABUNAIDU"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==2) {
					op1=false;
					System.out.println("Congragulation you got one point");
					point++;
					op1=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op1 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)JAGAN->30%", "2)CHANDRABABUNAIDU->90%", "3)YSR->70%", "4)Dhanush->50%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op1=false;
				if(option3==2) {
					System.out.println("Congragulation you got one point");
					point++;
					op1=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op1 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op1=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op1 = true;
		}
	}

	public void q2() {
		System.out.println("Q2)Who is Captain of India");
	}

	public void o2() {
		options = new String[]{"1)VIRAT", "2)DHONI", "3)ROHIT", "4)Dhanush", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op2 = false;
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op2 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->DHONI","2->ROHITH"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				op2=false;
				if(option2==2) {
					System.out.println("Congragulation you got one point");
					point++;
					op2=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op2 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)VIRAT->30%", "2)DHONI->90%", "3)ROHITH->90%", "4)Dhanush->50%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op2=false;
				if(option3==3) {
					System.out.println("Congragulation you got one point");
					point++;
					op2=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op2 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op2=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op2 = true;
		}
	}

	public void q3() {
		System.out.println("Q3)Who Invented Java");
	}

	public void o3() {
		options = new String[]{"1)GamesGoosling", "2)GuidoVanRusoom", "3)Denis", "4)MSD", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op3 = false;
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			point++;
			op3 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->GamesGoosling","2->GuidoVanRusoom"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==1) {
					op3=false;
					System.out.println("Congragulation you got one point");
					point++;
					op3=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op3 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)GamesGoosling->85%", "2)GuidoVanRusoom->70%", "3)Denis->20%", "4)MSD->0%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op3=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op3=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op3 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op3=false;
		}

		else {
			System.out.println("Sorry Worng Answer!");
			op3 = true;
		}      
	}

	public void q4() {
		System.out.println("Q4)Today is what day");
	}

	public void o4() {
		options = new String[]{"1)Monday", "2)Tuesday", "3)Sunday", "4)Saturday", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op4 = false;
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op4 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->Sunday","2->Monday"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==1) {
					op4=false;
					System.out.println("Congragulation you got one point");
					point++;
					op4=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op4 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)Monday->15%", "2)Tuesday->50%", "3)Sunday->80%", "4)Saturday->30%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op4=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op4=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op4 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op4=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op4 = true;
		}       
	}

	public void q5() {
		System.out.println("Q5)What is Captial of India");
	}

	public void o5() {
		options = new String[]{"1)Jammu&Khashmir", "2)NewDelhi", "3)AndhraPradesh", "4)TamilNadu", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op5 = false;
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			point++;
			op5 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->Jammu&Khashmir","2->NewDelhi"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==2) {
					op5=false;
					System.out.println("Congragulation you got one point");
					point++;
					op5=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op5 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)Jammu&Khashmir->87%", "2)NewDelhi->98%", "3)AndhraPradesh->28%", "4)TamilNadu->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op5=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op5=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op5 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op5=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op5 = true;
		}      
	}

	public void q6() {
		System.out.println("Q6)Which is the MarkUpLanguage?");
	}

	public void o6() {
		options = new String[]{"1)HTML", "2)CSS", "3)JS", "4)JAVA", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op6 = false;
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			point++;
			op6 = true;
		}

		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->CSS","2->HTML"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==2) {
					op6=false;
					System.out.println("Congragulation you got one point");
					point++;
					op6=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op6 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)CSS->87%", "2)HTML->98%", "3)JS->28%", "4)JAVA->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op6=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op6=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op6 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op6=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op6 = true;
		}      
	}

	public void q7() {
		System.out.println("Q7)Which is not a KeyWord in java?");
	}

	public void o7() {
		options = new String[]{"1)try", "2)static", "3)ArrayList", "4)do", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op7 = false;
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op7 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->static","2->ArrayList"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==2) {
					op7=false;
					System.out.println("Congragulation you got one point");
					point++;
					op7=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op7 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)try->87%", "2)static->28%", "3)ArrayList->98%", "4)do->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op7=false;
				if(option3==3) {
					System.out.println("Congragulation you got one point");
					point++;
					op7=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op7 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op7=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op7 = true;
		}        
	}

	public void q8() {
		System.out.println("Q8)What is the OutPut for the below code");
	}

	public void o8() {
		System.out.println();
		System.out.println("byte a=10");
		System.out.println("byte a=20");
		System.out.println("byte c=a+b");
		System.out.println("System.out.println(c)");
		System.out.println();
		options = new String[]{"1)30", "2)-30", "3)RunTimeError", "4)CompileTimeError", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}

	}
	
	public void dispO8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op8 = false;
		if (option == 3) {
			System.out.println("Congragulation you got one point");
			point++;
			op8 = true;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->30","2->RunTimeError"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==2) {
					op8=false;
					System.out.println("Congragulation you got one point");
					point++;
					op8=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op8 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)30->90%", "2)-30->20%", "3)RunTimeError->90%", "4)CompileTimeError->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op8=false;
				if(option3==3) {
					System.out.println("Congragulation you got one point");
					point++;
					op8=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op8 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op8=false;
		}
		else{
			System.out.println("Sorry Worng Answer!");
			op8 = true;
		}            
	}

	public void q9() {
		System.out.println("Q9)Who won the IPL Trophy in 2016");
	}

	public void o9() {
		options = new String[]{"1)CSK", "2)SRH", "3)RCB", "4)KKR", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}
	}

	public void dispO9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op9 = false;
		if (option == 2) {
			System.out.println("Congragulation you got one point");
			op9 = true;
			point++;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->SRH","2->CSK"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==1) {
					op9=false;
					System.out.println("Congragulation you got one point");
					point++;
					op9=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op9 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)SRH->90%", "2)CSK->20%", "3)RCB->50%", "4)KKR->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op9=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op9=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op9 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op9=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op9 = true;
		}            
	}

	public void q10() {
		System.out.println("Q10)Who is the markedInterface in JAVA");
	}

	public void o10() {
		options = new String[]{"1)Serilaizable", "2)Runnable", "3)Comparable", "4)Set", "5)LifeLine", "6)Quit"};
		System.out.println("Options Are->");
		for (String s : options) {
			System.out.println(s);
		}            
	}

	public void dispO10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Option Here!!");
		int option = sc.nextInt();
		op10 = false;
		if (option == 1) {
			System.out.println("Congragulation you got one point");
			op10 = true;
			point++;
		}
		else if(option == 5) {
			options=new String[]{"1)50/50","2)AUDIENCE_POLL"};
			System.out.println("LIFELINE Options are->");
			System.out.println("Choose the option now");
			for(String s:options) {
				System.out.println(s);
			}
			int option1=sc.nextInt();
			if(option1==1) {
				System.out.println("You choosed the 50/50 so,we removed 2 incorrect options,now choose the CORRECT Option");
				System.out.println("ALL THE BEST!!");
				options=new String[] {"1->Serilaizable","2->Runnable"};
				for(String s:options) {
					System.out.println(s);
				}
				int option2=sc.nextInt();
				if(option2==1) {
					op10=false;
					System.out.println("Congragulation you got one point");
					point++;
					op10=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op10 = true;
				}
			}
			else {
				System.out.println("AUDIENCE POLL!!");
				System.out.println("Choose the Option now");
				options=new String[] {"1)Serilaizable->90%", "2)Runnable->75%", "3)Comparable->80%", "4)Set->10%"};
				for(String s:options) {
					System.out.println(s);
				}
				int option3=sc.nextInt();
				op10=false;
				if(option3==1) {
					System.out.println("Congragulation you got one point");
					point++;
					op10=true;
				}
				else {
					System.out.println("Sorry Worng Answer!");
					op10 = true;
				}

			}
		}
		else if(option==6) {
			System.out.println("YOU ARE SUCCESSFULLY EXITED");
			System.out.println("TOTAL POINTS YOU SCORED");
			System.out.println("-----"+point+"-----");
			op10=false;
		}
		else {
			System.out.println("Sorry Worng Answer!");
			op10 = true;
		}            
	}
	
	public void user() {
		System.out.println("---------QUIZE---------");
		System.out.println("Enter the USER details!!");
		System.out.println("NAME              ->");
		System.out.println("AGE               ->");
		System.out.println("GENDER(M/F/Others)->");
		String name=new Scanner(System.in).nextLine();
		int age=new Scanner(System.in).nextInt();
		String gen=new Scanner(System.in).nextLine();
		if(age>=18 &&  gen.equalsIgnoreCase("M")) {
			System.out.println("WELCOME Mr."+name+" now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST Mr."+name);
		}
		else if(age>=18 && gen.equalsIgnoreCase("F")) {
			System.out.println("WELCOME Mrs."+name+" now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST Mrs."+name);
		}
		else {
			System.out.println("WELCOME "+name+" now you can Answer the below Qestions");
			System.out.println("ALL THE VERY BEST "+name);
		}
	}

}
class QuizDemo{
	public void init() {
		
		Quiz q = new Quiz();
		q.q1();
		q.o1();
		q.dispO1();

		if (q.op1) {
			q.q2();
			q.o2();
			q.dispO2();

			if (q.op2) {
				q.q3();
				q.o3();
				q.dispO3();

				if (q.op3) {
					q.q4();
					q.o4();
					q.dispO4();

					if (q.op4) {
						q.q5();
						q.o5();
						q.dispO5();

						if (q.op5) {
							q.q6();
							q.o6();
							q.dispO6();

							if (q.op6) {
								q.q7();
								q.o7();
								q.dispO7();

								if (q.op7) {
									q.q8();
									q.o8();
									q.dispO8();
								}

								if (q.op8) {
									q.q9();
									q.o9();
									q.dispO9();
								}

								if (q.op9) {
									q.q10();
									q.o10();
									q.dispO10();
								}
								System.out.println("Questions Completed");
								System.out.println("TOTAL POINTS YOU SCORED");
								System.out.println("-----"+q.point+"-----");
								System.out.println("--THANK YOU--");
							}
						}
					}
				}
			}
		}
	}
}
public class QuizApp {

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.user();
		QuizDemo qd=new QuizDemo();
		try {
			qd.init();
		}
		catch(Throwable e) {
			System.out.println("INVALID!! The REASON "+e);
			System.out.println("Re-Attend the QUIZ OnceAgain");
			try {
				qd.init();
			}
			catch(Throwable e1) {
				System.out.println("INVALID!! The REASON "+e);
				System.out.println("Re-Attend the QUIZ OnceAgain");
				try {
					qd.init();
				}
				catch(Throwable e2) {
					System.out.println("INVALID!! The REASON "+e);
					System.out.println("YOU ARE CROSSED THE LIMITS");
					System.out.println("YOU ARE BLOCKED");
				}
			}
		}
	}
}
