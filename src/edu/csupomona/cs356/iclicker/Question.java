package edu.csupomona.cs356.iclicker;

public interface Question 
{
	public String getQuestion();
	
	public void setQuestion(String s);
	
	public String getAnswers();
	
	public void setAnswers(String one, String two, String three);
}
