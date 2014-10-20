package edu.csupomona.cs356.iclicker;


public class IClickerService implements Question 
{

	private String s;
	private String q1,q2,q3;
	
	public String getQuestion() 
	{
		return s;
	}

	public void setQuestion(String s) 
	{
		this.s = s;
	}

}
