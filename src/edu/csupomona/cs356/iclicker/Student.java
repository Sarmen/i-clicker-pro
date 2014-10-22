package edu.csupomona.cs356.iclicker;
/*
 * Sarmen Khodjasarian 
 * Cs356
 * 
 * Student class to let us create student Objects
 * with an id and answer
 */
public class Student 
{
	private int studentID;
	private char answer;
	
	public Student(int studentID, char answer)
	{
		this.studentID = studentID;
		this.answer = answer;
	}
	public Student() {
	}
	public int getStudentID() 
	{
		return studentID;
	}

	public void setStudentID(int studentID) 
	{
		this.studentID = studentID;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public String toString()
	{
		return "student id is " + studentID + "|| answer " + answer;
	}
	
}
