package edu.csupomona.cs356.iclicker;
import java.util.*;
public class SimulationDriver {

	public static void main(String[] args) 
	{
		String question;
		Scanner kb = new Scanner(System.in);
		IClickerService ic = new IClickerService();
		System.out.println("Enter the amount of students: ");
		int numS = kb.nextInt();
		kb.nextLine();
		System.out.println("Enter the question: ");
		ic.setQuestion(question = kb.nextLine());
		
		System.out.println("Answer 1: ");
		String q1 = kb.nextLine();
		System.out.println("Answer 2: ");
		String q2 = kb.nextLine();
		System.out.println("Answer 3: ");
		String q3 = kb.nextLine();
		
		
		Random r = new Random();
		
		List<Student> s = new ArrayList<Student>();
		
		for(int i = 0; i < numS; i++)
		{
			Student student = new Student(r.nextInt(500), r.nextInt(4-1)+1);
			s.add(student);
		}
		System.out.println(ic.getQuestion());
		System.out.println("1." + q1);
		System.out.println("2." + q2);
		System.out.println("3." + q3);
		
		for(int i = 0; i < numS; i++)
		{
			System.out.println("student #" + (i + 1) +  s.get(i));
		}
		
		
	}

}
