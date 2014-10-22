package edu.csupomona.cs356.iclicker;
/*
 * Sarmen Khodjasarian 
 * Cs356
 * 
 * Interface for IClickerService
 */
import java.util.HashMap;

public interface iClicker 
{
	public Question getQuestion();
	public void setQuestion(Question question);
	public void sumbittedAnswers(int studentID, char answer);
	public void countAnswers();
}
