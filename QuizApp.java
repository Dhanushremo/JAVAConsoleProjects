package com.dhanush.javafullstack;

import java.util.Scanner;

class Quiz {
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
            else {
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
            else {
            	System.out.println("Sorry Worng Answer!");
            	op9 = true;
            }            
        }
  
}

public class QuizApp {

    public static void main(String[] args) {
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
                                System.out.println("-----THANK YOU-----");
                            }
                        }
                    }
                }
            }
        }
    }
}
