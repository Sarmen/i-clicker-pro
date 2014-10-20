package edu.csupomona.cs356.iclicker;
import java.util.*;
public class SimulationDriver {

	public static void main(String[] args) 
	{
		String question;
		Scanner kb = new Scanner(System.in);
		IClickerService ic = new IClickerService();
		
		System.out.print("Enter the question: ");
		ic.setQuestion(question = kb.nextLine());
		
		System.out.print("Answer 1: ");
		String q1 = kb.nextLine();
		System.out.print("Answer 2: ");
		String q2 = kb.nextLine();
		System.out.print("Answer 3: ");
		String q3 = kb.nextLine();
		
		System.out.println(ic.getQuestion());
		System.out.println("1." + q1);
		System.out.println("2." + q2);
		System.out.println("3." + q3);
		
		
			
	}

}
