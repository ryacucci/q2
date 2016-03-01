package things;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // gets initial variables   
Scanner scan = new Scanner(System.in);
System.out.println("Initial cost: ");
double init = scan.nextDouble();
System.out.println("percentage increase for tuition as decimal");
double percent = scan.nextDouble();
System.out.println("Repayment APR: ");
double apr = scan.nextDouble();
System.out.println("Term: ");
double term = scan.nextDouble();

int bterm; 

for (bterm =0;bterm<term;bterm++ ){
	//my best guess at the math
	// initial cost+(inital cost* apr*percent) iterated by the number of terms
double tuition = init +  (init*apr*percent);

System.out.println("The cost of your tuition is " + tuition);
}
    }
}



	

