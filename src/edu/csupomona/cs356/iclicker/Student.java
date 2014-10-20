package edu.csupomona.cs356.iclicker;


public class Student 
{
	private int studentID;
	private int answer;
	public Student(int studentID, int answer)
	{
		this.studentID = studentID;
		this.answer = answer;
	}
	public int getStudentID() 
	{
		return studentID;
	}

	public void setStudentID(int studentID) 
	{
		this.studentID = studentID;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String toString()
	{
		return " student id is " + studentID + "|| answer " + answer;
	}
	
}
