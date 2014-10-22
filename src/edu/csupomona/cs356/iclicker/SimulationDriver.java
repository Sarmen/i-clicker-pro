package edu.csupomona.cs356.iclicker;
/*
 * Sarmen Khodjasarian 
 * Cs356
 * 
 * Driver class that simulates the iclicker
 */
import java.util.*;

public class SimulationDriver 
{
	/*
	 * static method to help us give each student
	 * a multiple choice answer
	 */
	public static char randomMultipleChoiceAnswers() 
	{
		int randomChoice = (int)(Math.random()*4);
		switch(randomChoice) 
		{
			case 0:
				return 'A';
			case 1:
				return 'B';
			case 2:
				return 'C';
			case 3:
				return 'D';
		}
		return 'E';
	}
	
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		// generates random number of students and makes an array with that length
		int numOfStudents = 15 + (int)(Math.random()* 30);
		Student[] students = new Student[numOfStudents];
		//make the iclickerserive object
		IClickerService c = new IClickerService();
		//make a question object to give iclicker a question.
		Question q1 = new Question();
		
		//the question that will be submitted to iclickerservice
		q1.setQuestion("Is it a boy? \nA. Yes \nB. No \nC. Maybe \nD.Both A and B");
		c.setQuestion(q1);
		//prints out the question
		System.out.println(q1.getQuestion());
		
		//for loop to give each student a random ID and multipleChoiceAnswer
		// then submittes it to the submittedAnswers method to put in a hashmap
		for(int i = 0; i < numOfStudents; i++)
		{
			students[i] = new Student(r.nextInt(100), randomMultipleChoiceAnswers());
			c.sumbittedAnswers(students[i].getStudentID(), students[i].getAnswer());
		}
		
		//this result only prints out the statistics of the question. The results of this
		//is one submittion per students, even tho they might have submitted more than once
		System.out.println();
		System.out.println(c.Result());
		
		
//		test to make sure students get ids, and answers
//		the database one is to make sure there arent multiple
//		students in the hashmap when we count for each answer.
//		for(int i = 0; i < numOfStudents; i++)
//		{
//			System.out.println(students[i].toString());
//		}	
//		System.out.println("Print out whats in the hashMap" +c.database);
	}
}
