package edu.csupomona.cs356.iclicker;
/*
 * Sarmen Khodjasarian 
 * Cs356
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
 * This class implements iClicker interface
 */
public class IClickerService implements iClicker
{
	private Question question; 
	private int countA, countB, countC, countD; // counters for the different answers
	HashMap<Integer, Character> database = new HashMap<Integer, Character>(); // a hashmap to be my database

	/*
	 *returns the given question
	 */
	public Question getQuestion() 
	{
		return question;
	}
	/*
	 * sets a given question
	 */
	public void setQuestion(Question question)
	{
		this.question = question;		
	}
	/*
	 * used to count the submitted answer by the students to be used
	 * to put in statistically 
	 */
	public void countAnswers() 
	{
		countA = 0;
		countB = 0;
		countC = 0;
		countD = 0;
		
		for (int key : database.keySet())
		{
			if(database.get(key).equals('A')) 
			{
				countA += 1;
			}
			if(database.get(key).equals('B'))				
			{
				countB += 1;
			}
			if(database.get(key).equals('C')) 
			{
				countC += 1;
			}
			if(database.get(key).equals('D')) 
			{
				countD += 1;
			}
		}
	}
	/*
	 * checks if the student has submitted or not, if the student 
	 * has then it removes the student and submits the new submittion, 
	 * if not than just submits the student. then calls to counts the submitted answers
	 */
	public void sumbittedAnswers(int studentID, char answer) 
	{
		if(database.containsKey(studentID))
		{
			database.remove(studentID);
			database.put(studentID, answer);
		}
		else
			database.put(studentID, answer);
		
		countAnswers();
	}
	public String Result()
	{
		return 	"A." + countA + "\nB." + countB +"\nC." + countC +"\nD." + countD;
	}
}
