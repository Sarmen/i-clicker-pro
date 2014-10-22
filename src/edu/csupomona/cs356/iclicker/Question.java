package edu.csupomona.cs356.iclicker;
/*
 * Sarmen Khodjasarian 
 * Cs356
 * 
 * This class lets us set a question
 * and set an answer.
 */
public class Question 
{
	private String question;
	private char answer;
	
	public String getQuestion() 
	{
		return question;
	}
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	public char getAnswer() 
	{
		return answer;
	}
	public void setAnswer(char answer) 
	{
		this.answer = answer;
	}	
}
